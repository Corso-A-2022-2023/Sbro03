public class EserciziMatrici{
	
	static void stampaArray(int [] array){
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	
	//Esercizio 1
	//Punto 1
	
	static int[] clonaArray(int[] a){
		int length;
		int [] copia;

		if(a == null){
			length = 0;
			copia = new int [length]; 
			copia = null;
		}else{
			length = a.length;
			copia = new int [length];
			for(int i = 0;i < a.length; i++){
				copia[i] = a[i];
			}
		}	
		
		
		return copia;
	}
	
	static int[][] initAlt(int[] p, int[] d, int n){
		int [][] ris = new int[n][];
		
		for(int i = 0; i < n; i++)
			if(i % 2 == 0)
				ris[i] = clonaArray(p);
			else
				ris[i] = clonaArray(d);
		
		
		return ris;
	}
	
	//Punto 2
	
	static int contaElementi(int[][] m){
		int ris = 0;
		int length = 0;
		for(int i = 0; i < m.length; i++){
			if(m[i] == null)
				length = 0;
			else
				length = m[i].length;
			ris += length;
		}
		return ris;
	}
	
	//Punto 3
	
	static int[] linearizzaRighe(int [][] m){
		int length = contaElementi(m);
		int [] ris = new int[length];
		int pos = 0; //indica la posizione in ris[]
		
		if(m == null)
			return null;
		
		for(int e = 0; e < m.length; e++){
			if(m[e] != null)
				for(int j = 0; j < m[e].length; j++){
					ris[pos++] = m[e][j]; 
				}
		}
		
		return ris;	
	}
	
	//Punto 4
	
	static String toString(int[][]m){
		String ris = "";
		int pos = 0;
		char virgola;
		if(m != null){
			for(int i = 0; i < m.length; i++){
				ris += '{';
				if(m[i] != null){
					for(int j = 0; j < m[i].length; j++){
						ris += m[i][j];
						if(j != m[i].length-1)
							ris += ',';
					}
				}
				if(i != m.length - 1)
					virgola = ',';
				else
					virgola = ' ';
				ris = ris + '}' + virgola + '\n';
				
			}
		}else{
			ris = "";
		}
		return ris;
	}
	
	//Esercizio 2
	
	//Punto 1
	
	static int maxRowLen(int [][] m){
		int ris = 0;
		
		if(m != null){	
			for(int i = 0; i < m.length; i++){
				if(m[i] != null){
					ris = m[i].length > ris ? m[i].length : ris;
				}	
			}
		}
		
		return ris;
	}
	
	//Punto 2
	
	static int[] sommaRighe(int[][]a){
		if(a == null)
			return new int[1];
		
		int [] ris = new int[maxRowLen(a)];
		
		
		
		return ris;
	}
	
	//Esercizio 3
	
	static void azzerraColonnaMax(int[][] mat){
		
	}
	
	//Esercizio 4
	static boolean domRiga(int [] a, int n){
		boolean flag = true;
		for(int i = 0; i < a.length && flag; i++){
			flag = a[i] % n == 0;
		}
		return flag;
	}
	
	static boolean domMat(int [][] m){
		boolean flag = false;
		boolean dominante = true;
		if(m != null){
			for(int i = 0; i < m.length && dominante; i++){
				if(m[i] != null){		
					for(int j = 0; j < m[i].length && !flag; j++)
						flag = domRiga(m[i], m[i][j]);
					dominante = flag;
				}
			}
		}
		return dominante;
	}
	
	//Esercizio 5
	
	static void incrementaRiga(int[] in, int[] out, int k){
		if(in != null){
		  if(k < 0)
			  return;
		  else
			out[k] = in[k] + 1;
			incrementaRiga(in, out, k - 1);
		}
	  }
	  
	  public static int[][] incrementa(int[][] imat){
		if(imat == null)
		  return null;
		else
		  return incrementaRic(imat, 0);
	  }
	  
	  public static int[][] incrementaRic(int[][] imat, int i){
		
		if(i == imat.length){
			return new int[imat.length][];
		}else{
		  int [][] omat = incrementaRic(imat, i+1);
		  if(imat[i] != null){
			  omat[i] = new int[imat[i].length];
			  incrementaRiga(imat[i], omat[i], imat[i].length-1);
		  }
		  return omat;
		}
	  }
	  
	  //Esericizio 6
	  
	  static int conteggio(int[] a, int k){
		  if(a == null)
			  return 0;
		  else return conteggioDicotomico(a, k, 0, a.length-1);
	  }
	  
	  static int conteggioDicotomico(int [] a, int k, int l, int r){
		  if(r == l){
			  if(a[l] == k)
				return 1;
			  else return 0;
		  }else{
			  int m = (l + r) / 2;
			  return conteggioDicotomico(a, k, l, m) + conteggioDicotomico(a, k, m+1, r);
		  }
	  }
	
	public static void main(String[] args){
		/*
		Stampa esercizio 1.1
			int [] p = {0,0,0,0,0};
			int [] d = {1,1,1,1,1};
			
			int [][] alt = initAlt(p,d,5);
			MetodiArray.stampaMatrice(alt);
		*/
		
		/*
		Stampa esercizio 1.2
			int[][] m = {
				{1,2,3,4,5,6,7,8,9},
				{1,2,3,4,5,6,7},
				null,
				{1,2},
				{1}
			};
		System.out.print(contaElementi(m));
		*/
		
		/*
		Stampa esercizio 1.3
			int [][] m = {
				{1,2,3,4,5,6,7,8,9,10},
				{1,2,3},
				null,
				{1},
				{1,2,3,4,5,6,7,8,9,10,11,12},
				{1,2,3,4,5,6}
			};
			System.out.println(contaElementi(m));
			int [] array = linearizzaRighe(m);
			for(int i = 0; i < array.length; i++){
				System.out.print(array[i] + " ");
			}
		*/
		
		/*
		Stampa esercizio 1.4
			int [][] m = {
					{1,2,3,4,5,6,7,8,9,10},
					{1,2,3},
					{0},
					{1},
					{1,2,3,4,5,6,7,8,9,10,11,12},
					{1,2,3,4,5,6}
				};
			String ris = toString(m);
			System.out.print(ris);
		*/
		
		
		/*//Stampa fine esercizio 1
			int[] a1 = {3, 5, 7}, a2 = {2, 10, 8, 9}, a3 = {8};
			int[][] m1 = initAlt(a1, a2, 6), m2 = initAlt(a3, null, 5);
			int[][] m3 = initAlt(null, a2, 4);
			
			String ris1 = toString(m1);
			String ris2 = toString(m2);
			String ris3 = toString(m3);
			
			System.out.println(ris1);
			System.out.println(ris2);
			System.out.println(ris3);
			
			stampaArray(linearizzaRighe(m1));
			stampaArray(linearizzaRighe(m2));
			stampaArray(linearizzaRighe(m3));
		*/
		
		
		/*//Stampa esercizio 2.1
			int [][] m = {
						{1,2,3,4,5,6,7,8,9,10},
						{1,2,3},
						null,
						{1},
						{1,2,3,4,5,6,7,8},
						{1,2,3,4,5,6}
					};
				int[][] a = null;
				String ris = toString(m);
				System.out.print(ris);
			
			System.out.print(maxRowLen(m));
		*/
		
		/*//Stampa esercizio 2.2
			int [][] m = {
							{1,2,3,4,5,6,7,8,9,10},
							{1,2,3},
							null,
							{1},
							{1,2,3,4,5,6,7,8,9,10,11,12},
							{1,2,3,4,5,6}
						};
			int [][] a = null;
			int [] array = sommaRighe(m);
			for(int i = 0; i < array.length; i++){
				System.out.print(array[i] + " ");
			}
		*/
		/*int[] a1 = {3, 5, 7}, a2 = {2, 10, 8, 9}, a3 = {8};
			int[][] m1 = initAlt(a1, a2, 6), m2 = initAlt(a3, null, 5);
			int[][] m3 = initAlt(null, a2, 4);
			int[][] m4 = { {2,5,6}, {3,7,8,9,1}, {0,2}, {0,3,9,1} };
			
			int[] ris1 = sommaRighe(m1);
			int[] ris2 = sommaRighe(m2);
			int[] ris3 = sommaRighe(m3);
			int[] ris4 = sommaRighe(m4);
			
			System.out.println(toString(m2));
			stampaArray(ris1);
			stampaArray(ris2);
			stampaArray(ris3);
			stampaArray(ris4);*/
			
		/*int[][] m5 = { {1, 5, 10, 7}, {3, 12, 21, 30}, {5, 10, 20, 30} }; // true
		int[][] m6 = { {4, 7, 2, 5}, {7, 9, 20, 12}, {5, 8, 11, 21} }; // false
		
		System.out.println(toString(m5));
		System.out.println(toString(m6));
		
		System.out.println(domMat(m5));
		System.out.println(domMat(m6));*/
		
		/*
		Stampa Esercizio 5
			int[] a1 = {3, 5, 7}, a2 = {2, 10, 8, 9}, a3 = {8};
			int[][] m1 = initAlt(a1, a2, 6), m2 = initAlt(a3, null, 5);
				int[][] m3 = initAlt(null, a2, 4);
				int[][] m4 = { {2,5,6}, {3,7,8,9,1}, {0,2}, {0,3,9,1} };
			
			System.out.println(toString(m1));
			System.out.println(toString(incrementa(m1)));
			
			System.out.println(toString(m2));
			System.out.println(toString(incrementa(m2)));
			
			System.out.println(toString(m3));
			System.out.println(toString(incrementa(m3)));
			
			System.out.println(toString(m4));
			System.out.println(toString(incrementa(m4)));
		*/
		
		int[] a4 = { 3, 5, 3, 2, 3, 6, 3, 2, 3, 3, 8, 3};
		System.out.println(conteggio(a4, 3) == 7);
		System.out.println(conteggio(a4, 2) == 2);
	}
}
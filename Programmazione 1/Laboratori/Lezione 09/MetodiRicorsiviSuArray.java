public class MetodiRicorsiviSuArray{
	
	//Punto 1
	
	static boolean tuttiPari(int [] a){
		return tuttiPari(a,a.length-1);
	}
	
	static boolean tuttiPari(int[] a, int i){
		if(a != null && i > 0){
			return a[i] % 2 == 0 && tuttiPari(a,i-1);
		}else{
			return true;
		}
	}
	
	//Punto 2
	
	static boolean esisteMultiplo(int[] a, int m){
		return esisteMultiplo(a,m,0);
	}
	
	static boolean esisteMultiplo(int [] a, int m, int i){
		if(a != null && i < a.length){
			return a[i] % m == 0 || esisteMultiplo(a,m,i+1);
		}else{
			return false;
		}	
	}
	
	//Esercizio 5
	
	static int sommaDispari(int [] a){
		if(a == null || a.length == 0) 
			return 0;
		else
			return sommaDispari(a, 0, a.length-1);	
	}
	
	static int sommaDispari(int [] a, int sx, int dx){
		if(sx == dx)
			return a[sx] % 2 != 0 ? a[sx] : 0; 
		else
			return sommaDispari(a, sx, (sx + dx)/2) + sommaDispari(a, (sx + dx)/2 +1, dx);
	}
	
	//Esercizio 6
	
	static int indiceMassimo(int [] a){
		if(a == null || a.length == 0) 
			return -1;
		else
			return indiceMassimo(a, 0, a.length-1);	
	}
	
	static int indiceMassimo(int [] a, int sx, int dx){
		if(sx == dx)
			return sx; 
		int m = (sx + dx)/2;
		if(a[sx] < a[m]){
			return indiceMassimo(a,  sx, m);
		}else{
			return indiceMassimo(a, m+1, dx);
		}

	}
	
	//Esercizio 7
	
	static int [] filtraMaggioriDi(int [] a, int m){
		if(a == null || a.length == 0) 
			return new int[0];
		else
			return filtraMaggioriDi(a,m, a.length - 1, 0);	
	}
	
	static int [] filtraMaggioriDi(int [] a, int m, int pos, int count){
		if(pos < 0){
			return new int[count];
		}else{
			if(a[pos] > m){
				int [] array = filtraMaggioriDi(a,m,pos-1, count+1);
				array[count] = a[pos];
				return array;
			}else{
				int [] array = filtraMaggioriDi(a,m,pos-1, count);
				return array;
			}
		}
	}
	
	//Esercizio 8
	
	public static int[] filtraPari(int[] a){
		if(a == null || a.length == 0)
			return null;
		return filtraPari(a, 0, a.length-1, 0);
	}
	
	public static int[] filtraPari(int[] a, int sx, int dx, int count){
		
	}
	
	public static void main(String[] args){
		
		/*
		Stampa per il punto 1
		
			int [] a = LeggiArray.leggiArrayInt();
			System.out.println(tuttiPari(a));
		*/
		
		/*
		Stampa per il punto 2
			int [] a = LeggiArray.leggiArrayInt();
			System.out.print(esisteMultiplo(a,5));
		*/
		
		/*
		Stampa esercizio 5
			final int[] a0 = {0,1,2,3,4,5,6,7}; // 16
			final int[] a1 = {3,7,9,4,5,12,11}; // 35
			final int[] a2 = null; // 0
			final int[] a3 = {0,10,40,60,20}; // 0
			
			System.out.println(sommaDispari(a0));
			System.out.println(sommaDispari(a1));
			System.out.println(sommaDispari(a2));
			System.out.println(sommaDispari(a3));
		*/
		
		/*
		Stampa esercizio 6
			final int[] altezze = {5895, 4810, 6194, 4897, 4884, 8848, 6962};
			final String[] nomi = {"Kilimangiaro", "Monte Bianco", "Monte Denali","Massiccio Vinson", "Puncak Jaya", "Everest", "Aconcagua"};
			
			int pos = indiceMassimo(altezze);
			System.out.print(nomi[pos] + " " + altezze[pos] + "m");
		*/
		
		/*
		Stampa esercizio 7
			final int[] a0 = {0,1,2,3,4,5,6,7}; // 16
			final int[] a1 = {3,7,9,4,5,12,11}; // 35
			final int[] a2 = null; // 0
			final int[] a3 = {0,10,40,60,20}; // 0
			
			LeggiArray.stampaArrayInt(filtraMaggioriDi(a0,3));
			LeggiArray.stampaArrayInt(filtraMaggioriDi(a1,3));
			LeggiArray.stampaArrayInt(filtraMaggioriDi(a2,3));
			LeggiArray.stampaArrayInt(filtraMaggioriDi(a3,3));
		*/
		final int[] a0 = {0,1,2,3,4,5,6,7};
		LeggiArray.stampaArrayInt(filtraPari(a0));
	}
}
public class MetodiSuArray{
	
	//Esercizio 1
	
	static int[] initArray(){
		int [] array; // inizializzo l'array
		System.out.println("Metti un numero per la lunghezza dell'array");
		int length = SIn.readInt(); // leggo da input la lunghezza dell'array
		System.out.println();
		if(length < 0){
			return null;
		}
		array = new int[length];
		//ciclo for per chiedere all'utente i valori da mettere nell'array
		for(int i = 0; i < length; i++){ 
			System.out.println("Metti un numero");
			int n = SIn.readInt(); //il valore che l'utente metterà con l'input
			array[i] = n; //assegno al "quadrato" in posizione i il valore di n 
		}
		
		return array; //ritorno il nuovo array creato
	}
	
	static void stampaArrayInt(int [] a){
		System.out.println("Ecco il tuo array");
		//ciclo for per stampare uno alla volta i valori nella posizione i
		for(int i = 0; i < a.length; i++){
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	
	//Esercizio 2
	
	static void copiaElementi(int[] from, int [] to){
		if(from.length == to.length){
			for(int i = 0; i < from.length; i++){
				to[i] = from[i];
			}
		}else
			return;
		if(from == null)
			to = from;
	}
	
	static int[] clonaArray(int[] a){
		int length = a.length;
		int[] clone;
		clone = new int[length];
		
		if(a == null)
			return null;
		else{
			copiaElementi(a,clone);
			return clone;
		}
	}
	
	//Esercizio 3
	
	static int[] filtroMinoriDi(int [] a, int limSup){
		int length = 0; // sarà la lunghezza dell'array in uscita
		/*
			Questo ciclo for serve per aumentare di uno il valore di length
			ogni volta che un elemento di a soddisfa la condizione a[i] < limSup.
			In questo modo l'array in uscita avrà il numero giusto di "slot" per 
			mettere i valori che soddisfano la condizione.
			
			PS. Lo stesso vale anche per i prossimi metodi, poichè chiedono 
				la stessa cosa. Non ho voglia di riscrivere questo mappazone
		*/
		for(int i = 0; i < a.length; i++){
			if(a[i] < limSup){
				length++;
			}
		}
		
		int [] b = new int [length];
		int pos = 0;
		
		for(int e = 0; e < a.length; e++){
			if(a[e] < limSup){
				b[pos] = a[e];
				pos++;
			}
		}

		return b;
	}
	
	static int [] filtroIntervalloDisp(int [] a, int min, int max){
		int length = 0;
		for(int i = min; i <= max; i++){
			if(a[i] % 2 != 0){
				length++;
			}
		}
			
		int [] b = new int [length];
		int pos = 0;
		for(int e = min; e <= max; e++){
			if(a[e] % 2 != 0){
				b[pos] = a[e];
				pos++;
			}
		}
		
		return b;
	}
	
	static boolean[] trasduttore(int [] a, int limSup){
		int length = 0;
		for(int i = 0; i < a.length; i++){
			if(a[i] <= limSup){
				length++;
			}
		}
		
		boolean [] b = new boolean [length];
		
		for(int e = 0; e < length; e++){
			b[e] = a[e] <= limSup;
		}
		return b;
	}
	/*
		Non si può usare stampaArrayInt perchè chiede come argomento 
		un array di interi e non di boolean
	*/
	static void stampaArrayBoolean(boolean [] a){
		System.out.println("Ecco il tuo array");
		//ciclo for per stampare uno alla volta i valori nella posizione i
		for(int i = 0; i < a.length; i++){
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	
	//Esercizio 4
	
	//Metodi in maniera iterattiva
	static boolean eqArray(int [] a, int [] b){
		boolean flag = true;
		if(a == null || b == null){
			if(a == b){
				return true;
			}else{
				return false;
			}
		}else if(a.length == b.length){
			for(int i = 0; i < a.length && flag; i++)
				flag = a[i] == b[i];
		}else{
			flag = false;
		}
		
		return flag;
	}
	
	static boolean tuttiPariMaggioriDi(int [] a, int n){
		boolean flag = true;
		
		if(a == null || a.length == 0)
			return false;
		else{
			for(int i = 0; i < a.length && flag; i++){
				flag = (a[i] % 2 == 0) && (a[i] > n);
			}
		}
		return flag;
	}
	
	//Metodi in maniera ricorsiva
	
	static boolean eqArray(int [] a, int [] b, int i){
		if(a == null || b == null){
			if(a == b){
				return true;
			}else{
				return false;
			}
		}else if(a.length == b.length){
			if(i == a.length){ // caso base
				return true;
			}else{
				return a[i] == b[i] && eqArray(a,b,i+1);  //passo induttivo
			}
		}else return false;
	}
	
	static boolean tuttiPariMaggioriDi(int [] a, int n, int i){
		if(a == null || a.length == 0)
			return false;
		else{
			if(i == a.length){ //caso base
				return true;
			}else{
				return (a[i] % 2 == 0 && a[i] > n) && tuttiPariMaggioriDi(a,n,i+1);
			}
		}
	}
	
	//Esercizio 5
	
	static int indiceSubSeq(int [] a, int [] b){
		int indice = -1;
		int [] ar = new int [b.length];
		int [] indexes = new int [b.length];
		if(a.length > b.length){
			for(int i = 0; i < a.length && indexes[b.length - 1] == 0; i++){
				for(int e = 0; e < ar.length; e++){
					if(b[e] == a[i]){
						ar[e] = a[i];
						indexes[e] = i;
					}
				}
				if(eqArray(b, ar)){
					indice = indexes[0];
				}else{
					indice = -1;
				}
			}
		}else{
			indice = -1;
		}
		return indice;
		//return indexes;
	}
}
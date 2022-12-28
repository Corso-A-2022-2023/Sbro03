public class NumeriPrimi {
	
	public static boolean verificaPrimalita(int n){
		
		for(int i = 2; i < n; i++){
			if(n % i == 0)
				return false;
		}
		return true;
		
		/*
			Un numero primo per definizione è un numero che ha come divisori
			sè stesso e 1. Con il ciclo for controllo se ci sono divisori 
			minori di n. Se ci sono il metodo ritorna false altrimenti true
		*/
	}
	
	public static void sequenzaPrimi(int n){
		for(int i = 2; i < n; i++){
			if(verificaPrimalita(i))
				System.out.print(i + " ");
		}
		/*
			Con questo ciclo for controllo se i numeri da 2 a n sono primi.
			Per fare questo, controllo tramite se il numero i è primo usando 
			il metodo verificaPrimalita(). Se i è primo lo stampo altrimenti 
			non lo stapmo
		*/
	}
	
	public static void main(String[] args){
		System.out.println("Metti un numero intero");
		int n = SIn.readInt();
		System.out.println();
		sequenzaPrimi(n);
	}
}
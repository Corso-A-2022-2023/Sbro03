public class SommeCifre{
	
	public static int numeroNcifre(int n){
		int ris = n; 

		for(int i = 1; i < n; i++){
			ris = (ris * 10) + n; 
		}
		return ris;
	}
	// ripetere i singoli numeri
	
	public static void somma(int n){
		int somma = 0;
		
		for(int i = 1; i <= n; i++){
			somma = somma + numeroNcifre(i);
		}
		System.out.print("Somma: " + somma);
	}
	
	public static void main(String[] args){
		
		int n = SIn.readInt();
		
		if(n >= 1 && n <= 9){
			//blocco
			somma(n);
			
		}else{
			System.out.println("Numero non accettato");
			n = SIn.readInt();
		}
	}
}
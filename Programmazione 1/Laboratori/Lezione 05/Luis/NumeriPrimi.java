public class NumeriPrimi{
	public static void main (String [] args){
		int numero = 3;// numero dichiarato
		verificaPrimalita(numero);// chiamata metodo verificaPrimalita con parametro il numero dichiarato
	}
	static void verificaPrimalita(int n){
		/*
		dichiarazione della funzione tipo vuota verificaPrimalita
		con un parametro di tipo intero		
		*/
		int count=0;//count = 0
		for(int i =1;i<100;i++){
			/*for per i primi 100 numeri primi*/
			 count = 0; //ogni volta count torna a 0
			for(int j=1;j<=i;j++){
				/*for per il confronto tra i e j*/
				if(i%j==0){
					/*se i modulo i e j da resto 0*/
					count++;//allora count somma +1
				}
			}
			if(count==2){
				/*se il count è uguale a due allora */
				System.out.println(i);//stampa numero primo
				if(i == n){
					/*se i uguale a n parametro allora*/
					System.out.println(n+" Primo");//di che è primo il numero inserito
				}
			}
		}
	}
}
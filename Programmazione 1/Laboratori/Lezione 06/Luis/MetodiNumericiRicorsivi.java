public class MetodiNumericiRicorsivi{
	public static void main (String [] args){
		int a = 5;
		int b = 6;
		int c = 2;
		System.out.println(esponenziale(a,b));
		System.out.println(somma(a,b));
		System.out.println(prodottoMultipli(a,b,c));
		System.out.println(stampaInteroAlRovescio(a));
	}
	public static int esponenziale(int b, int e){
		if(e == 0){
			return 1;
		}
		else if(e ==1){
			return b;
		}
		else{
			return b*esponenziale(b,e-1);
			/*
			b= 5
			e = 5
			f(n)= n^2	0^2 = 0
			f(n+1) = (n+1)^2 = n^2 + 2n +1
			f(n+1) = f(n)+2n+1 = (n+1)^2		
			f(n) = f(n)= (n+1)^2	/2n+1	
			*/
		}
	}
	public static int somma (int a,int b){
		/*Creazione della funzione somma di tipo intero con parametri a e b di tipo intero*/
		if(a == 0){
			/*if condizione quando la a arriva a 0 allora : */
			return b;//restituisci la somma
		}
		else{
			return somma(a-1,b+1);//la a deve decrementare finchè arriva a 0 e la b incrementa di 1 fino ad arrivare la somma
		}
	}
	public static int prodottoMultipli(int n , int m , int q){
		/* funzione per i prodotti dei multipli con parametri interi n m q*/
		if(n>m){
			/*condizione base se n >m  allora*/
			return 1;//restituisci 1
		}
		else{
			/*altrimenti*/
			if(n%q == 0){
				/*se n è multiplo di q allora:*/
				return n*prodottoMultipli(n+1,m,q);//moltiplico la n e incremento la somma di n di 1
			}
			else{
				/*altrimenti*/
				return prodottoMultipli(n+1,m,q);//solo incrementa n+1
			}
		}
	}
	public static int stampaInteroAlRovescio(int n){
		/*funzione stampaInteroAlRovescio con parametro n tipo intero */
		if(n==0){
			/*condizione base se la n == 0 allora:*/
			return 0;//restituisci 0;
		}
		else{
			/*altrimenti :*/
			System.out.print(n);//stampa n 
			return stampaInteroAlRovescio(n-1);//e restituisci la decrementazione n - 1
		}
	}
}
	
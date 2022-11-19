import java.util.Scanner;
public class SommeCifre{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci n compreso tra 1 e 9");
		int numero = input.nextInt();
		if(n>=1||n<=9){
			/*
			Se il numero comprende tra 1 e 9 allora
			*/
			System.out.println("Il risultato e' : " + numeroNCifre(numero));//Stampa a video la funzione
		}
		else{
			/* Altrimenti : */
			System.out.println("Errore inserisci un numero diverso da 1 a 9");//Errore sul numero inserito
		}
	}
	public static int numeroNCifre(int n){
		/*
		Creazione della funzione numeroNCifre con parametro n per passare il numero n
		*/
		int somma = 0;// somma =0
		for(int i = 0; i < n; i++){
			/*
			ciclo for per arrivare fino al valore inserito
			*/
			somma = 10*somma+n;//Formula per la somma 
		}
		return somma;//restituisci il risultato della somma
	}
}
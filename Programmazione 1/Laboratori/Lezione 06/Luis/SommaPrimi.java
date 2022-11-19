import java.util.Scanner;
public class SommaPrimi{
	public static void main(String [] args){
		/*l'esercizio chiede di verificare queste condizioni booleane se sono true*/
		System.out.println(sommaPrimi(0)==0);
		System.out.println(sommaPrimi(3)==10);
		System.out.println(sommaPrimi(9)==100);
	}
	public static int sommaPrimi(int n){
		int i = 2;//escludendo l'1 si parte da 2
		return sommaPrimiRicorsione(i,n);//entra nella funzione sommaPrimiRicorsione per fare la somma 
	}
	public static int sommaPrimiRicorsione(int n,int i){
		/*se il valore iniziale è  0 allora */
		if(i==0){
			return 0;//restituisci 0
		}
		if(verificaPrimi(n,n-1)){
			/*dentro l'if si è messo la funzione verificaPrimi con parametri n e n-1 
			e la condizione viene accettata perchè è booleana*/
			/*se  il numero inserito è primo allora :*/
			return n+ sommaPrimiRicorsione(n+1,i-1);//sommi n e restituisci l'incremento di 1 a n e decrementi i-1;
		}
		else{
			/*altrimenti se non è primo allora : */
			return  sommaPrimiRicorsione(n+1,i);//incrementa solo di 1 alla n e non sommi
		}
	}
	/*Algoritmo per i numeri primi*/
	public static boolean verificaPrimi(int n , int k){
		/*verificaPrimi è la funzione per individuare il numero primo :*/
		if(k<=1){
			/*se k che è n-1 non è minore e uguale a 1 allora */
			return true;//restituisci true
		}
		//altrimenti
		return (n%k!=0) && verificaPrimi(n,k-1);//fai il decremento di k di uno fino a farla vera
	}
}
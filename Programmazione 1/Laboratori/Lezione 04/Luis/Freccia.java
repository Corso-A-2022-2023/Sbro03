import java.util.Scanner;
public class Freccia{
	public static void main (String [] args){
		Scanner input = new Scanner (System.in);
		System.out.println("Inserisci il numero per creare la freccia : ");
		int numero = input.nextInt();
		int i =0;//riga
		int j = 0;//colonna
		while(i<numero){
			/*
			Mentre la i non raggiune il numero inserito fai:
			*/
			if(i == j){
				/*
				Se la riga e la colonna corrispondo allora:
				*/
				System.out.print("**");//Stampi due **
				System.out.println();//fai una nuova linea
				j=0;//torna colonna numero 0
				i++;//incremento della riga
			}
			else{
				/*
				Altrimenti :
				*/
				System.out.print(".");//Stampi .
				j++;//incremento della colonna
			}
		}
		//i = 5 j = 0
		while(i!=0){
			/*
			Mentre la i non è diversa da 0 allora:
			*/
			if(i != j){
				/*
				se la colonna è diversa dalla riga allora:
				*/
				System.out.print(".");//Stampi punto
				j++;//incrementa la colonna
			}
			else{
				/*
				Altrimenti
				*/
				System.out.print("**");//Stampi **
				System.out.println();//Crei una nuova linea
				j=0;//torni alla colonna 0
				i--;//decrementa la riga di 1
			}
		}
		
	}
}
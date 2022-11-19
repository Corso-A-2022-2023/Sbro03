import java.util.Scanner;
public class Fibonacci{
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci il limite per il sistema di Fibonacci");
		int numero = input.nextInt();//Input del valore massimo 
		int n1 = 0;// numero di partenza
		int n2 = 1;	//numero sucessivo
		System.out.println("Il risultato: ");
		System.out.println(n1+" ");//Stampa 0
		for(int i = 0; i< numero; i++){
			/*
				il viene generato fin quando arriva al valore inserito in tastiera
			*/
			System.out.println(n2+" ");//stampa il valore sucessivo
			n2+=n1;// salva il valore della somma sucessiva tra n2 + n2 = 0 (es 0=0+1 o 2= 1+1 )
			n1 = n2-n1;//n1 deve avere il valore sucessivo per fare la somma successiva
		}
		
	}
}
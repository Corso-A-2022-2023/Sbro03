import java.util.Scanner;
public class MinMax10{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		int max = Integer.MIN_VALUE;// valore minimo che un integer può avere cioè (-2147483647 -2^32-1)
		int min = Integer.MAX_VALUE;// valore massimo che un integer può avere cioè(2147483647 ovvero 2^32-1)
		for(int i = 0; i< 10; i++){
			/*
			Ciclo for per mettere 10 numeri in input
			*/
			System.out.println("Inserisci il numero ");
			int numero = input.nextInt();
			if(numero>max){
				/*
				condizione if se il numero è maggiore di max allora
				*/
				max = numero;// max deve essere il numero inserito
			}
			else if(numero<min){
				/*
				Se il numero inserito è minore di min allora
				*/
				min=numero;//Numero minimo deve essere il numero inserito
			}
		}
		System.out.println("Il valore massimo e' : "+max+" ");//Stampa a video max
		System.out.println("Il valore minimo e' : "+ min+" ");//Stampa a video min
		System.out.println("La differenza tra max e min  e' :"+ " "+(max-min));//Stampa la differenza tra max e min
	}
}
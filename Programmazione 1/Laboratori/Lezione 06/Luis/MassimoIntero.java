import java.util.Scanner;
public class MassimoIntero{
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);
		int max = Integer.MIN_VALUE;// valore minimo che un integer può avere cioè (-2147483647 -2^32-1)
		int min = Integer.MAX_VALUE;// valore massimo che un integer può avere cioè(2147483647 ovvero 2^32-1)
		int numero=-1;
		while(numero!=0){
			/*Mentre il numero inserito è diverso da 0*/
			System.out.println("Inserisci i numeri :");
			numero = input.nextInt();//input da tastiera
			if(numero>max){
				//confronto del numero massimo
				max = numero;
			}
			else if(numero<min && numero !=0){
				//confronto del numero minimo  e diverso da 0(perchè se no da 0 come minimo)
				min=numero;
			}
		}
		System.out.println("Il valore massimo e' : "+max+" ");//Stampa a video max
		System.out.println("Il valore minimo e' : "+ min+" ");//Stampa a video min
	}
}
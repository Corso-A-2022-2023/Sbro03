import java.util.Scanner;
public class DivisoriInput{
	public static void main ( String [] args ){
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci il numero per dividere");
		int numero = input.nextInt();//DIGITO IN TASTIERA IL NUMERO DA DIVIDERE
		int i = 1;// LA i STA PER IL VALORE INIZIALE DA DIVIDERE(NON ZERO PERCHE' VERREBE IMPOSSIBILE)
		while(numero!=1){
			/*
			IL CICLO FUNZIONA FIN QUANDO IL NUMERO DA DIVIDERE SIA 1 (PERCHE' DIVIDERE 1 : 1 è SEMPRE 1)
			*/
			if(numero%i == 0){
				/*(10:1=10 RESTO 0)
				LA CONDIZIONE IF E' STATA MESSA PERCHE' FIN QUANDO 
				NON SI TROVA IL NUMERO DA DIVIDERE CHE DA' RESTO 0 ALLORA FA :
				*/
				numero= numero/i;
				/*DIVISIONE DEL NUMERO ATTUALE(IL PRIMO è 10) CON 
				IL DIVISORE ATTUALE (10:1 CHE IL DIVISORE è 1)
				*/
				System.out.println("Il suo divisore e': "+i);//STAMPA IN OUTPUT DEL DIVISORE
			}
			i++;
		}
	}
}
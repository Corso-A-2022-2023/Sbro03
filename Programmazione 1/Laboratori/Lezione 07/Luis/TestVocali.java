import java.util.Scanner;
public class TestVocali{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci la stringa per contare ogni singolo carattere");
		String stringa = input.nextLine();//inserisci la stringa
		MetodiRicorsivi.wrappers(stringa);//Richiama la funzione wrappers con parametro la stringa inserita
	}
}
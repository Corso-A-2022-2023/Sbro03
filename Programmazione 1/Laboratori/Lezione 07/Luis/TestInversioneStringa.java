import java.util.Scanner;
public class TestInversioneStringa{
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci la stringa : ");
		String stringa = input.nextLine();
		int i = stringa.length()-1;
		
		System.out.println(MetodiRicorsivi.stringaInversa(stringa,i));
	}
}
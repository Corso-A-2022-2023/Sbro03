import java.util.Scanner;
public class ConvertiStringhe{
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci la stringa : ");
		String stringa = input.nextLine();
		int i = 0;
		int j = 0;
		System.out.println(MetodiRicorsivi.conversioneCaratteri(stringa, i,j));
	}
}
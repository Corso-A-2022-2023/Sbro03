import java.util.Scanner;
public class TestPalindroma{
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci la stringa : ");
		String stringa = input.nextLine();//input per la stringa
		int i = 0;//primo elemento della stringa
		int j = stringa.length()-1;//ultimo elemento della stringa
		boolean flag = false;//condizione iniziale falsa
		System.out.println(MetodiRicorsivi.palindroma(stringa,i,j,flag));//stampo a video la funzione
	}
}
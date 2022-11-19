import java.util.Scanner;
public class EserciziWhile{
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci il numero :");
		int fine = input.nextInt();
		int inizio =0;
		int inizio1  =0;
		int fattoriale = 1;
		while(inizio<fine){
			if(inizio%2!=0){
			// inizio = inizio + 1 
			System.out.println(inizio);
			}
			inizio++;
		}
		System.out.println();
		while(inizio1<fine){
			System.out.println(fine);
			fine--;// fine = fine -1
		}
		System.out.println();
		for ( int k = 1 ; k<= 10; k++){
			fattoriale = fattoriale*k;
		}
		System.out.println(fattoriale);
		
		
	}
}
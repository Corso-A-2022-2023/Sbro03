import java.util.Scanner;
public class StringaMaxRicorsiva{
	public static void main ( String [] args){
		System.out.println(MaxMin());
	}
	public static String MaxMin(){
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci il numero :");
		String stringa = input.nextLine();//Inserminto da tastiera 
		if(stringa==""){
			/*se quando non scrivo allora*/
			return "";//Restituisci vuoto e termini il programma
		}
		String function = MaxMin();//function è uguale a MaxMin
		if(function.length()<stringa.length()){
			/*confronto tra le stringhe inserite*/
			return stringa;//ritorna stringa
		}
		else{
			/*altrimenti */
			return function;//torna l'antecedente
		}
	}
	
}
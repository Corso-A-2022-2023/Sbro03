import java.util.Scanner;
public class MassimoInteroRicorsivo{
	public static void main(String [] args){
		System.out.println(MaxMin());
	}
	public static int MaxMin(){
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci il numero :");//input della stringa
		int m= input.nextInt();// digito in tastiera della stringa desiderata
		if(m==0){
			/*se la stringa è uguale a 0*/
			return 0;//ritorna 0
		}
		int function = MaxMin();//variabile per dire che per fare il confronto delle variabili
		if(function<m){
			/*se m è maggiore di function allora*/
			return m;//m è maggiore
		}
		else{
			/*altrimenti*/
			return function;//la funzione è maggiore
		}
	}
}
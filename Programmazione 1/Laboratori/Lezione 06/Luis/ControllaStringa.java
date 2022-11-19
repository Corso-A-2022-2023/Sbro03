import java.util.Scanner;
public class ControllaStringa{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci la parola :");
		String stringa = input.nextLine();
		int i = 0;// per la stringa inserita
		int j = 0;//per la sequenza dei numeri
		boolean verifica = false;//verifica se ci sono sequenze di numeri
		System.out.println(tutteCifre(stringa,i,j,verifica));//stampa la funzione
	}
	public static boolean tutteCifre(String stringa, int i,int j, boolean verifica){
		/*funzione tutteCifre con 4 parametri due interi la stringa inserita e la verifica*/
		String numeri = "0123456789";// stringa di solo numeri
		int lunghezza = stringa.length();//lunghezza massima della stringa inserita
		int lunghezzaN = numeri.length();//lunghezza massima della sequenza dei numeri
		if(stringa == ""){
			/*se la stringa è vuota allora :*/
			verifica = false;//la  verifica è falsa
		}
		else{
			/*altrimenti :*/
			if(i<=lunghezza && j<=lunghezzaN ){
				/* fin quando la i (0)non raggiunge
				la sua lunghezza massima
				e j non raggiunge la sua lunghezza massima allora :*/
				if(stringa.charAt(i)==numeri.charAt(j)){
					/* se la lettera attuale (13432)è uguale alla sequenza numerica allora : */
					verifica = true;// verifica è vera
					return tutteCifre(stringa,i+1,0,verifica);
					//ritorni i +1 e j = 0 perchè così passa alla lettera sucessiva e riconta la sequenza numerica
				}
				else{
					/*altrimenti :*/
					verifica = false;// verifica è falsa
					return tutteCifre(stringa,i,j+1,verifica);//ritorni solo la lettera sucessiva
				}
			}
		}
		return verifica;//ritorni l'esito finale di verifica se è vero o falso;
	}
	/*public static boolean tutteCifre(String stringa, int i,int j, boolean verifica){
		String numeri = "0123456789";
		int lunghezza = stringa.length();
		int lunghezzaN = numeri.length();
		if(i<lunghezza && j<lunghezzaN ){
			if(stringa.charAt(i)==numeri.charAt(j)){
				verifica = true;
				return tutteCifre(stringa,i+1,0,verifica);
			}
			else{
				verifica = false;
				return tutteCifre(stringa,i,j+1,verifica);
			}
		}
		return verifica;
	}*///versione ottimizata Made Luca Bertetto
}
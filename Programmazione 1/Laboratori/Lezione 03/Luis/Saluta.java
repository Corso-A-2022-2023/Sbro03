public class Saluta{
	public static void main ( String [] args){
		System.out.println("Inserisci l'ora : ");
		int ora = SIn.readLineInt();
		if(ora<=12){
			System.out.println("Bungiorno");
		}
		else if(ora<=17){
			System.out.println("Buon pomeriggio");
		}
		else if(ora<=21){
			System.out.println("Buonasera");
		}
		else{
			System.out.println("Buonanotte");
		}
	}
}
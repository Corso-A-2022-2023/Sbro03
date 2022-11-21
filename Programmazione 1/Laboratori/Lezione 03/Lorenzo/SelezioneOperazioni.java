public class SelezioneOperazioni {
	public static void main(String[] args){
		
		System.out.println("Mettere 3 valori interi");
		
		//Inizializzando i valori interi

		int x1 = SIn.readLineInt();
		int x2 = SIn.readLineInt();
		int x3 = SIn.readLineInt();
		
		System.out.println("Scegliere tra le seguenti operazioni:");
		System.out.println("1 - Somma");
		System.out.println("2 - Moltiplicazione");
		System.out.println("3 - Media");
		
		int choice = SIn.readLineInt();
		
		//Variabile di controllo di choice
		boolean choiceIsCorrect = choice == 1 || choice == 2 || choice == 3;
		
		if(choiceIsCorrect){
			if(choice == 1){
				System.out.println("La somma dei 3 numeri digitati è: " + (x1 + x2 + x3));
			}
			if(choice == 2){
				System.out.println("La moltiplicazione dei 3 numeri digitati è: " + (x1 * x2 * x3));
			}
			if(choice == 3){
				System.out.println("La media dei 3 numeri digitati è: " + (Math.round((x1 + x2 + x3) / 3));
			}
		}else{
			System.out.println("Un'errore è capitato. Inserire un numero");
		}
	}
}
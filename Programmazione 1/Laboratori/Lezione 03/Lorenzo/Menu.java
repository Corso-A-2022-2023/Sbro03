public class Menu{
	public static void main(String[] args){
		
		System.out.println("Salve utente, questo è il tuo menù:");
		System.out.println();
		System.out.println("a. New document");
		System.out.println();	
		System.out.println("b. Open document");
		System.out.println();
		System.out.println("c. Save as...");
		System.out.println();
		System.out.println("d. Mail to...");
		System.out.println();
		System.out.println("Digita una lettera tra a - d:");
		
		char a = 'a';
		char b = 'b';
		char c = 'c';
		char d = 'd';
		
		char choice = SIn.readChar();

		boolean compareA = Character.compare(choice , a) == 0;
		boolean compareB = Character.compare(choice , b) == 0;
		boolean compareC = Character.compare(choice , c) == 0;
		boolean compareD = Character.compare(choice , d) == 0;
		
		if(compareA || compareB || compareC || compareD){
			System.out.println("Hai scelto:");
			System.out.println();
			if(compareA){System.out.println("New document");}
			if(compareB){System.out.println("Open document");}
			if(compareC){System.out.println("Save as...");}
			if(compareD){System.out.println("Mail to...");}
		}else{
			System.out.println("La tua scelta non è valida");
		}
		
	} 
}
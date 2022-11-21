public class Metodi{
	
	public static boolean palindroma(String a){
		String meta1 = "";
		String meta2 = "";
		int length = a.length();
		for(int i = 0; i < (length / 2); i++){
			int index = (length - 1 - i); 
			/* 
				grazie a questa istruzione parto dalla fine 
				della stringa e decremento quanto il valore i
				(non riesco a scrivere in italiano corretto)
			*/
			
			meta1 += a.charAt(i);
			meta2 += a.charAt(index);
		}
		if(meta1.equals(meta2))
			return true;
		else
			return false;
		
		/*
			Per vedere se una stringa è palindroma:
			
			- divido la stringa a metà (se la stringa ha un numero dispari 
			  di lettere, non conto la lettera centrale);
			  
			- inverto la seconda metà e vedo se queste 2 metà sono uguali:
			  se sono uguali allora la stringa di partenza è palindroma 
			  altrimenti non lo è;
			  
			Esempio:
			
			String a = onorarono;
			string meta1 = onor;
			string meta2 = onor
			
			Controllo se sono uguali con l'if e ritorno il valore di questo 
			confronto.
		*/
	}
	
	public static boolean elementiComuni(String a, String b){	
		int lengthA = a.length();
		int lengthB = b.length();
		int length;
		boolean flag = true;
		
		if(lengthA > lengthB)
			length = lengthB;
		else
			length = lengthA;
		/*
			Con questo if assegno a int length il valore della lunghezza 
			della stringa più corta di quelle fornite al metodo. In questo
			modo posso controllare tutte le lettere della stringa senza andare
			in errore
		*/
		for(int i = 0; i < length && flag; i++){
			if(a.charAt(i) == b.charAt(i))
				flag = false;
			else
				flag = true;
		}
		
		/*
			Con questo ciclo for controllo se ogni lettera sono uguali. 
			Se ne incontro una che non coincide allora il flag diventa false
			e il ciclo si ferma
		*/
		return flag;
	}
	
	public static void main(String[] args){
		System.out.println("Scrivere in minuscolo una parola");
		System.out.println("Controllerò se è palindroma o no");
		System.out.println("Solo per te bro");
		System.out.println();
		
		String a = SIn.readLine();
		String b = SIn.readLine();
		
		System.out.println(palindroma(a));
		System.out.println(palindroma(b));
		System.out.print(elementiComuni(a,b));
	}
}
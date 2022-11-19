public class Metodi{
	public static void main(String [] args){
		System.out.println("Inserisci la parola");
		String stringa = SIn.readLine();//SIn per inserire la stringa in tastiera
		System.out.println(palindroma(stringa));
		//output del metodo palindroma con parametro ciò che abbiamo inserito
		separa();
		System.out.println("Inserisci la prima stringa :");
		String s1 = SIn.readLine();
		System.out.println("Inserisci la seconda stringa :");
		String s2 = SIn.readLine();
		System.out.println(elementiComuni(s1,s2));
	}
	public static void separa() {
		/*Funzione per creare una linea per separare gli esercizi*/
        final int NUM_TRATTINI = 40;
        for (int i = 0; i < NUM_TRATTINI; i++)
            System.out.print('-');
        System.out.println();
    }
	public static boolean palindroma(String stringa){
		/*
		Inserimento della funzione di tipo boolean chiamata palindroma
		con parametro ciò che inseriamo
		*/
		int lunghezza = stringa.length()-1;//lunghezza massima della stringa
		String inverso = stringa;
		//dichiarazione della variabile inverso per avere la stessa parola
		boolean verifica = false;//variabile boolean per verificare se la parola è palindroma o no
		for(int i = 0; i< stringa.length();i++){
			/*Primo for per leggere tutta la stringa inserita*/
			for(int j = lunghezza; j>=0;j--){
				/*Secondo for per leggere tutta la stringa inversa
				che è uguale alla lunghezza massima della stringa inserita*/
				if(stringa.charAt(i)==inverso.charAt(j)){
					/*if per verificare se ogni parola sia uguale se è così allora:*/
					verifica = true;//verifica è true
				}
				else{
					/*Altrimenti */
					verifica = false;//false
				}
			}
		}
		return verifica;//Restituisci verifica
	}
	public static boolean elementiComuni(String s1, String s2){
		boolean verifica = false;//variabile boolean per verificare se non ci sono parole o si
		for(int i = 0; i<s1.length();i++){
			/*for per la lettura della prima parola*/
			for(int j = 0; j<s2.length(); j++){
			/*for per la lettura della seconda parola*/
			if(s1.charAt(i)==s2.charAt(j)){
			/*if per confrontare se ci sono lettere uguali allora:*/
			verifica=false;//verifica è false
				}
				else{
					/*altrimenti se non ci sono lettere uguali:*/
					verifica=true;// verifica è true
				}
			}
		}
		return verifica;//restituisci il valore di verifica
	}
}
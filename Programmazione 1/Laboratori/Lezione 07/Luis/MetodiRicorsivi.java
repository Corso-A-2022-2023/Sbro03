import java.util.Scanner;
public class MetodiRicorsivi{
	/*ATTENZIONE ESERCIZIO 6 NON FINITO */
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci la stringa: ");
		String stringa = input.nextLine();//inserisco la stringa da tastiera
		System.out.println("Inserisci il carattere: ");
		String carattere = input.nextLine();//inserisco il carattere
		int i = 0;//contatore
		System.out.println(trovaCarattere(stringa,carattere,i));//stampa a video la funzione trova carattere
		
		System.out.println();
		
		System.out.println("Inserisci la stringa per calcolare il numero di caratteri: ");
		String stringa1 = input.nextLine();// input stringa
		System.out.println("Inserisci il carattere: ");
		String carattere1 = input.nextLine();//input carattere
		int sommaCaratteri = 0;//somma i caratteri ottenuti
		System.out.println(contaCarattere(stringa1,carattere1,i,sommaCaratteri));//output contaCarattere
	}
	public static int sommatoriaRicorsiva(){
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci il numero :");
		int n = input.nextInt();//inserisco il numero da tastiera
		int somma = n;//la somma avrà valore n
		if(n==0){
			/*condizione base se n = 0 allora:*/
			return 0;//ritorni a 0
		}
		else{
			/*altrimenti*/
			return somma + sommatoriaRicorsiva();//fai la somma del valore antecedente con quello successivo
		}
	}
	public static boolean trovaCarattere(String stringa,String carattere,int i){
		/*funzione trovaCarattere con parametri la stringa inserita il carattere inserito e il contatore*/
		int lunghezza = stringa.length()-1;//il valore massimo della lunghezza della stringa
		boolean flag  = true;//variabile boolean per vedere se la stringa ha dei caratteri uguale a quelli inseriti
		if(stringa == ""||carattere ==""){
			/*se stringa inserita è vuota o carattere è vuoto*/
			flag = false;//flag è falsa
			return flag;//ritorna flag
		}
		else{
			/*altrimenti : */
			if(i<=lunghezza){
				/*controlli se la lunghezza della stringa e quella del carattere sono minori della loro lunghezza totale allora:*/
				if(carattere.charAt(0) == stringa.charAt(i)){
					/*controlla se la lettera del carattere è uguale a quella della string allora :*/
					return flag;//ritorna flag true
				}
				else{
					/*altrimenti :*/
					return  trovaCarattere(stringa,carattere,i+1);//ritorni il carattere successivo
				}
			}
			else{
				/*altrimenti:*/
				flag = false;// flag è falso
				return flag;//ritorna falso
			}
		}
	}
	public static int contaCarattere(String stringa ,String carattere,int i,int somma){
		/*funzione di int che porta a parametri la stringa inserita, 
		il carattere inserito la posizione di partenza e la somma*/
		int lunghezza = stringa.length()-1;//lunghezza massima 
		if(stringa == "" || carattere ==""){
			/*se i valori della stringa e del carattere sono vuoti allora :*/
			return 0;//ritorni 0
		}
		else{
			if(i<=lunghezza){
				/*se la i non raggiunge la lunghezza massima della stringa allora:*/
				if(carattere.charAt(0) == stringa.charAt(i))
					/*farà il confronto del carattere e della lettera corrente della stringa*/
					++somma;//sommi la somma 
				return contaCarattere(stringa,carattere,i+1,somma);//vai alla lettera successiva	
			}
			else{
				return somma;//ritorni somma
			}
		}
	}
	public static void wrappers(String stringa){
		/*funzione wrappers vuota dato che come output avrò più di un valore da restituire 
		e passo come parametro la stringa inserita*/
		String vocali = "aeiou";//stringa dove ci sono le vocali 
		int lunghezza = vocali.length()-1;//lunghezza massima delle vocali
		for(int i=0;i<=lunghezza;i++){
			System.out.print("la lettera "+ vocali.charAt(i)+" ha : ");//stampa le vocali
			System.out.println(contaCarattere(stringa,vocali.substring(i),0,0)+" vocali");//stampa il numero di vocali trovate
		}
	}
	public static boolean palindroma(String stringa,int i,int k,boolean flag){
		/*funzione palindroma dove passo come parametro la stringa inserita il contatore(i) 
		la lunghezza massima(k) e la verifica se è palindroma(flag)*/
		int lunghezza = stringa.length()-1;//lunghezza massima della stringa
		String inverso = stringa;//inverso sarà uguale alla stringa inserita
		if(stringa == ""){
			/*se la stringa inserita è vuota allora */
			return flag;//ritorna flag falsa
		}
		if(i<lunghezza && k>=0){
			/*se la lunghezza della stringa non raggiunge la sua lunghezza massima 
			e la sua lunghezza minima non raggiunge 0 allora: */
			if(stringa.charAt(i) == inverso.charAt(k)){
				/*controlli se la lettera corrente della stringa sia uguale alla lettera corrette dell inverso*/
				flag = true;//flag è true
				return palindroma(stringa,i+1,k-1,flag);//vai alla lettera successiva della stringa e vai alla lettera dopo dell'inversa
			}
		}
		return flag;//ritorno flag
	}
	public static String conversioneCaratteri(String stringa,int i,int j){
		/*creazione della funzione conversioneCaratteri con parametri : 
		la stringa di prova(stringa) , la incremento(i), la variabile di ricomincio(j)*/
		String vocali = "aeiou";//sequenza per le vocali
		String consonanti="bcdfghlmnpqrstvz";//sequenza per le consonanti 
		int lunghezza = stringa.length()-1;//la lunghezza massima della stringa inserita
		if(stringa ==""){
			/*caso base se la stringa è vuota allora*/
			return "Non hai inserito la stringa";//messaggio di errore
		}
		if(i<=lunghezza){
			/*finchè la i non arriva alla lunghezza massima della stringa inserita*/
			if(trovaCarattere(vocali,stringa.substring(i),j)){
				/*se trovo la lettera attuale corrisponde alle vocali*/
				System.out.print("*");//stampa asterisco
				return conversioneCaratteri(stringa,i+1,0);//vai alla lettera successiva e ricomincia da 0 il confronto
			}
			else if(trovaCarattere(consonanti,stringa.substring(i),j)){
				/*Se il carattere attuale è una consonante allora :*/
				System.out.print("$");//stampa dollaro
				return conversioneCaratteri(stringa,i+1,0);//vai alla lettera successiva e ricomincia da 0 il confronto
			}
			else{
				/*se non è uguale agli altri*/
				System.out.print("-");//stampa trattino
				return conversioneCaratteri(stringa,i+1,0);//vai alla lettera successiva e ricomincia da 0 il confronto
			}
		}
		return "";
	}
	public static String stringaInversa(String stringa,int i){
		/*funzione di tipo stringa chiamata stringaInversa con parametri:
		stringa che è la stringa che inseriamo e il valore massimo della lunghezza(i)*/
		if(stringa == ""){
			/*se la stringa è vuota allora è vuota*/
			return "errore";
		}
		if(i>=0){
			/*se la stringa non raggiunge la sua lunghezza minima cioè 0 allora :*/
			System.out.print(stringa.charAt(i));//Stampa la stringa al contrario
			return stringaInversa(stringa,i-1);//vai alla lettera precedente
		}
		return"";
	}
	public static String eliminaCarattere(String stringa, int posizione, int i){
		/*creazione della funzione eliminaCarattere con parametri :
		la stringa inserita (stringa) la posizione che dobbiamo eliminare la parola(posizione) e l'incremento(i)*/
		if(stringa ==""){
			/*se la stringa è vuota allora:*/
			return "Errore";
		}
		if(i<=stringa.length()-1){
			/*se non la i non raggiunge la sua lunghezza massima:*/
			if(i==posizione){
				/*confronta se i uguale alla posizione :*/
				System.out.print("");//crei una stringa vuota per eliminare il carattere
				return eliminaCarattere(stringa,posizione,i+1);//vai alla lettera successiva
			}
			else{
				/*altrimenti :*/
				System.out.print(stringa.charAt(i));//Stampa le lettere rimanenti
				return eliminaCarattere(stringa,posizione,i+1);//incrementa di uno la posizione
			}
			
		}
		return "\t Elemento eliminato : "+ posizione;
	}
	public static void separa(){
        final int NUM_TRATTINI = 40;
        for (int i = 0; i < NUM_TRATTINI; i++)
            System.out.print('-');
        System.out.println();
    }
	public static String permutazioniStringa(String stringa){
		int i = 0; //gestire le righe della combinatoria
		int j = 0;//gestire le colonne della combinatoria
		int lunghezza =stringa.length();//lunghezza massima della stringa inserita
		if(stringa.equals("")){
			/*se la stringa è vuota allora:*/
			return "Errore";//ritorna errore
		}
		/*altrimenti*/
		return formatoTabella(lunghezza,i,j,stringa);//crea il formato della tabella
	}
	public static String formatoTabella(int lunghezza,int i,int j,String stringa){
		/*funzione chiamata formato tabella per creare la dimensione totale della combinatoria:
		con parametri della lunghezza massima delle righe e delle colonne*/
		int dimensione = dimensioniTabella(lunghezza);
		/*Dato che la tabella si deve creare attraverso una operazione di fattoriale allora creo
		una funzione per le righe della tabella portando a parametro la lunghezza totale della stringa inserita*/
		if(dimensione<=1 &&lunghezza <=1){
			return"Errore";
		}
		if(i<dimensione){
			if(j==lunghezza-1){
				permutazione(j,i,stringa,lunghezza);
				//System.out.print("*");
				System.out.println();
				return formatoTabella(lunghezza,i+1,0,stringa);
			}
			else{
				permutazione(j,i,stringa,lunghezza);
				//System.out.print("*");
				return formatoTabella(lunghezza,i,j+1,stringa);
			}
		}
		return"";
	}
	public static int dimensioniTabella(int lunghezza){
		/*creazione della funzione dimensionitabella con parametro la lunghezza massima della tabella(lunghezza)*/
		if(lunghezza<=1){
			/*se la lughezza è minore o uguale a 1 allora:*/
			return 1;//ritorna 1
		}
		else{
			/*altrimenti:*/
			return lunghezza*dimensioniTabella(lunghezza-1);//fai il calcolo del fattoriale
		}
	}
	public static void permutazione(int j,int i,String carattere,int lunghezza){
		int sequenza = dimensioniTabella(lunghezza);
		int lettera = sequenza/lunghezza;
		int aux  = 0;
		String parola = carattere.substring(j);
		if(i<=lettera){
			System.out.print(parola+" ");
		}
	}
}
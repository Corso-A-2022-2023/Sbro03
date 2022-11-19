import java.util.Scanner;
public class Floyd{
	public static void main(String [] args){
		/*
		RAPPRESENTAZIONE GRAFICA SU COME L'HO PENSATO L'ESERCIZIO:
			|	COLONNA 0	COLONNA 1	COLONNA2	COLONNA3
		RIGA 0: 		1
NUOVA	RIGA 1:		2			3
NUOVA	RIGA 2:		4			5			6
NUOVA	RIGA 3:		7			8			9			10
NUOVA	RIGA 4:		11			12			14			15
		*/
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci n righe");
		int numero = input.nextInt();//DIGITO IN TASTIERA LE RIGHE MASSIME DA INSERIRE
		int i =0;//RIGA 0
		int j =0;//COLONNA 0
		int valori = 1;//VALORE INIZIALE CHE PARTE DA 1 PERCHE' LO ZERO NON ESISTE NEL TEOREMA FLOYD
		System.out.println("Il risultato e' :");
		System.out.println();
		while(i<numero){
			/*
			CONDIZIONE CHE LA i DEVE RAGGIUNGERE L'ULTIMA RIGA INSERITA DALL'UTENTE	
			*/
			if(i == j){
				/*
				NELLA  CONDIZIONE  SUCCEDE CHE SE LA i ARRIVA ALL'ULTIMA
				COLONNA OVVERO CHE CORRISPONDA A j ALLORA DEVE FARE :
				*/
				System.out.print(valori+" ");// STAMPA DEL VALORE IN OUTPUT
				valori++;//IMPLEMENTAZIONE DEL VALORE SUCCESSIVO (ES :1 -> 2)
				System.out.println();//UNA NUOVA RIGA
				j=0;// TORNA DA 0 LA COLONNA 
				i++;//IMPLEMENTAZIONE DELLA RIGA  
			}
			else{
				/*
				SE LA COLONNA(j) NON  CORRISPONDE CON LA RIGA(i) ALLORA DEVE FARE:
				*/
				System.out.print(valori+" ");//STAMPA DEL VALORE IN OUTPUT
				valori++;//IMPLEMENTAZIONE DEL VALORE
				j++;//IMPLEMENTAZIONE DELLA COLONNA
			}
		}
	}
}
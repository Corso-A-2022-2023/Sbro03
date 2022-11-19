import java.util.Scanner;
public class ParitaInput{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		int numero = -1;
		/* NUMERO DA INSERIRE (IN MANIERA CASUALE)
		PER ENTRARE NEL WHILE CON VALORE INIZIALE*/
		int totPari=0;//LA SOMMA TOTALE DI TUTTI I NUMERI PARI
		int totDispari=0;//LA SOMMA TOTALE DI TUTTI I NUMERI DISPARI
		while(numero!=0){
			/*CONDIZIONE DEL CICLO INSERITA FIN QUANDO IL NUMERO DA ME INSERITO NON SIA 0
			ALLORA POSSO INSERIRE INFITI NUMERI DA TASTIERA
			*/
			System.out.println("Inserisci il numero :");
			numero = input.nextInt();//DIGITO DA TASTIERA IL NUMERO
			if(numero%2==0 && numero!=0){
				/*
				LA CONDIZIONE CHE SI E' MESSO DENTRO L'IF E' SUL FATTO CHE SE IL
				NUMERO INSERITO E' PARI E DIVERSO DA 0(PERCHE' 0 E' UN NUMERO PARI MA CI SERVE PER
				CHIUDERE IL PROGRAMMA) ALLORA:
				*/
				totPari++;// CONTA I NUMERI PARI INSERITI
			}
			else if(numero%2!=0){
				/*
				SE IL NUMERO E' DISPARI ALLORA:
				(!= SIGNIFICA CHE SE TROVA UN NUMERO CHE DIA RESTO DIVERSO DA 0)
				*/
				totDispari++;//CONTA I NUMERI PARI
			}
			else{
				/*
				SE METTO 0 ALLORA IL PROGRAMMA TERMINA DICENDO:
				*/
				System.out.println("Non hai inserito numeri");
			}
		}
		if(totPari>totDispari){
			/*
			SE I NUMERI PARI CONTATI SONO MAGGIORI CHE I DISPARI ALLORA:
			*/
			System.out.println("Numeri pari trovati:"+totPari);//STAMPA IN OUTPUT I NUMERI TOTALI PARI
			System.out.println("Quindi sono tutti pari");
		}
		else if(totPari== totDispari){
			/*
			SE I NUMERI PARI E DISPARI SONO UGUALI ALLORA:
			*/
			System.out.println("Numeri pari trovati:"+totPari);//STAMPA IN OUTPUT IL TOTALE DEI PARI
			System.out.println("Numeri dispari trovati:"+totDispari);
			//STAMPA IN OUTPUT IL TOTALE DEI DISPARI
			System.out.println("Quindi sono sia pari che dispari");
		}
		else{
			/*
			SE HA TROVATO PIU' DISPARI CHE PARI ALLORA:
			*/
			System.out.println("Numeri dispari trovati:"+totDispari);//STAMPA IN OUTPUT IL TOTALE DISPARI
			System.out.println("Quindi sono tutti dispari");
		}
	}
}
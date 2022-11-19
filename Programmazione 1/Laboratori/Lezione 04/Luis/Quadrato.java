import java.util.Scanner;
public class Quadrato{
	public static void main ( String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci un numero per creare il quadrato");
		int numero = input.nextInt();//digito in tastiera del quadrato
		int slash=0;//varibiale per aggiungere gli |
		int duePunti=0;//varibiale per aggiungere i :
		for(int i = 0; i<numero;i++){
			/*
			for per elencare il massimo numero di righe che puo avere il quadrato
			Es:
			numero = 6 allora il quadrato avrà
	riga1	-
	riga2	-
	riga3	-
	riga4	-
	riga5	-
	riga6	-
			*/
			for(int j = 0; j<numero;j++){
				/*
				Con il seguente for si elencano le colonne del quadrato 
				e dato che i lati del quadrato sono uguali
				allora alla j mettiamo fino numero , per poi creare:
					|	colonna1	colonna2	colonna3	colonna4	colonna5	colonna6
				riga1		-			-			-			-			-			-
				riga2		-			-			-			-			-			-
				riga3		-			-			-			-			-			-
				riga4		-			-			-			-			-			-
				riga5		-			-			-			-			-			-
				riga6		-			-			-			-			-			-
				*/
				if(slash == j && slash == i){
					/*
					Per mettere gli slash nella posizione come ci ha chiesto il problema si è fatto
					un if per dire se la varibiale slash corrisponde ha una riga e colonna determinata
					allora stampi | e incrementi di 1 slash
					*/
					System.out.print(" | ");	
					slash++;
					/*
					Risultato:
						|	colonna1	colonna2	colonna3	colonna4	colonna5	colonna6
					riga1		|			-			-			-			-			-
					riga2		-			|			-			-			-			-
					riga3		-			-			|			-			-			-
					riga4		-			-			-			|			-			-
					riga5		-			-			-			-			|			-
					riga6		-			-			-			-			-			|
					*/
				}
				else if(slash!=duePunti){
					/*
					A questo punto rimaneva i due punti e gli asterischi e per mettere i due punti
					è bastato solo che sia diverso da slah e stampava il lato destro del quadrato
					*/
					System.out.print(" : ");//Stampa in output dei : 
					/*
					Risultato:
						|	colonna1	colonna2	colonna3	colonna4	colonna5	colonna6
					riga1		|			:			:			:			:			:
					riga2		-			|			:			:			:			:
					riga3		-			-			|			:			:			:
					riga4		-			-			-			|			:			:
					riga5		-			-			-			-			|			:
					riga6		-			-			-			-			-			|					
					*/
				}
				else{
					/*
					Infine se le altre due condizioni erano false allora metti gli asterischi
					*/
					System.out.print(" * ");
					/*
					Risultato:
						|	colonna1	colonna2	colonna3	colonna4	colonna5	colonna6
					riga1		|			:			:			:			:			:
					riga2		*			|			:			:			:			:
					riga3		*			*			|			:			:			:
					riga4		*			*			*			|			:			:
					riga5		*			*			*			*			|			:
					riga6		*			*			*			*			*			|					
					*/
				}
			}
			duePunti++;//Incremento dei : alla fine di ogni colonna
			System.out.println();//nuova riga
		}
	}
}
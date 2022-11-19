import java.util.Scanner;
public class PitagoraRicorsivo{
	public static void main(String[] args ){
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci il numero delle righe della tavola pitagorica:");
		int riga = input.nextInt();//dichiarazione della variabile riga per le righe da stampare
		System.out.println("Inserisci il numero delle colonne della tavola  pitagorica:");
		int colonna = input.nextInt();//dichiarazione variabile colonna per le colonne da stampare
		int i = 1;
		int j = 1;
		tavolaPitagorica(riga,colonna,i,j);//metodo tavolaPitagorica con i parametri della riga , colonna , i e j 
	}
	public static void tavolaPitagorica(int riga,int colonna,int i, int j){
		/*dichiarazione della funzione tavolaPitagorica con 4 parametri di tipo intero*/
		int molt=i*j;//sta per la moltiplicazione
		if(molt==0){
			/*se la moltiplicazione è 0 allora:*/
			System.out.print(0);//stampa 0
		}
		else{
			/*altrimenti :*/
			if(i<=riga){
				/*finchè la i non raggiunge la colonna allora: */
				if(j == colonna){
					/*se j è uguale alla colonna allora :*/
					System.out.print(molt+"\t");//stampi la moltiplicazione
					System.out.println();//vai a campo
					 tavolaPitagorica(riga,colonna ,i+1,1);//riporta riga colonna massima e incrementa la i di 1 e torna la j di 1
				}	
				else{
					/*altrimenti :*/
					System.out.print(molt +"\t");//stampi la moltiplicazione
					 tavolaPitagorica(riga,colonna,i,j+1);//riporta riga colonna massima ,i e incrementa la colonna di 1
				}
			}
			
		}
	}
}
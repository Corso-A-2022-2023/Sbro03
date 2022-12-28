/**
 * ESAME PROGRAMMAZIONE 1 
 * Matricola: SCRIVERLA ORA!!!
 * Cognome: SCRIVERLO ORA!!!
 * Nome: SCRIVERLO ORA!!!
 * Corso: SCRIVERLO ORA!!!
 * 
 * Se non ancora fatto, SCRIVERE ORA nome, cognome, matricola, corso, NUMERO DEL PC sui fogli distribuiti.
 * 
 * PER CONSEGNARE/RITIRARSI chiamare un docente.
 * SE QUESTA CLASSE NON COMPILA È INUTILE CONSEGANRE.
 */

public class Luglio1 {
	/* ESERCIZIO 1 (Massimo 7 punti -- da consegnare elettronicamente).
	 * Scrivere un metodo iterativo di nome e1 con le seguenti caratteristiche:
	 * --) e1 ha due parametri formali:
	 *     Il primo parametro e' un riferimento (puntatore) ad un array di interi di nome a.
	 *     Il secondo parametro e' un riferimento ad una matrice di interi di nome b in cui 
	 *     tutte le righe hanno la stessa lunghezza;
	 * --) e1 restituisce la somma di tutti gli elementi a[i] in a per cui esista una 
	 *     colonna di b nella quale esista un elemento maggiore di a[i]. 
	 *     Se non esistono colonne di b che filtrano elementi di a come indicato, il 
	 *     risultato è 0, cioe' l'elemento neutro della somma.
	 * La classe Luglio1TestE1 puo' essere usata per il testing, 
	 * contenendo esempi sul funzionamento atteso per e1. 
	 * SCRIVERE e1 immediatamente al di sotto di questo commento.
	 */
	 
	 static int e1(int[] a, int[][] b){
		 int somma = 0;	
		 if(a == null || b == null){
			 somma = 0;
		 }else{
			 for(int i = 0; i < a.length; i++){
				 boolean esiste = false;
				 for(int j = 0; j < b.length && !esiste; j++){
					 for(int e = 0; e < b[j].length; e++)
						esiste = b[j][e] > a[i];
				 }
				 somma = esiste ? somma + a[i] : somma;
				 
			 }
		 }
		 
		 return somma;
	 }
	
	/* ESERCIZIO 2 (Massimo 7 punti -- da consegnare elettronicamente).
	 * Scrivere un metodo di nome e2 con le seguenti caratteristiche:
	 * --) e2 ha due parametri formali. Entrambi sono riferimenti (puntatori) 
	 *     ad array di interi, hanno nome a e b e possono essere di diversa lunghezza;
	 * --) e2 restituisce il puntatore (reference) all'array b modificato come segue:
	 *     il valore di ogni elemento di posizione pari in b e' sostituito col valore del 
	 *     corrispondente elemento in a;
	 * --) e2 richiama un metodo ricorsivo di tipo void e dicotomico che esegue effettivamente 
	 *     il rimpiazzo dei valori in b con quelli di a.
	 * La classe Luglio2TestE2 puo' essere usata per il testing di e2,
	 * contenendo esempi sul funzionamento atteso per e2. 
	 * SCRIVERE e2 immediatamente al di sotto di questo commento.
	 */
	 
	 static int[] e2(int[] a, int[] b){
		 if(a == null || b == null || a.length == 0 || b.length == 0){
			 return b;
		 }else{
			 int l = a.length < b.length ? a.length : b.length;
			 e2(a,b,0,l-1);
			 return b;
		 }
	 }
	 
	 static void e2(int[] a, int[] b, int l , int r){
		 if(l == r){
			 b[l] = l % 2 == 0? a[l] : b[l];
		 }else{			 
			 int m = (l + r) / 2;
			 e2(a,b,l,m);
			 e2(a,b,m+1,r);
		 }
	 }
	
	/* ESERCIZIO 3 (Massimo 2 + 2 + 3 + 3 punti -- da consegnare a mano).
	 * Sia dato il metodo e3 qui sotto definito. Abbreviamo con P il predicato:
	 * 
	 *    per ogni j: se (j < i < a.length) allora (a[j] == true)
	 *  
	 * Dimostrare per induzione sul numero di iterazioni del ciclo while che il predicato P e' invariante:
	 * 1) scrivere esplicitamente il caso base P per la dimostrazione per induzione (2 punti)
	 * 2) scrivere esplicitamente il caso induttivo per la dimostrazione per induzione, (2 punti)
	 * 3) dimostrare che il caso base P della dimostrazione per induzione e' vero, (3 punti)
	 * 4) dimostrare che il caso induttivo della dimostrazione per induzione e' vero. (3 punti)
	 */
	 
	 public static void e3(boolean[] a) {
		int i = 0;
		while (i < a.length) {
			if (!a[i]) 
				a[i] = !a[i];
		    i++;
	 	}
	}
	 
	 /* ESERCIZIO 4 (Massimo 8 punti -- da consegnare a mano).
	  * Scrivere lo stato della memoria della JVM alla riga col commento // (B),
	  * ovvero giusto prima della disallocazione del frame relativo ad x.
	  */
      public static void main (String[] args){
		 int [] a = {1,2,3};
		 int [][] m = new int[a.length][];
		 x(a,m);       // (A)
	 }
 
	 public static void x(int[] a,int[][] m){
		 for (int i = 0; i < m.length; i++){
			 m[i] = new int[a[i]];
			 for (int j = 0; j < m[i].length; j++)
			    m[i][j] = a[i];
		 } // (B)
	}	
}

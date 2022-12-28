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

public class Gennaio0 {
	/* ESERCIZIO 1 (Massimo 7 punti -- da consegnare elettronicamente).
	 * Scrivere un metodo iterativo di nome eUno con le seguenti caratteristiche:
	 * --) eUno ha due parametri formali:
	 *     Il primo parametro e' un riferimento (puntatore) ad una matrice di interi di nome a.
	 *     Il secondo parametro e' un riferimento ad un array di interi di nome b;
	 * --) eUno restituisce la somma di tutti gli elementi e di a per cui esista un elemento
	 *     di b che sia multiplo di e.
	 * La classe Gennaio0TestExUno puo' essere usata per il testing di eUno, 
	 * contenendo esempi sul funzionamento atteso per eUno. 
	 * SCRIVERE eUno immediatamente al di sotto di questo commento.  
	 */
	 
	 static int eUno(int[][] a, int[] b){
		 int somma = 0;
		 if(a == null || b == null){
			 somma = 0;
		 }else{
			 for(int i = 0; i < a.length; i++){
				 if(a[i] != null)
					for(int j = 0; j < a[i].length; j++){
						boolean esiste = false;
						for(int e = 0; e < b.length && !esiste; e++){
							esiste = b[e] % a[i][j] == 0;
						}
						somma = esiste ? somma + a[i][j] : somma;
					}
				}
			 }
			 
			 return somma;
		 }
		 
	 
	/* ESERCIZIO 2 (Massimo 7 punti -- da consegnare elettronicamente).
	 * Scrivere un metodo di nome eDue con le seguenti caratteristiche:
	 * --) eDue ha due parametri formali. Entrambi sono riferimenti (puntatori) 
	 *     ad array di interi ed hanno nome a e b;
	 * --) Per ogni posizione i, eDue restituisce la somma delle somme tra a[i] e b[i], a
	 *     patto che il valore esaminato in a superi il corrispondente in b;
	 * --) eDue richiama un metodo ricorsivo co-variante (indice che guida la 
	 *     ricorsione cala con la semplificazione del problema) che esegue 
	 *     effettivamente la somma delle somme.
	 * La classe Gennaio0TestExDue puo' essere usata per il testing di eDue.
	 * SCRIVERE eDue immediatamente al di sotto di questo commento.
	 */
	 
	 static int eDue(int[] a, int[] b){
		 if(a == null || b == null || a.length == 0 || b.length == 0){
			 return 0;
		 }else{
			 int length = a.length < b.length ? a.length : b.length;
			 return eDue(a,b,length-1);
		 }
	 }
	 
	 static int eDue(int[] a, int[] b, int i){
		 if(i == 0){
			 return a[i] > b[i] ? a[i] + b[i] : 0;
		 }else{
			 return a[i] > b[i] ? a[i] + b[i] + eDue(a,b,i-1) : 0 + eDue(a,b,i-1);
		 }
	 }
	 
	/* ESERCIZIO 3 (Massimo 2 + 2 + 3 + 3 punti -- da consegnare a mano).
	 * Sia dato il metodo eTre qui sotto definito.
	 * Assumiamo che il parametro formale a non sia null.
	 * Definiamo il predicato:
	 * 
	 *      P(i) <==> (m == cardinalita' {j | j < i && a[j] e' pari})
	 * 
	 * Per dimostrare che P(a.length) e' vero alla riga contrassegnata con (X):
	 * 1) scrivere esplicitamente il caso base P(0) per la dimostrazione per induzione, (2 punti)
	 * 2) scrivere esplicitamente il caso induttivo per la dimostrazione per induzione, (2 punti)
	 * 3) dimostrare che il caso base P(0) della dimostrazione per induzione e' vero, (3 punti)
	 * 4) dimostrare che il caso induttivo della dimostrazione per induzione e' vero. (3 punti)
	 */
	public static int eTre (int[] a) {
		int m = 0;
		int i = 0;
		while (i < a.length) {
			if (a[i] % 2 == 0)
			   m = 1 + m;
			else
			   m = 0 + m;
			i = i + 1;
		}
		// (X)
		return m;
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

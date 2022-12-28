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

public class Febbraio2 {
	/* ESERCIZIO 1 (Massimo 7 punti -- da consegnare elettronicamente).
	 * (Per ogni/esiste)
	 * Scrivere un metodo iterativo di nome eUno con le seguenti caratteristiche:
	 * --) eUno ha due parametri formali:
	 *     Il primo parametro e' un riferimento (puntatore) ad una array di interi di nome a.
	 *     Il secondo parametro e' un riferimento ad una matrice di interi di nome b;
	 * --) eUno restituisce la somma di tutti gli elementi e di a per cui esista un elemento
	 *     di b che sia multiplo di e.
	 * La classe Febbraio2TestExUno puo' essere usata per il testing di eUno, 
	 * contenendo esempi sul funzionamento atteso per eUno. 
	 * SCRIVERE eUno immediatamente al di sotto di questo commento.
	 */
	 
	 static int eUno(int[] a, int[][] b){
		 int somma = 0;
		 if(a == null || b == null)
			 somma = 0;
		 else{			 
			 for(int i = 0; i < a.length; i++){
				 boolean trovato = false;
				 for(int j = 0; j < b.length; j++){
					 if(b[j] != null){			
						 for(int e = 0; e < b[j].length && !trovato; e++){
							 trovato = b[j][e] % a[i] == 0;
							 somma = trovato ? somma + a[i] : somma;
						 }
					 }
				 }
			 }
		 }
		 return somma;
	 }
	   
	/* ESERCIZIO 2 (Massimo 7 punti -- da consegnare elettronicamente).
	 * Scrivere un metodo di nome eDue con le seguenti caratteristiche:
	 * --) eDue ha due parametri formali. Entrambi sono riferimenti (puntatori) 
	 *     ad array di interi ed hanno nome a e b;
	 * --) eDue restituisce la somma delle differenze tra a[i] e b[i], a
	 *     patto che il valore esaminato in a superi il corrispondente in b;
	 * --) eDue richiama un metodo ricorsivo contro-variante (indice che guida la 
	 *     ricorsione sale con la semplificazione del problema) che esegue 
	 *     effettivamente la somma delle differenze.
	 * La classe Febbraio2TestExDue puo' essere usata per il testing di eDue.
	 * SCRIVERE eDue immediatamente al di sotto di questo commento.
	 */
	 
	 static int eDue(int[] a, int[] b){
		 if(a == null || b == null || a.length == 0 || b.length == 0){
			 return 0;
		 }else{
			 return eDue(a,b,0);
		 }
	 }
	 
	 static int eDue(int[] a, int[] b, int i){
		 int length = a.length < b.length ? a.length : b.length;
		 if(i == length-1){
			 return a[i] > b[i] ? a[i] - b[i] : 0;
		 }else{
			 int somma = a[i] > b[i] ? a[i] - b[i] : 0;
			 somma += eDue(a,b,i+1);
			 return somma;
		 }
	 }
		
    /* ESERCIZIO 3 (Massimo 2 + 2 + 3 + 3 punti -- da consegnare a mano).
	 * Sia dato il metodo eTre qui sotto definito.
	 * Assumiamo che il parametro formale a non sia null.
	 * Definiamo il predicato:
	 * 
	 *    P(i) <==> (eTre(a,i) == cardinalita' {j | j < i && a[j] e' pari})
	 *  
	 * Per dimostrare per induzione su i che P(i) e' vero per ogni i:
	 * 1) scrivere esplicitamente il caso base P(0) per la dimostrazione per induzione, (2 punti)
	 * 2) scrivere esplicitamente il caso induttivo per la dimostrazione per induzione, (2 punti)
	 * 3) dimostrare che il caso base P(0) della dimostrazione per induzione e' vero, (3 punti)
	 * 4) dimostrare che il caso induttivo della dimostrazione per induzione e' vero. (3 punti)
	 */
	 
	 public static int eTre(int[] a, int i) {
		if (i == 0) 
		    return 0;
		else 
		    if (a[i-1] % 2 == 0) 
		       return 1 + eTre(a,i-1);
		    else
		       return 0 + eTre(a,i-1);
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
		 int i; int j;
		 for (i = 0; i < m.length; i++){
			 m[i] = new int[i+2];
			 for (j = 0; j < m[i].length; j++)
			    m[i][j] = a[i];
		 } // (B)
	 }
}

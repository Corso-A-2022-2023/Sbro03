/**
 * ESAME PROGRAMMAZIONE 1 08/07/19
 * Matricola: SCRIVERLA ORA!!!
 * Cognome: SCRIVERLO ORA!!!
 * Nome: SCRIVERLO ORA!!!
 * Corso: SCRIVERLO ORA!!!
 * 
 * Se non ancora fatto, SCRIVERE ORA nome, cognome, matricola, corso, 
 * NUMERO DEL PC sui fogli distribuiti.
 * 
 * PER CONSEGNARE/RITIRARSI chiamare un docente.
 * SE QUESTA CLASSE NON COMPILA E' INUTILE CONSEGANRE.
 */
public class EsameH1819 {

	/** ESERCIZIO 1 (Massimo 7 punti -- da consegnare elettronicamente). 
	 * Scrivere un metodo iterativo e1 con le seguenti caratteristiche:
	 * -) e1 ha due parametri, entrambi di tipo array di interi, di nome 
	 * a e b, rispettivamente; 
	 * -) e1 restituisce true se ogni elemento di a e' 
	 * inferiore a non meno di due elementi di posizione dispari in b. 
	 * In ogni altro caso, e1 restituisce false. 
	 * SCRIVERE la soluzione immediatamente qui sotto.                */
	 
	 static boolean e1(int[] a, int[] b){
      boolean ogni = true;
		 if(a == null || b == null || a.length == 0 || b.length == 0)	
			ogni = false;
		 else{
			 for(int i = 0; i < a.length && ogni; i++){
				 boolean flag = false;
             boolean trovato = false;
				 int count = 0;
				 for(int e = 0; e < b.length && !trovato; e++){
					 if(e % 2 != 0){
						 flag = a[i] < b[e];
						 count = flag ? (count + 1) : count;
					 }
				 }
				 trovato = count >= 2;
             ogni = trovato;
			 }
		 }
		 return ogni;
	 }

	/** ESERCIZIO 2 (Massimo 7 punti -- da consegnare elettronicamente).
	 * Scrivere un metodo involucro (wrapper o guscio) e2 tale che:
     * -) e2 ha come unico parametro formale un array di interi a;
     * -) e2 restituisce un array di interi, richiamando un metodo 
     * ricorsivo controvariante e2R che si comporta come segue:
     * -) e2R prende quattro parametri:
     * --) il primo parametro e' l'array a;
     * --) il secondo parametro e' un array b, passatogli da e2, che
     * verra' restituito come risultato;
     * --) il terzo parametro e' l'indice che individua 
     * l'intervallo di lavoro sull'array a;
     * --) il quarto parametro e' l'indice che individua il prossimo
     * elemento di b in cui inserire un valore. 
     * -) e2R scrive nell'array b, 
     * ogni elemento di a di posizione pari, nell'ordine in cui compare.
     * Quindi, in generale, b contiene meno elementi di quelli di a.
     * Per metodo ricorsivo *controvariante* intendiamo che il parametro 
     * che guida la ricorsione cresce al decrescere della
     * difficolta' della porzione di problema che resta da risolvere.  
	 * Scrivere la soluzione immediatamente qui sotto.                */
	 
	 static int[] e2(int[] a){
		 if(a == null)
			 return null;
		 else if(a.length == 0)
			 return new int[0];
		 else{
			int n = (a.length % 2 == 0) ? (a.length / 2) : (a.length / 2) + 1;
			int[] b = new int[n];
			e2R(a,b,0,0);
			return b;
		 }
	 }
	 
	 static void e2R(int[] a, int[] b, int posA, int posB){
		 if(posA != a.length && posB != b.length){
			 if(posA % 2 == 0)
				b[posB] = a[posA]; 
			e2R(a,b,posA+2,posB+1);
		 }
	 }
	 
	/** ESERCIZIO 3 (Massimo 2 + 2 + 3 + 3 punti -- da consegnare a mano)	 
     * Sia P(i) il seguente predicato:
     * 
	 *   "true&a[0]&&...&&a[j-2]==r all'inizio dell'iterazione i".
	 *   
	 * Dato il metodo e3, dimostrare che, per ogni valore i>=0,
	 * il predicato P(i) e' vero, usando il principio di induzione:
	 * 1) formulare esplicitamente la base               (2 pt.) 
	 * 2) formulare esplicitamente il passo induttivo    (2 pt.) 
	 * 3) dimostrare che il predicato al punto 1 e' vero (3 pt.)
	 * 4) dimostrare che il predicato al punto 2 e' vero (3 pt.)      
	 */
	public static boolean e3(boolean[] a) {
		boolean r = true;
		int j = 1;
		// prima di ogni iterazione
		while (j-1 < a.length) {
			// inizio dell'iterazione i >= 0
			j = j+1;
			r = r&&a[j-2];
			// inizio dell'iterazione i+1 > 0
		}
		return r;
	}
	
	/** ESERCIZIO 4 (Massimo 8 punti -- da consegnare a mano).
	 * Scrivere lo stato della memoria della JVM giusto prima della 
	 * disallocazione del frame di attivazione del metodo m in cui 
	 * valore di i e' 0.                                            */

	public static void m(boolean[] a, int i, boolean[] b) {
		if (i == 0) {
			b[b.length - 1] = true;
		} else {
			b[i - 1] = a[i];
			m(a, i - 1, b);  // indirizzo ritorno (B)
		}
	}

	/******************************************/
	public static void main(String[] args) {
		boolean[] a = { true, false, true };
		boolean[] b = new boolean[a.length];
		m(a, a.length - 1, b); // indirizzo ritorno (A)
	}
}

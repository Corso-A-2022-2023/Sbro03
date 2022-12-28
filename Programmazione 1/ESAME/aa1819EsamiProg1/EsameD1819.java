/**
 * ESAME PROGRAMMAZIONE 1 07/02/19 mattina
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
public class EsameD1819 {

	/**
	 * ESERCIZIO 1 (Massimo 7 punti -- da consegnare elettronicamente).
	 * Scrivere un metodo iterativo e1 con le seguenti caratteristiche:
	 * -) e1 ha come unico parametro m un array bidimensionale (matrice) 
	 * di interi; 
	 * -) e1 restituisce true se, per ogni riga, tranne l'ultima,
	 * esiste almeno un elemento che sia strettamente minore di quello 
	 * che occupa la stessa posizione, ma nella riga successiva. 
	 * In ogni altro caso e1 restitusce false.
	 * ATTENZIONE: m[i][j] si riferisce all'elemento di m di riga i e 
	 * colonna j; m.length si riferisce al numero di righe di m;
	 * m[i].length e' il numero di elementi della riga i.
	 * SCRIVERE la soluzione immediatamente qui sotto.               
	 */
		
	public static boolean e1(int[][] m){
		boolean trovato = true; 
		//Questo valore mi dice se tutte le righe soddisfano la proprietà
		if(m != null && m.length > 1){	
			for(int i = 0; i < m.length-1 && trovato; i++){
				boolean flag = false;
				//Questo controlla se l'elemento in posizione i è
				//minore dell'elemento in posizione i+1
				if(m[i] != null && m[i].length != 0){
					for(int j = 0; j < m[i].length && !flag; j++){
						if(m[i+1] != null){
							flag = m[i][j] < m[i+1][j];
						}
					}
					trovato = flag;
				}else{
					trovato = false;
				}	
			}
		}else{
			trovato = false;
		}
		return trovato;
	}	
		
	/**
	 * ESERCIZIO 2 (Massimo 7 punti -- da consegnare elettronicamente).
	 * Scrivere un metodo involucro (wrapper o guscio) void e2 tale che:
	 * -) e2 ha un parametro a, di tipo array di booleani;
	 * -) e2 modifica l'array a, la quale puo' avere struttura arbitraria,
	 * richiamando un metodo void ricorsivo dicotomico e2R 
	 * (due indici individuano l'intervallo su cui opera e2R) con le seguenti 
	 * caratteristiche:
	 * --) e2R riscrive ogni cella in a di posizione dispari con la congiunzione 
	 * tra il contenuto della cella precedente ed il contenuto di quella successiva, 
	 * ammesso che entrambe esistano.
	 * Scrivere la soluzione immediatamente qui sotto.
	 */
	 
	 
	 public static void e2(boolean[] a){
		 if(a != null && a.length > 2)
			e2R(a, 0, a.length - 1);
	 }
	 
	 public static void e2R(boolean[] a, int l, int r){
		if(l == r){
			if(l % 2 == 1)
				if(l > 0 && l < a.length-1)
					a[l] = a[l-1] && a[l+1];
		 }else{				
			int m = (l + r) / 2;
			e2R(a,l,m);
			e2R(a,m+1,r);
		 }
	 }
	
	/** ESERCIZIO 3 (Massimo 2 + 2 + 3 + 3 punti -- da consegnare a mano)	 
	 * Sia P(n) il seguente predicato:
	 *        e3(a, n) == 10*a[0]*...*a[n-1] .
	 * Dato il metodo e3, dimostrare che, per ogni valore n>=0,
	 * il predicato P(n) e' vero, usando il principio di induzione:
	 * 1) formulare esplicitamente la base               (2 pt.) 
	 * 2) formulare esplicitamente il passo induttivo    (2 pt.) 
	 * 3) dimostrare che il predicato al punto 1 e' vero (3 pt.)
	 * 4) dimostrare che il predicato al punto 2 e' vero (3 pt.)      */
	public static int e3(int[] a, int n) {
		if (n>0)
			return e3(a, n-1)*a[n-1];
		else
			return 10;
	}
	 
	/** ESERCIZIO 4 (Massimo 8 punti -- da consegnare a mano).
	 * Scrivere lo stato della memoria della JVM giusto prima della 
	 * disallocazione del frame di attivazione del metodo m, 
	 * in cui il valore del parametro i e' pari ad 1.                     */
	public static void m(boolean[] a, int i) {
		if (i>0) {
			boolean t = a[i-1];
			a[i-1] = a[i];
			a[i] = t;
			m(a,i-1); // (B)
		} else {
			int[] x = {0};
		}	
	}
	/******************************************/
	public static void main(String[] args) {
		boolean[] a = {true,false};
		m(a,a.length-1); // (A)
	}
}

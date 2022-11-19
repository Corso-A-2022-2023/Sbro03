
// Esercizio: Scambio di variabili all'interno del metodo main
// utilizzando delle variabili di supporto
public class ScambioVariabiliSoluzione {

    /* main è il metodo principale, che avvia il programma. 
     * Serve alla macchina virtuale, cioè al comando java per 
     * iniziare l'esecuzione del codice Java 
     * nel file ScambioVariabili.class */
    public static void main(String[] args) {
        int x = 3;  // RICORDA: il ';' separa due istruzioni in sequenza
        int y = 5;
        System.out.println("Prima dello scambio: x = " + x + ", y = " + y);

        // Prima soluzione (modo canonico con variabile di supporto t)
        int t = x;
        x = y;
        y = t;
        System.out.println("Dopo lo scambio:     x = " + x + ", y = " + y);

        // Seconda soluzione (aritmetica, non usa la variabile di supporto)
        x = x + y;    // x' = x + y
        y = x - y;    // y' = x' - y = (x + y) - y = x
        x = x - y;    // x" = x' - y' = (x + y) - x = y
        System.out.println("Dopo il 2o scambio:  x = " + x + ", y = " + y);

    } // fine del main
    
} // fine della classe

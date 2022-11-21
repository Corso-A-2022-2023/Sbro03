
/**
 * Calcolare la circonferenza di un cerchio. 
 */
public class Circonferenza {

    public static void main(String[] args) {
        // Costante che rappresenta il pi greco
        final double PI_GRECO = 3.1415926535;
        // DOMANDA: per quale motivo questa variabile è dichiarata final?

        // Chiediamo all'utente il raggio
        System.out.print("Inserisci il raggio del cerchio: ");
        // Uso i metodi della classe SIn per ottenere il valore in virgola
        double raggio = SIn.readDouble();
        
        // Calcolo la circonferenza
        // ESERCIZIO: completare il codice
        //??? circonferenza = ????
		
		double circonferenza = 2* (PI_GRECO * raggio);
                
        System.out.println("La circonferenza del cerchio e': " + circonferenza);
    }
}

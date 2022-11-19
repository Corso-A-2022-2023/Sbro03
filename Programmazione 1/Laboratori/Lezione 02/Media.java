
/** Media: Calcola la media di 3 numeri interi letti da tastiera.
 * Seguono diverse implementazioni del calcolo della media, che differiscono
 * per il tipo utilizzato per effetuare le operazioni.
 * Provare ad eseguire il programma con i valori 2, 3, 3, o con 8, 2, 3.
 */
public class Media {

    public static void main(String[] args) {
        int x, y, z;

        System.out.println("Introduci il primo numero (per es. 8): ");
        x = SIn.readInt();
        System.out.println("Introduci il secondo numero (per es. 2): ");
        y = SIn.readInt();
        System.out.println("Introduci il terzo numero (per es. 3): ");
        z = SIn.readInt();

        // divisione intera
        int media1 = (x + y + z) / 3;
        System.out.println("int media1: (x+y+z)/3 = " + media1
                + " (divisione intera)");

        // divisione intera e cast a double
        double media2 = (x + y + z) / 3;
        System.out.println("double media2: (x+y+z)/3 = " + media2
                + " (divisione intera e cast a double)");

        // divisione con virgola - risultato atteso!!
        double media3 = (x + y + z) / 3.0;
        System.out.println("double media3: (x+y+z)/3.0 = " + media3
                + " (divisione in virgola)");

        // ESERCIZIO: 
        // Consideriamo tre varianti per calcolare media3: 
        // double media3 = (x + y + z) / 3.0; Risultato 2.333
        // double media3 = (double)(x + y + z) / 3; Risultato 2.3333
        // double media3 = (double)((x + y + z) / 3); Risultato 2.0 
        // Cosa fanno rispettivamente? 
        // Quali sono i tipi delle operazioni intermedie?
        // Dove avviene il cast da int a double nelle tre varianti?
        
        
        System.out.println("");
        // arrotondiamo il valore di media3 ad intero
        System.out.println("(int)media3 = " + (int) media3);
        System.out.println("(int)Math.round(media3) = " + (int) Math.round(media3));

        
        // ESERCIZIO: qual é la differenza tra i due modi di arrotondamento proposti?
        // Provare usando in input i valori 1,2,5
        
		//Risposta : nel primo caso arrotonda per difetto nel secondo per eccesso
        
        System.out.println("");
        // Problemi imprevisti dovuti a range di numeri finito,
        // che portano a rappresentazione binaria approssimata
        double f = 4.35;
        System.out.println((int)(f * 100)); // provare Math.round prima del cast!
        
        
        // DOMANDA: spiegare per quale motivo il codice (int)(f * 100) non
        // produce il valore atteso (435).
		
		//Risposta : quando fa il calcolo lui pensa di avere un numero simile a 434.99999
		//e quando mettiamo int approssima per difetto
    }
}

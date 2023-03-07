class Calcolatrice { //classe non eseguibile e non pubblica
    // la memoria di una calcolatrice e' una pila che contiene fino a 100 interi.
    // L'ultimo intero e' il risultato delle operazioni fatte finora
    // e la prossima operazione agisce sugli ultimi due interi a,b
    // e li rimpiazza con a+b (per una addizione) oppure a*b (per una moltiplicazione)

    // stack = pila che contiene fino a 100 interi */
    private int[] stack;

    // size = numero di interi presenti nella pila: all'inizio 0
    // le posizioni occupate dell'array hanno indice: 0, 1, ..., size-1
    private int size;


    //Modifiche per esercizio 6
    //Metodo set() per il campo stack
    public void setCalcolatrice(int[] a, int s){
	    stack = a;
	    size = s;
    }
    //Fine modifiche per esercizio 6

    // push(x): aggiunge un intero x allo stack dopo la parte utilizzata
    // e aumenta di 1 la parte di stack utilizzata (variabile size)
    private void push(int x) {
         stack[size] = x;
         size++;
    }

    // pop(): restituisce l'ultima intero dello stack
    // e lo "cancella" riducendo di 1 la parte di stack utilizzata (variabize size)
    private int pop() {
        size--;
	return stack[size];
    }
    private void stampa() {
        System.out.println("Dimensione: " + size);
        for(int i = 0; i < size; i++){
            System.out.println(stack[i]);
        }
    }

    // questo e' un metodo pubblico
public int esegui(String istruzioni) {
        int numeroIstruzioni = istruzioni.length(); //lunghezza
        int pc = 0; // inizio leggendo la prima istruzione, in posizione 0

        while (pc < numeroIstruzioni) { //eseguo le istruzioni in ordine
            char c = istruzioni.charAt(pc); //c = carattere di posto pc

            if (c >= '0' && c <= '9') { //vero se c e' una cifra
                push(c - '0');  //questa formula mi da' il valore della cifra c
            } 
            else if (c == '+') {
                int ultimo = pop(); //risultato ultimo calcolo
                int penultimo = pop(); //risultato penultimo calcolo
                push(penultimo + ultimo);
            } 
            else if (c == '*') {
                int ultimo = pop(); //risultato ultimo calcolo
                int penultimo = pop(); //risultato penultimo calcolo
                push(penultimo * ultimo);
            }
            else if (c == '-') {
                int ultimo = pop(); //risultato ultimo calcolo
                int penultimo = pop(); //risultato penultimo calcolo
                push(penultimo - ultimo);
            }
            else if (c == '/') {
                int ultimo = pop(); //risultato ultimo calcolo
                int penultimo = pop(); //risultato penultimo calcolo
                push(penultimo / ultimo);
            }
            else if (c == '%') {
                int ultimo = pop(); //risultato ultimo calcolo
                int penultimo = pop(); //risultato penultimo calcolo
                push(penultimo % ultimo);
            }
            else if (c == '#') {
                stampa();
            }

            pc++; // passiamo alla prossima istruzione
        }

        return pop(); //alla fine restituisco l'ultimo risultato ottenuto
    }
}


// Un esperimento di uso della classe calcolatrice
// Classe eseguibile pubblica, deve stare in CalcolatriceDemo.java
public class CalcolatriceDemo {
    public static void main(String[] args) {
        Calcolatrice C = new Calcolatrice();

        //Modifiche per esercizio 6
        int [] stack = new int[100];
        int size = 0;
        C.setCalcolatrice(stack, size);
        //Fine modifiche per esercizio 6

        //Esercizio 1
        System.out.println("Esercizio 1\n");
        System.out.println("Calcolo espressione (15 + 16) x 17");
        System.out.println(C.esegui( "96+97++98+*" ) + "\n");

        System.out.println("Calcolo il fattoriale di 10");
        System.out.println(C.esegui( "12345678991+*********" ) + "\n");

        System.out.println("Trovo un valore negativo senza modificare il codice");
        System.out.println(C.esegui( "3333333333333333333333333333333333*********************************" ) + "\n");

        //Esercizio 2
        System.out.println("Esercizio 2\n");

        System.out.println("Calcolo espressione 12-");
        System.out.println(C.esegui( "12-" ) + "\n");

        System.out.println("Calcolo espressione 32/");
        System.out.println(C.esegui( "32/" ) + "\n");

        System.out.println("Calcolo espressione 53%");
        System.out.println(C.esegui( "53%" ) + "\n");

        //Esercizio 3
        System.out.println("Esercizio 3\n");

        System.out.println("Prova stampa");
        System.out.println(C.esegui( "12#-" ) + "\n");

        //Esercizio 4
        System.out.println("Esercizio 4"); 
        System.out.println("Espressione 2n + 1");
        System.out.println(C.esegui( "12*1+" ) + "\n");

        //Esercizio 5
        System.out.println("Esercizio 5"); 
        System.out.println("0 e 1");
        System.out.println(C.esegui( "27*2%") + "\n");
        System.out.println(C.esegui( "77*2%") + "\n");

        //Esercizio 6
        System.out.println("Esercizio 6"); 
        System.out.println(C.esegui( "26+") + "\n");
    }
}
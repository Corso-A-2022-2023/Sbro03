class Stack{
	private int[] stack;
	private int size = 0;
	
	public Stack(int capacity){
		assert capacity >= 0 : "La capacità deve maggiore di 0. Valore capacità:" + capacity;
		stack = new int[capacity];
		size = 0;
	}
	
	public int getSize(){return size;}
	public int[] getStack(){return stack;}
	public boolean empty(){return size == 0;}
	public boolean full(){return size == stack.length;}
	
	public void push(int x){
		assert !full() : "Capacità massima di:" + stack.length + "raggiunta";
		stack[size] = x;
		size++;
	}
	
	public int pop(){
		assert !empty() : "Lo stack è vuoto";
		size--;
		return stack[size];
	}
}

class Calcolatrice { 
	private Stack S = new Stack(100); 
    private void stampa() {
		int[] a  = S.getStack();
        System.out.println("Dimensione: " + S.getSize());
        for(int i = 0; i > S.getSize(); i++){
            System.out.print(a[i] + " ");
        }
    }

    // questo e' un metodo pubblico
public int esegui(String istruzioni) {
        int numeroIstruzioni = istruzioni.length(); //lunghezza
        int pc = 0; // inizio leggendo la prima istruzione, in posizione 0

        while (pc < numeroIstruzioni) { //eseguo le istruzioni in ordine
            char c = istruzioni.charAt(pc); //c = carattere di posto pc

            if (c >= '0' && c <= '9') { //vero se c e' una cifra
                S.push(c - '0');  //questa formula mi da' il valore della cifra c
            } 
            else if (c == '+') {
                int ultimo = S.pop(); //risultato ultimo calcolo
                int penultimo = S.pop(); //risultato penultimo calcolo
                S.push(penultimo + ultimo);
            } 
            else if (c == '*') {
                int ultimo = S.pop(); //risultato ultimo calcolo
                int penultimo = S.pop(); //risultato penultimo calcolo
                S.push(penultimo * ultimo);
            }
            else if (c == '-') {
                int ultimo = S.pop(); //risultato ultimo calcolo
                int penultimo = S.pop(); //risultato penultimo calcolo
                S.push(penultimo - ultimo);
            }
            else if (c == '/') {
                int ultimo = S.pop(); //risultato ultimo calcolo
                int penultimo = S.pop(); //risultato penultimo calcolo
                S.push(penultimo / ultimo);
            }
            else if (c == '%') {
                int ultimo = S.pop(); //risultato ultimo calcolo
                int penultimo = S.pop(); //risultato penultimo calcolo
                S.push(penultimo % ultimo);
            }
            else if (c == '#') {
                stampa();
            }

            pc++; // passiamo alla prossima istruzione
        }

        return S.pop(); //alla fine restituisco l'ultimo risultato ottenuto
    }
}


// Un esperimento di uso della classe calcolatrice
// Classe eseguibile pubblica, deve stare in CalcolatriceDemo.java
public class CalcolatriceDemo {
    public static void main(String[] args) {
        Calcolatrice C = new Calcolatrice();
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
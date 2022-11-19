public class AritNatIter {

    // metodo che implementa la somma di due numeri x e y, 
    // attraverso incrementi progressivi di +1. 
    // L'argomento y non può essere negativo.
    public static int somma(int x, int y) { // x, y parametri formali
        int s = x;
        int i = 0;
        while (i < y) {
            s = s + 1;
            i = i + 1;
        }
        return s;
    }

    // il metodo moltiplicazione restituisce il prodotto tra x ed y.
    // Il prodotto viene realizzato attraverso incrementi successivi di +1.
    public static int moltiplicazione(int x, int y) { // x, y parametri formali 
        int m = 0;
        int i = 0;
        while (i < y) {
            m = somma(m, x); // chiamiamo somma sui parametri attuali m e x
            // risultato: m' = m+x
            i = i + 1;
        }
        return m;
    }
	public static int max(int x , int y){
		/*
			creazione della funzione max con parametri x e y (es 5,10)
		*/
		int max = 0;//max = 0 
		if(x>y){
			/*se la x è più grande della y */
			max = x;// allora max = x
		}
		else{
			/*
			altrimenti
			*/
			max = y;//max = y
		}
		return max;//restituisce il valore della variabile max
	}
	public static int sommatoria(int x){
		/*
		creazione della funzione sommatoria con parametri x (es 5)
		*/
		int i = 0;// variabile contatore
		int sommatoria=0;//una variabile sommatoria per fare la sommatoria
		while(i<=x){
			/*
			ciclo while che parte da 0 e arriva al parametro di x
			*/
			sommatoria+=i;//operazione per la sommatoria
			i++;//Incremento della i
		}
		return sommatoria;//restituisce il valore della variabile sommatoria
	}
	public static int fattoriale(int x){
		/*
		creazione della funzione fattoriale con parametri x (es 5)
		*/
		int i = 0;//variabile contatore = 0
		int fattoriale= 1;//variabile fat per salvare il calcolo del fattoriale
		while (i<x){
			/*
			ciclo while per dire che deve arrivare al valore messo in questo caso 5
			*/
			i++;//contatore incrementato
			fattoriale = fattoriale*i;//Operazione per il fattoriale	
		}
		return fattoriale;//restituisce il valore della variabile del fattoriale
	}
	public static int potenza(int x, int y){
		/*
		funzione chiamata potenza con parametri x e y che riporterà i valori inseriti(7,5)
		*/
		int i = 0;//contatore che parte da 0
		int potenza = 1;// variabile potenza che è uguale a 1 
		while(i<y){
			/*
			ciclo while mentre la i non raggiunge la y cioè 5 allora
			*/
			potenza = potenza *x;//fai l'operazione della potenza
			i++;//incrementa di uno il risultato
		}
		return potenza;//restituisce il valore della variabile della potenza
	}

    public static void main(String[] args) {
        // Test della somma
        System.out.println("33 + 3 = " + somma(33, 3) + ", atteso: " + (33+3));
        System.out.println("4 + 0 = " + somma(4, 0) + ", atteso: " + (4+0));

        // Verifica commutatività della somma
        System.out.println(somma(33, 3) == somma(3, 33));
        System.out.println(somma(4, 0) == somma(0, 4));

        // ESERCIZIO: verificare associatività somma con alcuni esempi di test
        //            (x+y)+z == x+(y+z)


        // Test metodo moltiplicazione 
        System.out.println("523 * 13 = " + moltiplicazione(523, 13) 
            + ", atteso: " + (523*13));
        System.out.println("523 * 0 = " + moltiplicazione(523, 0) 
            + ", atteso: " + (523*0));

        // Test commutatività moltiplicazione 
        System.out.println(moltiplicazione(523, 13) == moltiplicazione(13, 523));
        System.out.println(moltiplicazione(523, 0) == moltiplicazione(0, 523));
        System.out.println(moltiplicazione(0, 13) == moltiplicazione(13, 0));

        // ESERCIZIO: verificare associatività moltiplicazione con alcuni esempi di test
        //            (x*y)*z == x*(y*z)
		
		System.out.println("Il valore massima tra 5 e 10 e' : "+max(5,10));
		System.out.println("La sommatoria di 5 e' : "+sommatoria(5));
		System.out.println("Il fattoriale di 5 e' : "+fattoriale(5));
		System.out.println("La potenza di 7^5 e' : "+potenza(7,5));
    }
}
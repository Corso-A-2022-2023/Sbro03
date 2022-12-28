public class AritNatIter {

   /* // metodo che implementa la somma di due numeri x e y, 
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

    public static void main(String[] args) {
        // Test della somma
        System.out.println("33 + 3 = " + somma(33, 3) + ", atteso: " + (33+3));
        System.out.println("4 + 0 = " + somma(4, 0) + ", atteso: " + (4+0));

        // Verifica commutatività della somma
        System.out.println(somma(33, 3) == somma(3, 33));
        System.out.println(somma(4, 0) == somma(0, 4));

        // ESERCIZIO: verificare associatività somma con alcuni esempi di test
        //            (x+y)+z == x+(y+z)
		System.out.println();
		System.out.println("Verifica associativa somma");
		System.out.println(somma(somma(3,5), 33) == somma(3, somma(5,33)));
        System.out.println(somma(somma(4,5), 0) == somma(4, somma(5,0)));
		
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
		
		System.out.println();
		System.out.println("Verifica associativa moltiplicazione");
		System.out.println(moltiplicazione(moltiplicazione(3,5), 33) == moltiplicazione(3, moltiplicazione(5,33)));
        System.out.println(moltiplicazione(moltiplicazione(4,5), 0) == moltiplicazione(4, moltiplicazione(5,0)));*/
	
	public static int somma(int x, int y) { // x, y parametri formali
        int s = x; // inizializzo s uguale a x
        int i = 0;
		// il ciclo while serve per aumentare s di 1 finchè il 
		// contatore i diventa uguale a y. In questo modo il valore 
		// di s sarà uguale a s = x + y
        while (i < y) { 
            s = s + 1;
            i = i + 1;
        }
        return s;
    }
	
	public static int moltiplicazione(int x, int y) { // x, y parametri formali 
        int m = 0;
        int i = 0;
		// la moltiplicazione è definita come la somma di un 
		// numero n per m volte.
		// Perciò creo un ciclo while per la somma di x per y volte
        while (i < y) {
            m = somma(m, x);
			/* 
				Inizializzo m come la somma di sè stesso e di x.
				In questo modo il ciclo funzionerà come vogliamo noi:
				Prima iterazione: m = 0 + x = x
				Seconda iterazione: m = x + x = 2x
				e così via per y volte e ottengo m = y * x
			*/
			
            // risultato: m' = m+x
            i = i + 1;
        }
        return m;
    }

	
	static int max(int x, int y){
		if(x > y)
			return x;
		else
			return y;
	}
	
	static int sommatoria(int n){
		if(n == 1)
			return 1;
		else
			return sommatoria(n - 1) + n;
	}
	
	static int fatt(int n){
		if(n == 0)
			return 1;
		else
			return fatt(n - 1)*n;
	}
	

	
	static int pot(int x, int y){
		int pot = 1;
		
		if(x == 0)
			return 1;
		else{
			for(int i = 1; i < y; i++)
				pot = pot * x;
		}
		return pot;
	}
		
	public static void main(String[] args){
		
		System.out.println(max(1,2));
		System.out.println();
		System.out.println(sommatoria(11));
		System.out.println();
		System.out.println(fatt(10));
		System.out.println();
		System.out.println(pot(10,5));
	}
}
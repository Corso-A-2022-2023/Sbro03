/** Massimo tra due variabili */
public class MassimoDueVariabili {

    public static void main(String[] args) {
        // Massimo tra x e y 
        // Dopo il test la variabile max contiene il massimo tra x e y
		System.out.println("Mettere 2 valori");
		
		int x = SIn.readLineInt();
		int y = SIn.readLineInt();
        int max;
        if (x > y) { // se x > y vero
            max = x;
        } else { // se x > y falso
            max = y;
        }
        System.out.println("x: " + x + ", y: " + y + ", max: " + max);
        
        
        // Secondo modo: assegnamo un valore iniziale a max pari a y, e
        // cambiamo max nel caso in cui x fosse maggiore di y
        max = y;
        if (x > y) { // se x > y vero
            max = x;
        }
        System.out.println("x: " + x + ", y: " + y + ", max: " + max);

        
        // Massimo tra x e y, con indicatore 
        // La variabile indiceMax conterrà 0 se il massimo è in x, ed 1 se è in y
        int indiceMax = 0;
        if (y > x) { // se x > y vero
            indiceMax = 1;
        }
        System.out.println("x: " + x + ", y: " + y + ", indiceMax: " + indiceMax);
        
        
        // Versione con indicatore booleano
        boolean yIsMax = true; // indica che il massimo è in y
        if (x > y) { // se x > y vero
            yIsMax = false;
        }
		if(yIsMax){
			max = y;
		}else{
			max = x;
		}
        System.out.println("x: " + x + ", y: " + y + ", yIsMax: " + yIsMax);
		System.out.println();
		System.out.println("x: " + x + ", y: " + y + ", max: " + max);

        
        
        // ESERCIZIO: stampare il massimo tra x e y, usando il valore di yIsMax 
        // per decidere quale variabile stampare.
        
        
        
        // ESERCIZIO: modificare il codice della classe per chiedere all'inizio 
        // una coppia di valori x e y, e sostituire tutti i valori pre-assegnati 
        // per x,y e x,y con questi due nuovi valori x e y.
    }
}

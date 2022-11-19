public class EserciziBooleani {

    public static void main(String[] args) {
        int a = 2;
        int b = 4;
		boolean corretto= false;
        // a) dati due interi, stampi true se il primo intero 
        //    è multiplo del secondo, false altrimenti;
		if(b%a ==0){
			corretto = true;
			System.out.println(corretto);
		}
		else{
			corretto = false;
			System.out.print(corretto);
		}
        // b) dato un intero (un voto), stampi true se tale 
        //    intero è compreso fra 1 e 30 (inclusi), false altrimenti;
	int voto = 18;
		if(voto>=1  && voto<=30){
			
			System.out.println("Incluso");
		}
		else{
			System.out.println("Escluso");
		}


        boolean b1 = true;
        boolean b2 = true;
		
        // c) dati due booleani b1 e b2, stampi a video il booleano 
        //    false, se b1 e b2 sono entrambi veri, true altrimenti;
		if(b1 == true && b2 == true){
			System.out.println("false");
		}
		else{
			System.out.println("true");
		}
        // d) dati due interi, stampi a video il massimo; se sono 
        //    uguali stampi a video "I due valori sono uguali".
		int num1 = 5;
		int num2 = 2;
		int max =0;
		if(num1<num2){
			max = num2;
			System.out.println("Il numero grande e' :"+max);
		}
		else{
			max = num1;
			System.out.println("Il numero grande e' :"+max);
		}
		
		
		
        int x1 = 3;
        int x2 = 1;
        int x3 = 2;
		int max1 =0;
        // e) dati tre interi, stampi a video il massimo (si usi una 
        //    variabile di supporto max); 
		if(x1<x2){
			if(x2<x3){
				max = x3;
				System.out.println("Il numero grande e' :"+max);
			}
			else{
				max = x2;
				System.out.println("Il numero grande e' :"+max);
			}
		}
		else{
			if(x1<x3){
				max = x3;
				System.out.println("Il numero grande e' :"+max);
			}
			else{
				max = x1;
				System.out.println("Il numero grande e' :"+max);
			}
		}
        // f) dati tre interi, stampi a video true se questi sono 
        //    ordinati in modo crescente
		int numero1=4;
		int numero2=2;
		int numero3=3;
		boolean giusto = false;
		if(numero1<numero2 && numero2<numero3){
			giusto = true;
			System.out.println(giusto);
		}
		else{
			giusto = false;
			System.out.println(giusto);
		}
		
    }
}

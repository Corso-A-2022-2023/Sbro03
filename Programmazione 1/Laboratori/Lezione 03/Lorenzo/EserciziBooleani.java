public class EserciziBooleani {

    public static void main(String[] args) {
        int a = 2;
        int b = 4;
        // a) dati due interi, stampi true se il primo intero 
        //    è multiplo del secondo, false altrimenti;
		
		/*boolean isEven = a%2 == 0;
		System.out.println(isEven);*/

        // b) dato un intero (un voto), stampi true se tale 
        //    intero è compreso fra 1 e 30 (inclusi), false altrimenti;
		
		/*int x = SIn.readLineInt();
		boolean compreso = x > 1 && x < 30;
		System.out.println(compreso);*/

        /*boolean b1 = false;
        boolean b2 = true;*/
		
        // c) dati due booleani b1 e b2, stampi a video il booleano 
        //    false, se b1 e b2 sono entrambi veri, true altrimenti;
		
		/*boolean bothTrue = b1 && b2;
		if(bothTrue){
			System.out.println(bothTrue);
		}else{
			System.out.println(!bothTrue);
		}*/
		
        // d) dati due interi, stampi a video il massimo; se sono 
        //    uguali stampi a video "I due valori sono uguali".
		
		/*int i;
		
		for(i = 0;i < 3; i++){
			int x = SIn.readLineInt();
			int y = SIn.readLineInt();
			boolean isMax = x > y;
			if(isMax){ 
				System.out.println(x);
			}else{
				System.out.println(y);
				if(x == y){
					System.out.println("x e y sono uguali");
				}
			}
		}*/
		

        
        // e) dati tre interi, stampi a video il massimo (si usi una 
        //    variabile di supporto max); 
		
		/*int i;
		int x1 = 3;
		int x2 = 1;
		int x3 = 2;
		int max;
			
		boolean isMax1 = x1 > x2;
		boolean isMax2 = x1 > x3;
		boolean isMax3 = x2 > x3;
			
		if(isMax1 && isMax2){
			max = x1;
		}else{
			if(isMax3){
				max = x2;
			}else{
				max = x3;
			}
		}
		System.out.println(max);*/

        // f) dati tre interi, stampi a video true se questi sono 
        //    ordinati in modo crescente
				
			int x1 = SIn.readLineInt();
			int x2 = SIn.readLineInt();
			int x3 = SIn.readLineInt();
			
			boolean areCrescent = x1 > x2 && x2 > x3;
			if(areCrescent){
				System.out.println("I numeri sono in ordine crescente");
			}else{
				System.out.println("I numeri non sono in ordine crescente");
			}
	}
}

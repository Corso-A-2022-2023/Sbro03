public class Asterischi{
	
	public static void rettangoloAsterischi(int l, int h){
		for(int i = 0; i < h; i++){ //ciclo for per le righe
			for(int j = 0; j < l; j++) //ciclo for per stampare un asterisco nella riga i
				System.out.print("* ");
			System.out.println();
		}
	}
	
	public static void main(String[] args){
		rettangoloAsterischi(5, 3);
		System.out.println();
		rettangoloAsterischi(12, 4);
		System.out.println();
		rettangoloAsterischi(8, 2);
		System.out.println();
		rettangoloAsterischi(3, 3);
		System.out.println();
	}
}
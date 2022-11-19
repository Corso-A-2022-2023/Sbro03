public class Asterischi{
	public static void main (String [] args){
		int b= 3;//Base del rettangolo
		int h = 5;//Altezza del rettangolo
		System.out.println("Base :"+b);
		System.out.println("Altezza :"+h);
		rettangoloAsterischi(b,h);//Riporto della funzione del rettangolo
	}
	public static void rettangoloAsterischi(int b, int h){
		/*Creazione della funzione con il riporto della base e l'altezza di un rettangolo*/
		
		/*Un rettangolo è una matrice che inserendo 
		la base che sono le righe e l 'altezza le colonne otteniamo*/
		for(int i = 0; i < b; i++){
			/*For per la lettura delle righe*/
			for(int j = 0; j < h;j++){
				/*For per la lettura delle colonne*/
				System.out.print("*");//Stampa in asterischi del rettangolo
			}
			System.out.println();//fine delle colonne e si va per generare una nuova riga
		}
	}
	
}
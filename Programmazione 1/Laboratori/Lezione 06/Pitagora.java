public class Pitagora{
	
	public static void tavolaPitagorica(int righe, int colonne){
		for(int i = 1; i <= righe; i++){ //ciclo for per le righe
			for(int e = 1; e <= colonne; e++){ 
				//ciclo for per dare ogni numero della tavola numerica
				System.out.print((e * i) + "\t");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args){
		tavolaPitagorica(10,10);
	}
}
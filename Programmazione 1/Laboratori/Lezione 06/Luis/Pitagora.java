public class Pitagora{
	public static void main ( String [] args){
		int i=10; //riga
		int j=10;//colonna
		tavolaPitagorica(i,j);//riporta riga e colonna 
		
	}
	public static void tavolaPitagorica(int riga , int colonna){
		/*Creazione della funzione vuota 
		tavolaPitagorica per 10x10  con i parametri della riga e della colonna
		*/
		int i = 0;
		int j = 0;
			for(i = 1; i<=riga;i++){
				/*for che parte dalla tabellina del 1 e arriva a 10*/
				for(j= 1; j<=colonna; j++){
					/*for per le colonne che parte da 1 e arriva a 10*/
					if( i*j <= 9){
						/*if per la generazione degli spazi*/
						System.out.print(" ");
					}
					if(i*j ==100){
						/*quando arriva a 100 allora togli lo spazio di sinistra*/
						System.out.print(i*j+" ");
					}
					else{
						/*spazio di sinistra e destra*/
						System.out.print(" "+i*j+" ");
					}
				}
			System.out.println();	//quando finisce la colonna vai a capo
			}
	}
}
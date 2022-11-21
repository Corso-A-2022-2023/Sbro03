public class Freccia{
	
	static void rigaCresce(int n, int m){
		for(int i = 0; i < n; i++){
			for(int e = 1; e <= i; e++)
				System.out.print(".");
			for(int d = 0; d < m; d++){
				System.out.print("*");
			}
			System.out.println();
		}
		/*
			Con questo ciclo for stampo la prima metà della freccia
			e aumento i numeri di pallini
			
			Esempio:
			
			*****
			.*****
			..*****
			...*****
			....*****
			.....*****
			
		*/
	}
	
	static void rigaDecresce(int n, int m){
		for(int i = (n - 1); i > 0; i--){
			for(int e = (i - 2); e >= 0; e--)
				System.out.print(".");
			for(int d = 0; d < m; d++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		/*
			Con questo ciclo for stampo la prima metà della freccia
			e decremento i numeri di pallini
			
			Esempio:
			
			....*****
			...*****
			..*****
			.*****	
			*****
			
		*/
	}
	
	static void stampaRiga(int n, int m){
		rigaCresce(n, m);
		rigaDecresce(n, m);
	}
	
	public static void main(String[] args){
	
		System.out.println("Inserisci un numero per i puntini:");
		int x = SIn.readInt();
		System.out.println();
		System.out.println("Inserisci un numero per gli asterischi:");
		int y = SIn.readInt();
		
		stampaRiga(x, y);
	
	}
}

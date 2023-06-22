public class Freccia{
	
	static void rigaCresce(int n){
		for(int i = 0; i < n; i++){
			for(int e = 1; e <= i; e++)
				System.out.print(".");
			System.out.println("**");
		}
	}
	
	static void rigaDecresce(int n){
		for(int i = (n - 1); i > 0; i--){
			for(int e = (i - 2); e >= 0; e--)
				System.out.print(".");
			System.out.println("**");
		}
	}
	
	public static void main(String[] args){
	
		System.out.println("Inserisci un numero:");
		int x = SIn.readInt();
		System.out.println();
		
		rigaCresce(x);
				
		rigaDecresce(x);
	
	}
}
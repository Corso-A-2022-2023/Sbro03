public class Floyd{
	public static void main(String[] args){
		
		int n = SIn.readLineInt();
		int numero = 1;
		int x = 1;
		System.out.println();
		//ciclo for per le righe
		for(int i = 0; i < n; i++){
			numero++;
			for (int c = 1; c < numero; c++){
				System.out.print(x + " ");
				x++;
			}
			System.out.println();
		}
	}
}
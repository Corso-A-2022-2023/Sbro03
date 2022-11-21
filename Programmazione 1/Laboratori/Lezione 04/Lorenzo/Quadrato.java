public class Quadrato{
	public static void main(String[] args){
		
		int n = SIn.readLineInt();
		int pos = 0;
		
		for(int i = 0; i < n; i++){
			for(int c = n - pos; c < n; c++){
				System.out.print("*" + " ");
			}
			
				System.out.print("\\" + " ");
			
			for(int d = (n - pos) -1; d > 0; d--){
				System.out.print(":" + " ");
			}
			System.out.println();
			pos++;
		}
		
	}
}
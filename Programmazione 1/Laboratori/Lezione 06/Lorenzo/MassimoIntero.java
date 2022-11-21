public class MassimoIntero{
	
	public static int ricercaMassimo(int n, int m){
		if(n > m)
			return n;
		else
			return m;
	}
	
	public static void main(String[] args){
		
		System.out.println("Metti un nunero: ");
		int x = SIn.readInt();
		int n = x;
		
		while(x =! 0){
			System.out.println("Metti un nunero: ");
			x = SIn.readInt();
			ricercaMassimo(x, n);
			n = ricercaMassimo(x, n);
		}
		if(x == 0){
			System.out.print("Il massimo è: " + ricercaMassimo(x, n));
		}
		
	}
}
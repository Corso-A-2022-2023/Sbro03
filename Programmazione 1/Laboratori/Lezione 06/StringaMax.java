public class StringaMax{
	
	public static String ricercaMassimo(String a, String b){
		if(a.length() > b.length())
			return a;
		else
			return b;
	}
	
	public static void main(String[] args){
		
		System.out.println("Metti una parola: ");
		String x = SIn.readLine();
		String n = x;
		
		while(x.length() > 0){
			System.out.println("Metti una parola: ");
			x = SIn.readLine();
			ricercaMassimo(x, n);
			n = ricercaMassimo(x, n);
		}
		if(x == ""){
			System.out.print("Il massimo è: " + ricercaMassimo(x, n));
		}
		
	}
}
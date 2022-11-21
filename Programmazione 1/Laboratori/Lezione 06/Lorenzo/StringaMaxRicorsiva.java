public class StringaMaxRicorsiva{
	public static String ricercaMassimo(){
		System.out.println("Metti una parola: ");
		String a = SIn.readLine();

		if(a.length() == 0)
			return "";
		
		String b = ricercaMassimo();
		if(a.length() > b.length())
			return a;
		else return b;
	}
	
	public static void main(String[] args){
		System.out.print("La stringa più lunga è: " + ricercaMassimo());
	}
}
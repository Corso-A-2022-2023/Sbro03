public class TestInversioneStringa{
	public static void exe(){
		String a = " ";
		do{
			System.out.println("Scrivi una frase:");
			a  = SIn.readLine();
			System.out.println(MetodiRicorsivi.stringaInversa(a, 0));
			System.out.println();
		}while(a != "");
	}
}
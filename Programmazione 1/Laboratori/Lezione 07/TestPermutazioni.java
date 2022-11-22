public class TestPermutazioni{
	public static void exe(){
		System.out.println("Metti una parola");
		String a = SIn.readLine();
		System.out.println();
		System.out.println("Le permutazioni di " + a + " sono:");
		MetodiRicorsivi.permutazioniStringa(a);
	}
}
public class TestPalindromi{
	public static boolean testPalindromi(String a){
		return MetodiRicorsivi.palindroma(a);
	}
	
	public static void exe(){
		for(int i = 0; i < 5; i++){
			String a = SIn.readWord();
			if(testPalindromi(a)){
				System.out.println(a + " è palindroma");
			}else{
				System.out.println(a + " non è palindroma");
			}
			System.out.println();
		}
	}
}
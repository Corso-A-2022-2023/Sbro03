public class TestVocali{
	
	public static void controlloVocali(String str, char a){
		int num = MetodiRicorsivi.contaCarattereW(str, a);
		//boolean boo = MetodiRicorsivi.trovaCarattereW(str, a);
		System.out.println("Numero di occorenze vocale " + a + ": " + num);
		if(num > 0){
			System.out.println("La vocale " + a + " è presente");
		}else{
			System.out.println("La vocale " + a + " non è presente");
		}
		System.out.println();
	}
	
	public static void exe(){
		System.out.println("Inserisci una stringa: ");
		String a = SIn.readWord();
		char[] vocali = {'a','e','i','o','u', 'A', 'E', 'I', 'O', 'U'};
		for(int i = 0; i < vocali.length; i++){
			char input = vocali[i];
			controlloVocali(a,input);
		}
	}
}
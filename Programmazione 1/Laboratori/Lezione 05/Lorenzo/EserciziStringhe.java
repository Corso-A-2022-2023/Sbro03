public class EserciziStringhe{
	
	public static boolean testVocale(char a){
		String vocali = "AEIOUaeiou";
		boolean flag = false;
		for(int i = 0; i < vocali.length(); i++){
			if(vocali.charAt(i) == a) 
				/* 
					controlloche ogni carattere della stringa vocali 
					sia uguale al char a.
					Se è uguale allora char a è una vocale altrimenti non lo è
				*/
				return true;
		}
		return false;
	}
	
	public static void stampaVocali(String x){
		for(int i = 0; i < x.length(); i++){
			if(testVocale(x.charAt(i)))
				System.out.print(x.charAt(i));
		}
	}
	
	public static void main(String[] args){
		String a = SIn.readLine();
		
		stampaVocali(a);
	}
}
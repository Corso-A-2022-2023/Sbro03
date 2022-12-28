public class SceltaSuInteri {
	public static void main(String[] args){
		
		int x = SIn.readLineInt();
		
		if(x%2 == 0 && x%4 == 0){
			System.out.println("x è multiplo di 4");
			if(x%3 == 0){
				System.out.println("x è multiplo di 3");
			}
		}else{
			System.out.println("x non è multiplo di 4");
			if(x%3 == 0){
				System.out.println("x è multiplo di 3");
			}else{
				System.out.println("x non è multiplo di 3");
			}
		}
	}
}
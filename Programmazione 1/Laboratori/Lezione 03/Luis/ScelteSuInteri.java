public class ScelteSuInteri{
	public static void main ( String [] args){
		System.out.println("Inserisci numero :");
		int n1 = SIn.readLineInt();
		if(n1%2==0){
			if(n1%4==0){
				System.out.println("Multiplo di 4");
			}
			else{
				System.out.println("non multiplo di 4");
				}
		}
		
		if(n1%3==0){
			System.out.println("Multiplo di 3");
		}
		else if(n1%3==0){
			System.out.println("non multiplo di 3");
		}
	}
}
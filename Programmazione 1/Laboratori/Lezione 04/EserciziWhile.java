public class EserciziWhile{
	static void stampaTutto (int n, int count){
		while(count < n){
			System.out.println(count);
			count++;
		}
		while(count >= 0){
			System.out.println(count);
			count--;
		}
	}
	
	static void stampaDispari (int n, int count){
		for(int i = 0; i <= n; i++){
			if(i%2 != 0){
				System.out.println(i);
			}
		}
	}
	
	static void stampaFattoriali (int n, int count){
		int prodotto = 1;
		
		while(count < n){
			count++;
			prodotto = prodotto * count;
		}
		
		System.out.println(prodotto);
	}
	public static void main(String[] args){
		
		int n = SIn.readLineInt();
		int count = 0;
		System.out.println();
		stampaFattoriali(n,count);
		
	}
}
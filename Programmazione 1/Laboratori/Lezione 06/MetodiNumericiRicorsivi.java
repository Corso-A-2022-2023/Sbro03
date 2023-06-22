public class MetodiNumericiRicorsivi{
	
	public static int esponenziale(int b, int e){
		if(e == 0)
			return 1;
		else
			return esponenziale(b, (e - 1)) * b;
	}
	
	public static int somma(int x, int y){
		if(x == 0 && y == 0)
			return 0;
		else if(x == 0)
			return y;
		else if(y == 0)
			return x;
		else
			return somma((x - 1),(y + 1));
	}
		
	public static int prodottoMultipli(int n, int m , int q){
		int multiplo = 0;
		
		if(n == m){
			if(n % q == 0)
				multiplo = m;
			else
				multiplo = 1;
		}else if(m > n)
			if(n % q == 0)
				multiplo = prodottoMultipli((n + 1),m,q) * n;
			else
				multiplo = prodottoMultipli((n + 1),m,q) * 1;	
		else
			if(n % q == 0)
				multiplo = prodottoMultipli((n - 1),m,q) * n;
			else
				multiplo = prodottoMultipli((n - 1),m,q) * 1;
			
		return multiplo;
	}

	public static int stampaInteroAlRovescio(int n){
		if(n == 0)
			return n;
		else
			return stampaInteroAlRovescio(n - 1) + 1;
	}
	
	public static void main(String[] args){
		
		System.out.print("Scegli un numero n: ");
		int n = SIn.readInt();
		
		System.out.println();
		
		System.out.print("Scegli un numero m: ");
		int m = SIn.readInt();
		
		System.out.println();
		
		System.out.print("Scegli un numero q: ");
		int q = SIn.readInt();
		
		System.out.println();
		
			
		System.out.print(prodottoMultipli(n,m,q));
	}
}
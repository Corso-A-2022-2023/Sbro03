public class LeggiArray{
	static int[] leggiArrayInt(){
		return leggiArrayIntRic(0);
	}
	
	static int[] leggiArrayIntRic(int i){
		System.out.print("Metti un numero: ");
		int n = SIn.readInt();
		System.out.println();
		if(n == 0){
			return new int[i];
		}else{
			int [] a = leggiArrayIntRic(i+1);
			a[i] = n;
			return a;
		}
	}
	
	static void stampaArrayInt(int[] intArray){
		stampaArrayInt(intArray, 0);
	}
	
	static void stampaArrayInt(int [] a, int i){
		if(i < a.length && a != null){
			System.out.print(a[i] + " ");
			stampaArrayInt(a,i+1);
		}else{
			System.out.println();
		}
	}
	
	public static void main(String[] args){
		int [] a = leggiArrayInt();
		stampaArrayInt(a);
	}
}
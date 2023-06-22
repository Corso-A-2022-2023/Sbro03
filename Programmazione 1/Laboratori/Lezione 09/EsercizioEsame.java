public class EsercizioEsame{
	
	static int eDue(int[] a, int[] b){
		if(a == null || b == null){
			return 0;
		}else{
			return eDueRic(a,b,0);
		}
		
	}
	
	static int eDueRic(int[] a, int[] b, int i){
		int l1 = a.length;
		int l2 = b.length;
		int length = 0;
		
		if(l1 < l2)
			length = l1;
		else
			length = l2;
		
		if(i == length-1){
			return  a[i] - b[i];
		}else{
			return (a[i] - b[i]) + eDueRic(a,b,i+1);
		}
	}
	
	public static void main(String[] args){
		final int[] a0 = {0,1,2,3,4,5,6,7}; // 16
		final int[] a1 = {3,7,9,4,5,12,11}; // 35
		final int[] a2 = null; // 0
		final int[] a3 = {0,10,40,60,20}; // 0
		
		System.out.println(eDue(a0, a1)); // -30
		System.out.println(eDue(a1, a0)); // 30
		System.out.println(eDue(a2, a3)); // 0
		System.out.println(eDue(a0, a3)); //-120
		
	}
}
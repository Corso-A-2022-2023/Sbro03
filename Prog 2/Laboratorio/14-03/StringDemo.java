class Stringa{
	public static String longest(String [] a){
		String ris = "";
		for(int i = 0; i < a.length; i++){
			ris = a[i].length() > ris.length() ? a[i] : ris;
		}
		return ris;
	}
	
	public static String concatAll(String [] b){
		String ris = b[0];
		for(int i = 1; i < b.length; i++){
			ris = ris.concat(b[i]);
		}
		return ris;
	}
	
	public static String trim(String str){
		
	}
	
	public static void main(String [] args){
		String [] a = {"a","bc","cgh"};
		System.out.println(concatAll(a));
	}
}
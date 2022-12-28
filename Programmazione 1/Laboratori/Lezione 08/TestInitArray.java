public class TestInitArray{
	
	
	public static void main(String[] args){
		/*
			Test Esercizio 1
			
			int [] a = MetodiSuArray.initArray();
			MetodiSuArray.stampaArrayInt(a);
		*/
		/*
			Test Esercizio 2
		*/
		int [] a = {1,2,3,4,5,6,7,8,9};
		int [] b = MetodiSuArray.clonaArray(a);
		
		System.out.println("Ecco l'array copiato");
		System.out.println();
		MetodiSuArray.stampaArrayInt(b);
		System.out.println();
		
		for(int i = 0; i < a.length; i++){
			if(a[i] == b[i])
				System.out.print(true + " ");
			else
				System.out.print(false + " ");				
		}
	}
	
	
}
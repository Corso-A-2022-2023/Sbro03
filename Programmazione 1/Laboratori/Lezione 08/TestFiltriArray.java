public class TestFiltriArray{
	public static void main(String[] args){
		int [] a = MetodiSuArray.initArray(); //array di input
		
		System.out.print("Metti un valore per il filtro: ");
		int n = SIn.readInt();
		//Input per filtro
		
		System.out.println();
		System.out.println();
		System.out.println("Ecco il tuo array filtrato:");
		
		//int [] b = MetodiSuArray.filtroMinoriDi(a, n);
		
		//int [] b = MetodiSuArray.filtroIntervalloDisp(a, 1, 4);
				
		//MetodiSuArray.stampaArrayInt(b); //metodo di stampa (per array di interi)
		
		boolean [] b = MetodiSuArray.trasduttore(a, n);
		MetodiSuArray.stampaArrayBoolean(b); //metodo di stampa (per array di booleani)
	}
}
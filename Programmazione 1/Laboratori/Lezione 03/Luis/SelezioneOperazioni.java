public class SelezioneOperazioni{
	public static void main (String [] args){
		System.out.println("Inserisci il numero uno :");
		int n1 = SIn.readInt();
		System.out.println("Inserisci il numero due :");
		int n2 = SIn.readInt();
		System.out.println("Inserisci il numero tre :");
		int n3 = SIn.readInt();
		System.out.println("Scegli il tipo di operazione: ");
		System.out.println("1) Somma");
		System.out.println("2) Moltiplicazione");
		System.out.println("3) Media");
		int scelta = SIn.readInt();
		if(scelta==1){
			int sum= 0;
			sum = n1+n2+n3;
			System.out.println("La somma e' :"+sum);
		}
		else if (scelta==2){
			int mol = 0;
			mol = n1*n2*n3;
			System.out.println("La moltiplicazione e' :"+mol);
		}
		else if (scelta==3){
			int media = 0;
			media = (n1+n2+n3)/3;
			System.out.println("La media e' :"+(double)(media));
		}
		else{
			System.out.println("Errore riavvii il programma");
		}
	}
}
public class MediaInput {
	public static void main (String[] args){
	
		System.out.println("Inserisci tutti i numeri che vuoi e quando hai finito digita 0:");
	
		boolean flag = true;
		int somma = 0;
		int count = 0;
	
		while(flag){
			int x = SIn.readLineInt();
			somma = somma + x;
			count++;
			if(x == 0){
				flag = false;
				System.out.println("Grazie per avermi dato i numeri");
			}
		}
		System.out.println("Media: " + (somma / (count - 1)));
	}
}
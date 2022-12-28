public class ParitaInput{
	public static void main(String[] args){
		boolean flag = true;
		boolean pari = true;
		boolean	dispari = true;
		int count = 0;
		int x = SIn.readLineInt();
	
		while(x != 0){
			x = SIn.readLineInt();
			if(x == 0){
				flag = false;
				System.out.println("Grazie per avermi dato i numeri");
			}else{
				if(x%2 == 0)
					dispari = false;
				else
					pari = false;
			}
			count++;
		}
		
		//Stampa risultati
		if((!pari && !dispari) && count != 0)
			System.out.println("Ci sono sia numeri pari che dispari");
		else{
			if(count == 0)
				System.out.println("Non ci sono numeri");
			else{
				if(pari)
					System.out.println("Tutti i numeri sono pari");
				if(dispari)
					System.out.println("Tutti i numeri sono dispari");
			}
		}
	}
}
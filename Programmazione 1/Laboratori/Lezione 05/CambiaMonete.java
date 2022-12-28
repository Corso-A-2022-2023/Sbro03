public class CambiaMonete{
	
	public static int cambioTaglio(int tot, int moneta){
		return tot / moneta;
		/*
			Con questa divisione vedo con quante monete 
			riesco ad ottenere il totale 
		*/
	}
	
	public static void main(String[] args){
		
		System.out.println("Dammi i tuoi soldi e io ti dirò con quante monete puoi cambiare:");
		int tot = SIn.readInt();
		System.out.println();
		
		if(cambioTaglio(tot, 50) != 0){
			System.out.println(cambioTaglio(tot, 50) + " da 50 cent");
			tot = tot - (cambioTaglio(tot, 50) * 50);
			/*
				In modo tale da "aggiornare" il totale delle monete 
				da cambiare:
				faccio la differenza tra il totale e il numero delle
				monete che ho dal metodo cambioTaglio() per il valore della moneta
				
				Esempio:
				
				tot = 76 cent
				con il primo if controllo se posso usare monete da 50 cent.
				In questo caso posso chiamo il metodo cambioTaglio():
				
				76 / 50 = 1
				
				Dopo aver ottenuto il numero di monete da 50 cent (1), "aggiorno"
				il totale facendo quest'operazione:
				
				76 - (1 * 50) = 76 - 50 = 26
				
				26 sarà il nostro nuovo totale per il prossimo if
			*/
		}
		if(cambioTaglio(tot, 20) != 0){
			System.out.println(cambioTaglio(tot, 20) + " da 20 cent");
			tot = tot - (cambioTaglio(tot, 20) * 20);
		}
		if(cambioTaglio(tot, 10) != 0){
			System.out.println(cambioTaglio(tot, 20) + " da 10 cent");
			tot = tot - (cambioTaglio(tot, 20) * 20);
		}
		if(cambioTaglio(tot, 5) != 0){
			System.out.println(cambioTaglio(tot, 5) + " da 5 cent");
			tot = tot - (cambioTaglio(tot, 5) * 5);
		}
		if(cambioTaglio(tot, 2) != 0){
			System.out.println(cambioTaglio(tot, 2) + " da 2 cent");
			tot = tot - (cambioTaglio(tot, 2) * 2);
		}
		if(cambioTaglio(tot, 1) != 0){
			System.out.println(cambioTaglio(tot, 1) + " da 1 cent");
			tot = tot - (cambioTaglio(tot, 1) * 1);
		}
	}
}
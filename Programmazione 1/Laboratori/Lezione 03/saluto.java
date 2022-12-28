public class saluto{
	public static void main (String[] args){
		/*
		  Scrivere un programma Saluta.java che chieda l'ora all'utente
		  e restituisca il saluto più appropriato tra:
		  Buon giorno, Buon pomeriggio, Buona sera, Buona notte.
		 */
		 int i;
		 for(i=0;i < 5;i++){
			System.out.println("Che ore sono? (Metti un numero tra 0 e 23)");
			int orario = SIn.readLineInt();
			String saluto = "";
			if(orario > 11){
				saluto = "Buon pomeriggio";
				if(orario > 18){
					saluto = "Buona sera";
				}	
			}else{
				if(orario < 6){
					saluto = "Buona notte";
				}else{
					saluto = "Buona mattina";
				}
		}
		System.out.println(saluto); 
		 }
	}
}
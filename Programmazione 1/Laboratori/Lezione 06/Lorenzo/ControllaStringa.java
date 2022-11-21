public class ControllaStringa{
	
	//metodo ausiliario
	
	public static char smontaStringa(String a, int i){
		char ris = 'a';
		if(i < a.length()){
			return a.charAt(i);
		}else return ris;
		
		/*
			Il metodo smontaStringa() serve per ottenere il carattere nella
			posizione i.
			
			PS. non avrei mai usato un metodo ausiliario per fare sta cavolata
				ma non mi ricordo se lo chiedeva l'esercizio o no quindi non
				fate i pazzoidi e non fate una cosa così inutile come questa 
		*/
	}
	
	//metodo principale
	
	public static boolean tutteCifre(String a, int i){
		boolean controllo = true;
		
		if(i == a.length() - 1){
			return controllo;
		}else{
			for(int count = i; count < a.length(); count++){
				char lettera = smontaStringa(a, count);
				controllo = (lettera >= 48) && (lettera <= 56);
			}
			/*
				Con il ciclo for vedo se ogni ogni carattere ottenuto con il
				metodo smontaStringa è un numero.
				
				PS. nella tabella ASCII, le cifre ha un codice univoco e sono 
					comprese tra 48 e 56
			*/
			return tutteCifre(a,(i + 1)) && controllo;
		}
	}
	
	public static void main(String[] args){
		String a = SIn.readWord();
		System.out.print(tutteCifre(a, 0));
	}
}
public class StringaMax{
	public static void main (String [] args){
		String s1 ="ciao";/* stringa 1 = ciao*/
		String s2 ="hola mundo";//stringa 2 = hola mundo
		String max = "";//stringa max vuota
		System.out.println("Confronto tra : "+ s1 +" e "+s2);
		if(s1.length()>s2.length()){
			/*se la stringa 1 è maggiore della stringa 2 allora */
			max = s1;//la stringa grande è la stringa 1
		}
		else{
			/*altrimenti*/
			max=s2;//la stringa più grande è la stringa 2
		}
		System.out.println("La parola piu grande e' :"+ max);//stampa il valore più grande
	}
}
class Ordine4{
	public static void main(String[] args){
		int a = 55;
		int	b = 77;
		int c = 41;
		int d = 7;
		int piccolo1;
		int piccolo2;
		int grande1;
		int grande2;
		int min = 0;
		int max = 0;
		
		if (a <= b){ //per la prima coppia decido il più grande e il più piccolo
			piccolo1 = a;
			grande1 = b;
		}
		else {
			piccolo1 = b;
			grande1 = a;
		}
		
		if (c <= d){ //per la seconda coppia decido il più grande e il più piccolo
			piccolo2 = c;
			grande2 = d;
		}
		else {
			piccolo2 = d;
			grande2 = c;
		}
		
		if (grande1 <= grande2) //confronto i due grandi e decido qual è il massimo
			max = grande2;
		else
			max = grande1;
			grande1 = grande2; // il meno grande tra i due deve essere dentro a "grande1"
		
		if (piccolo1 <= piccolo2){ // confronto i due piccoli e decido qual è il minimo
			min = piccolo1;
			piccolo1 = piccolo2; //il meno piccolo tra i due deve essere dentro a "piccolo1"
			}
		else
			min = piccolo2;
		
		if (grande1 <= piccolo1){ //confronto e metto in ordine "grande1" e "piccolo1"
			grande2 = piccolo1;
			piccolo1 = grande1;
			grande1 = grande2;
		}
		System.out.println((min) + " " + (piccolo1) + " " + (grande1) + " " + (max));	//stampa dei numeri in ordine
	}
}
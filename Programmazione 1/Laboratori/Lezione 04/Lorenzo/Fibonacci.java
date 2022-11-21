/*
Scrivere un programma Fibonacci.java che legge in input un numero N e stampa a video i primi N 
numeri della successione di Fibonacci. Ad, esempio, per N=10, l'output atteso è:
0 1 1 2 3 5 8 13 21 34
Per semplicità assumere che N>=2.
Si ricorda che la successione di Fibonacci parte da due numeri 0 e 1, ed ogni elemento successivo 
della successione è ottenuto come somma dei due elementi precedenti.
Suggerimento: partite da due numeri n=0 ed m=1 e stampateli. Poi ad ogni iterazione aggiornali in 
modo che:
n' = m, m' = n + m
e stampare m'.
Domanda: Per fare questo aggiornamento serve una variabile temporanea?
*/

public class Fibonacci {
	public static void main (String[] args){
		
		int n = 0;
		int m = 1;
		int x = SIn.readLineInt();
		
		System.out.print(n + " " + m + " ");
		if(x > 2){
			for(int i = 0; i < (x - 2); i++){
				int somma = n + m;
				System.out.print(somma + " ");
				n = m;
				m = somma;
			}
		}
			
		
	}
}
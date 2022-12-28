/*
	Scrivere un programma MinMax10.java che chiede all'utente 10 interi e successivamente stampa a 
	video la differenza tra il minimo e il massimo.
	• Si usi un ciclo for chiedendo a ogni iterazione di inserire un intero. 
	• Si usino variabili opportune per il minimo e per il massimo, inizializzate usando 
	Integer.MAX_VALUE e Integer.MIN_VALUE.
*/

public class MinMax10{
	public static void main(String[] args){
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int rec;
		
		//Stampa domanda a cliente
		System.out.println("Metti 10 numeri a caso:");
		
		//Iterazione con cliente
		for(int i = 0; i < 10; i++){
			
			int x = SIn.readInt();
			rec = x;
			
			if(x > max){
				max = x;
			}
			
			if(x < min){
				min = x;
			}
			
		}
		System.out.print("Differenza: " + (max - min));
	}
}
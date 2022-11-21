public class QuadratoInteri {
	static int quadrato(int n){
	/** Condizione di ingresso: n >= 0;
	    Condizione di uscita: quadrato(n) restituisce n*n = n^2
	*/

	if(n == 0){
//caso base
return 0;
}else{
	return quadrato(n -1) - 1 + (2 * n);
}
}
public static void main(String[] argos){
	int x = SIn.readInt();
	System.out.println(quadrato(x));
	System.out.print(x*x);
}
}

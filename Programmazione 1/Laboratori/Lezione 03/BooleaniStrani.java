public class BooleaniStrani{
	public static void main (String[] args){
		
		int a = SIn.readLineInt();
		int b = SIn.readLineInt();
		
		System.out.println( (!(a == b) || !(b != 20)) + " | " + ((a + b) >= 20) );
		System.out.println();
		
		int a = SIn.readLineInt();
		
		System.out.println( (!(a < 10) && !(a > 20)) + " | " + (a > 10 & a < 20) );
		System.out.println();
		
		int a = SIn.readLineInt();
		
		System.out.println( (!((a < 10) && (a > 20))) + " | " + (a > 20) );
		System.out.println();
		
		int a = SIn.readLineInt();
		
		System.out.println( (!(( a >= 10) && (a <= 20))) + " | " + (a) );
		System.out.println();
		
		int a = SIn.readLineInt();
		
		System.out.println( (!((a > 10) && (a <= 20))) + " | " + () );
		System.out.println();
		
		int a = SIn.readLineInt();
		int b = SIn.readLineInt();
		
		System.out.println( (!((a == 5) || !(b < 10))) + " | " + ((a + b) < 10) );
	}
}
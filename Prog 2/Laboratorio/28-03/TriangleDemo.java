class TriangleDemo{
	public static void main(String args[]){
		MutablePoint a = new MutablePoint(3,3);
		MutablePoint b = new MutablePoint(5,3);
		MutablePoint c = new MutablePoint(5,1);
		MutableTriangle t = new MutableTriangle(a,b,c);
		System.out.println("Il triangolo è");
		System.out.println(t);
		System.out.println("Traslazione di (1,1)");
		t.translate(1,1);
		System.out.println(t);
		System.out.println("Rotazione di 90 gradi");
		t.rotate(1);
		System.out.println(t);
		System.out.println("Perimetro");
		System.out.println(t.perimeter());
		System.out.println("Area");
		System.out.println(t.area());
	}
}
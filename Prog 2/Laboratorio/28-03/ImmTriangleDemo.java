class ImmTriangleDemo{

	public static void main(String args[]){
		ImmutablePoint a = new ImmutablePoint(3,3);
		ImmutablePoint b = new ImmutablePoint(5,3);
		ImmutablePoint c = new ImmutablePoint(5,1);
		ImmutableTriangle t = new ImmutableTriangle(a,b,c);
		System.out.println("Il triangolo è");
		System.out.println(t);
		System.out.println("Traslazione di (1,1)");
		ImmutableTriangle s = t.translate(1,1);
		System.out.println(s);
		System.out.println("Rotazione di 90 gradi");
		ImmutableTriangle u = t.rotate(1);
		System.out.println(u);
		System.out.println("Perimetro");
		System.out.println(t.perimeter());
		System.out.println("Area");
		System.out.println(t.area());
	}
}
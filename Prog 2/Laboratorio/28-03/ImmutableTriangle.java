class ImmutableTriangle{
	private ImmutablePoint a;
	private ImmutablePoint b;
	private ImmutablePoint c;
	
	//Metodo costruttore
	public ImmutableTriangle(ImmutablePoint a,ImmutablePoint b,ImmutablePoint c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	//Metodi get()
	public ImmutablePoint getA(){return a;}
	public ImmutablePoint getB(){return b;}
	public ImmutablePoint getC(){return c;}
	
	//Metodi set()
	public void setA(double x, double y){
      this.a = new ImmutablePoint(x,y);
    }

    public void setB(double x, double y){
      this.b = new ImmutablePoint(x,y);
    }

    public void setC(double x, double y){
      this.c = new ImmutablePoint(x,y);
    }
	
	//Metodi di calcolo
	public ImmutableTriangle translate(double dx, double dy){
		ImmutablePoint a = this.a.translate(dx,dy);
		ImmutablePoint b = this.b.translate(dx,dy);
		ImmutablePoint c = this.c.translate(dx,dy);
		
		return new ImmutableTriangle(a,b,c);
	}
	
	public ImmutableTriangle rotate(double angle){
		ImmutablePoint a = this.a.rotate(angle);
		ImmutablePoint b = this.b.rotate(angle);
		ImmutablePoint c = this.c.rotate(angle);
		
		return new ImmutableTriangle(a,b,c);
	}
	
	public double perimeter(){
		return a.distance(b) + a.distance(c) + b.distance(c);
	}
	
	public double area(){
		double f1 = a.getX() * (b.getY() - c.getY());
		double f2 = b.getX() * (c.getY() - a.getY());
		double f3 = c.getX() * (a.getY() - b.getY());
		return (f1+f2+f3) / 2;
	}
	
	public String toString(){
		String s = "A(" + a.getX() + "," + a.getY() + ")," + '\n' + "B(" + b.getX() + "," + b.getY() + "),"+ '\n' + "C(" + c.getX() + "," + c.getY() + ")";
		return s;
	}
}
//Spiegazione di cos'è un diagramma UML e di come si legge si trova su 
//https://www.ionos.it/digitalguide/siti-web/programmazione-del-sito-web/diagrammi-di-classe-con-uml/

class MutableTriangle{
	
	//Campi d'istanza privati
	private MutablePoint a;
	private MutablePoint b;
	private MutablePoint c;
	
	//Metodo costruttore
	public MutableTriangle(MutablePoint a,MutablePoint b,MutablePoint c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	//Metodi get()
	public MutablePoint getA(){return a;}
	public MutablePoint getB(){return b;}
	public MutablePoint getC(){return c;}
	
	//Metodi set()
	public void setA(double x, double y){
       this.a.setX(x);
       this.a.setY(y);
    }

    public void setB(double x, double y){
       this.b.setX(x);
       this.b.setY(y);
    }

    public void setC(double x, double y){
       this.c.setX(x);
       this.c.setY(y);
    }
	
	//Metodi di calcolo
	public void translate(double dx, double dy){
		a.translate(dx,dy);
		b.translate(dx,dy);
		c.translate(dx,dy);
	}
	
	public void rotate(double angle){
		a.rotate(angle);
		b.rotate(angle);
		c.rotate(angle);
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
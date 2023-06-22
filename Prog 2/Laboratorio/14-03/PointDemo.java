import java.lang.Math;

class Point{
	private double x;
	private double y;
	
	public Point(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	public String toString(){
		return "(" + x + "," + y + ")";
	}
	
	public double getX(){return x;}
	public double getY(){return y;}
	
	/* Inizio parte con punto "mutabile" */
	/*public void traslation(double dX, double dY){
		this.x += dX;
		this.y += dY;
	}
	
	public void rotation(double angle){
		double angleR = Math.toRadians(angle);
		double tempX = this.x;
		double tempY = this.y;
		this.x = (double) (tempX * Math.cos(angleR) + tempY * Math.sin(angleR));
		this.y = (double) (tempX * Math.sin(angleR) + tempY * Math.cos(angleR));
	}*/
	/* Fine parte con punto "mutabile"*/
	
	/* Inizio parte con punto "immutabile" */
	
	public Point traslation(double dX, double dY){
		return new Point(this.x + dX, this.y + dY);
	}
	
	public Point rotation(double angle){
		double angleR = Math.toRadians(angle);
		double tempX = this.x;
		double tempY = this.y;
		double x1 = (double) (tempX * Math.cos(angleR) + tempY * Math.sin(angleR));
		double y1 = (double) (tempX * Math.sin(angleR) + tempY * Math.cos(angleR));
		return new Point(x1, y1);
	}
	
	/* Fine parte con punto "immutabile" */
	public double distance(Point b){
		return (double) Math.sqrt(Math.pow((this.x - b.x),2) + Math.pow((this.y - b.y),2));
	}
}

class PointDemo{
	public static void main(String[] args){
		Point A = new Point(2,3);
		System.out.println("Punto A: " + A);
		
		//Prova traslazione
		Point C = A.traslation(1,2);
		System.out.println("Nuovo punto C traslato di (1,2) a partire dal punto A: " + C);
		
		//Prova rotazione
		Point D = A.rotation(90);
		System.out.println("Rotazione rispetto all'origine del punto D: " + D);
		
		//Prova distanza
		Point B = new Point(5,3);
		System.out.println("Punto B: " + B);
		System.out.println("Distanza tra il punto A(5,3) e B(8,3): " + A.distance(B));
}
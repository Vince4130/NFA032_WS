package Exercice1;

public class Point{
	
	private double x;
	private double y;
	
	public Point () {
		this.x = 0.0d;
		this.y = 0.0d;
	}
	
	public Point (double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	

}

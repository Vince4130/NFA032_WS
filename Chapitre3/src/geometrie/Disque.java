package geometrie;

public class Disque {

	public final static double PI = 3.14;
	
	public double calculerAire(double rayon) {
		return PI*rayon*rayon;
	}
	
	public double calculerPerimetre(double rayon) {
		return 2*PI*rayon;
	}
	
}

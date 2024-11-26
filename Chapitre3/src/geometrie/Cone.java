package geometrie;

public class Cone {
	
	public double rayon;
	public double hauteur;
	
	public double calculerVolume(double rayon, double hauteur) {
		
		Disque disk = new Disque();
		
		double aire = disk.calculerAire(rayon);
		
		return (aire*hauteur)/3;
	}
}

package geometrie;

public class Trapeze {

	private double grandeBase;
	private double petiteBase;
	private double hauteur;

	public Trapeze() {

	}

	public Trapeze(double grandeBase, double petiteBase, double hauteur) {
		this.grandeBase = grandeBase;
		this.petiteBase = petiteBase;
		this.hauteur = hauteur;
	}

	public double calculAire() {
		return (this.grandeBase + this.petiteBase) * this.hauteur / 2;
	}

	public double getGrandeBase() {
		return grandeBase;
	}

	public void setGrandeBase(double grandeBase) {
		this.grandeBase = grandeBase;
	}

	public double getPetiteBase() {
		return petiteBase;
	}

	public void setPetiteBase(double petiteBase) {
		this.petiteBase = petiteBase;
	}

	public double getHauteur() {
		return hauteur;
	}

	public void setHauteur(double hauteur) {
		this.hauteur = hauteur;
	}

}

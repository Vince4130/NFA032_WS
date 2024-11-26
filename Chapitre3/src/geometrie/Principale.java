package geometrie;

public class Principale {

	public static void main(String[] args) {
		Cone kone = new Cone();
		double vol = kone.calculerVolume(10, 20);
		System.out.println("Le volume du cone de rayon 10 et de hauteur 20 est : "+vol);
	}

}

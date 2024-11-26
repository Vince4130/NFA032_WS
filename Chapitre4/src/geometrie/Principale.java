package geometrie;

public class Principale {

	public static void main(String[] args) {
		
		Trapeze trapeze1 = new Trapeze(5, 3, 7.2);
		Double aire = trapeze1.calculAire();
		
		System.out.println("L'aire du trapeze de bases " + trapeze1.getGrandeBase() + " et " + trapeze1.getPetiteBase()
				+ " et de hauteur " + trapeze1.getHauteur() + " = " + aire);
		
		Trapeze trapeze2 = new Trapeze();
		trapeze2 = trapeze1;
		
		System.out.println("L'aire du 2ème trapeze est : " + trapeze2.calculAire());
	}

}

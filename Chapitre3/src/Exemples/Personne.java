package Exemples;

public class Personne {

	public String nom;
	public String prenom;
	public int age;
	public String statutMatrimonial;
	
	public String getNomComplet(String nom, String prenom) {
		String nomComplet = prenom+" "+nom;
		return nomComplet;
	}
	
	public int getAge() {
		return age;
	}
	
	public void changeStatut (String newStatut) {
		statutMatrimonial = newStatut;
	}
	
	
	public static void main(String[] args) {
		Personne pers = new Personne();
		String nomComplet = pers.getNomComplet("Durant", "Patrick");
		System.out.println("Bonjour Monsieur "+nomComplet);
	}

}
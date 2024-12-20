package exemples;

public class Personne {

	private String nom;
	private String prenom;
	private int age;
	private String statutMatrimonial;

	public Personne() {

	}

	public Personne(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}

	public Personne(String nom, String prenom, int age, String statutMatrimonial) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.statutMatrimonial = statutMatrimonial;
	}

	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getStatutMatrimonial() {
		return statutMatrimonial;
	}

	public void setStatutMatrimonial(String statutMatrimonial) {
		this.statutMatrimonial = statutMatrimonial;
	}

	public static void main(String[] args) {
		Personne pers1 = new Personne("Blanca", "Jacques");
		Personne pers2 = new Personne("Blanca", "Vincent", 51, "marié");
		
		System.out.println("Hello "+pers2.getPrenom()+" "+pers2.getNom());
		System.out.println("Vous avez "+pers2.getAge()+" ans et vous êtes "+pers2.getStatutMatrimonial());
		
		System.out.println("salut "+pers1.getPrenom()+" "+pers1.getNom());
	}
}

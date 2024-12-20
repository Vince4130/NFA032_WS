package exemples;

public class ExemplesEnum {

	public enum Civilite {
		MADEMOISELLE, MADAME, MONSIEUR
	}
	
	public enum StatutMatrimonial {
		CELIBATAIRE, PACSE, MARIE, DIVORCE
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Civilite mr = Civilite.MONSIEUR;
		Civilite[] civilites = Civilite.values();
		
		System.out.println(mr);
		
		for(int i=0; i < civilites.length; i++) {
			System.out.println(civilites[i]);
		}
		
		StatutMatrimonial statut = StatutMatrimonial.CELIBATAIRE;
		int ordre = statut.ordinal();
		
		System.out.println(ordre);
	}

}

package Exercice2;

public class SigneProduit {

	public String signe(Double a, Double b) {
		
		String signe = "positif";
		
		String signeA = a.toString();
		String signeB = b.toString();
		
		if((signeA.contains("-") && !signeB.contains("-")) || 
				(!signeA.contains("-") && signeB.contains("-"))) {
			signe = "négatif";
		}
		
		//String signe = (signeA.contains("-") && !signeB.contains("-")) ? "négatif" : ((!signeA.contains("-") && signeB.contains("-")) ? "négatif" : "positif");
		
		return signe;
	}
	
	public static void main(String[] args) {
		
		SigneProduit signeP = new SigneProduit();
		
		Double a = 1.3;
		Double b = 5.;
		
		System.out.println("Le signe du produit : "+a+"x"+b+" est "+signeP.signe(a, b));	
		
	}

}

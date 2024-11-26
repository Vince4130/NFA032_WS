package Exemples;

public class Voiture {
	
    private String marque;
    private boolean vide; 

    public static void main(String args[]) {
         Voiture vo = new Voiture();
         System.out.print("Vide = " + vo.vide);
         System.out.print(", Marque = " + vo.marque);
    }

}

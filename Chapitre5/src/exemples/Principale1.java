package exemples;

public class Principale1 {
	
	private short varS = 10;
    private Exemple1 varE = new Exemple1(("Max"));

    public short setVarS(short s) {
        s = (short) (this.varS + 5);
        return (short) s;
    }

    public void setVarE(Exemple1 e) {
    	e = this.varE;
    }
    
    public static void main(String args[]) {
        Principale1 ex = new Principale1();

        short s = 27;
        short rs = ex.setVarS(s);
        System.out.println("rs = " + rs + " # valeur de s = " + s);

        Exemple1 e = new Exemple1("Brad");
        ex.setVarE(e);
        System.out.println("e.nom = " + e.getNom());
    }
	
}

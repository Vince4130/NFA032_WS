package exemples;

public class ExemplesStrings {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String var1 = null;
		String var2 = "Hello";
		String var3 = "";
		String var4 = new String("Hello");
		
		char myChar = var2.charAt(1);
		
		System.out.println(myChar);
		System.out.println(var4.concat(" World"));
		System.out.println(var4.contains("el"));
		System.out.println(var2.endsWith("i"));
		System.out.println(var2.toLowerCase().startsWith("h"));
		System.out.println(var2.substring(2));
		System.out.println(var4.substring(1, 3));
		System.out.println(var2.length());
	}

}

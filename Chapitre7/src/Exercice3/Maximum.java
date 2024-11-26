package Exercice3;

public class Maximum {

	public int trouveMax(int a, int b, int c) {
		
		int max = a;
		
		if(a < b) {
			max = b;
			
			if(b < c) {
				max = c;
			}
			
		} else if(a < c) {
			max = c;
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		
		Maximum max = new Maximum();
		
		int a = 200;
		int b = 200;
		int c = 67;
		
		System.out.println("Max entre "+a+", "+b+" et "+c+" = "+max.trouveMax(a,b,c));

	}

}

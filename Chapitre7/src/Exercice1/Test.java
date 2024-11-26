package Exercice1;

import java.util.ArrayList;

public class Test {

	public double distance(Point p1, Point p2) {
		
		double distance = Math.sqrt(Math.pow((p2.getX() - p1.getX()), 2) + Math.pow((p2.getY() - p1.getY()), 2));
		
		return distance;
	}
	
	public static void main(String[] args) {
		
		Test t = new Test();
		
		ArrayList<Point> listPoints1 = new ArrayList<Point>();
		ArrayList<Point> listPoints2 = new ArrayList<Point>();
		
		Point p1 = new Point(27, 9);
		Point p2 = new Point(8.6, 4);
		Point p3 = new Point(19.2, 3.8);

		listPoints1.add(p1);
		listPoints1.add(p2);
		listPoints1.add(p3);
		
		
		Point p4 = new Point(8.3, 16.3);
		Point p5 = new Point(5.8, 13.2);
		Point p6 = new Point(6.6, 8.6);

		listPoints2.add(p4);
		listPoints2.add(p5);
		listPoints2.add(p6);
		
		for(int i=0; i < listPoints1.size(); i++) {
			
			Point pa = listPoints1.get(i);
			Point pb = listPoints2.get(i);
			
			double distance = t.distance(pa, pb);
			
			System.out.println("Distance entre les points = "+distance);
			
		}
	}
}

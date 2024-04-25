package com.app.geometry;
import java.util.Scanner ;

public class TestPoint {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Point1");
		System.out.println("Enter x & y co-ordinates =");
		Point2D p1 = new Point2D(sc.nextInt(),sc.nextInt());
		
		System.out.println("Point2");
		System.out.println("Enter x & y co-ordinates =");
		Point2D p2 = new Point2D(sc.nextInt(),sc.nextInt());
		
		System.out.println("Point 1:" + p1.getDetails());
		System.out.println("Point 2:" + p2.getDetails());
		
		System.out.println("Is Point1 equal to Point2? :" + p1.isEqual(p2));
		
		System.out.print("Distance between Point1 and Point2 :" + p1.calculateDistance(p2));
	}
}


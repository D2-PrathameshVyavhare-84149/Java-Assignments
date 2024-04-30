package Question2;

import java.util.Scanner;

public class tester {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Circle c = new Circle();
		System.out.println("Enter Diameter -");
		double diameter = sc.nextDouble();
		c.setMyDiameter(diameter);
	}
}

package tester;

import com.app.geometry.*;
import java.util.Scanner;

public class TestPointArray1 {
	public static void main(String[] args) {
		int ArrSize = 0;
		int x = 0;
		int y = 0;
		int choice = 0;
		int index;
		int i1;
		int i2;
		boolean status = true;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter how many points you want to input - ");
		ArrSize = sc.nextInt();
		Point2D[] points = new Point2D[ArrSize];

		for (int i = 0; i < ArrSize; i++) {
			System.out.println("Enter x and y co-ordinates :");
			System.out.println("X co ordinate -");
			x = sc.nextInt();
			System.out.println("Y co ordinate -");
			y = sc.nextInt();
			points[i] = new Point2D(x, y);
		}
		do {
			System.out.println("Enter your choice :");
			System.out.println("1.To view point at specific index");
			System.out.println("2.To view x&y co ordinates of all points");
			System.out.println("3.Calculate distance");
			System.out.println("4.Exit");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("1.Enter index to display details of point :");
				index = sc.nextInt();
				System.out.println("Point at this position :" + points[index].getDetails());
				break;

			case 2:
				for (Point2D point : points)
					System.out.println(point.getDetails());
				break;

			case 3:
				System.out.println("Enter index of start point");
				i1 = sc.nextInt();

				System.out.println("Enter index of end point");
				i2 = sc.nextInt();
				points[i1].calculateDistance(points[i2]);
				break;

			case 4:
				System.out.println("Thank you!");
				status = false;
				break;
			default:
				break;

			}
		} while (choice != 0 && status==true);
	}
}

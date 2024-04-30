package Question2;

import java.util.Scanner;

public class Circle {
	private double myDiameter;
	Point2D Center = new Point2D(0, 0);
	Scanner sc = new Scanner(System.in);

	public double getMyDiameter() {
		return myDiameter;
	}

	public void setMyDiameter(double myDiameter) throws RuntimeException {
		if (myDiameter < 0) {
			throw new DiameterException("Diameter should be positive number");
		}

	}

}

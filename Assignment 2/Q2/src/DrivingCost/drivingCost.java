package DrivingCost;
import java.util.Scanner;
public class drivingCost {
	int TotalMiles;
	int costGasoline;
	int averageMiles;
	int parkingFees;
	int tolls;
	int TotalCost;
	
	public void accept() {
		System.out.println("Enter total miles driven per day - ");
		TotalMiles = new Scanner(System.in).nextInt();
		
		System.out.println("Enter cost per galleon of gasoline - ");
		costGasoline = new Scanner(System.in).nextInt();
		
		System.out.println("Enter average miles travel per galleon - ");
		averageMiles = new Scanner(System.in).nextInt();
	
		System.out.println("Enter parking fees per day - ");
		parkingFees = new Scanner(System.in).nextInt();
		
		System.out.println("Enter tolls per day - ");
		tolls = new Scanner(System.in).nextInt();
	}
	
	public void display() {
		TotalCost = ((TotalMiles/averageMiles)*costGasoline)+parkingFees+tolls;
		System.out.println("Total cost saved per day by Car pooling - " + TotalCost);
	}
}

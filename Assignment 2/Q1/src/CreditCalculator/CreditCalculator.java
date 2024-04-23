package CreditCalculator;
import java.util.Scanner;

public class CreditCalculator {
	int AcNo;
	int PendBalance;
	int TotCharge;
	int Credits ;
	int AllowedLimit ;
	int NewBalance;
	
	public void accept() {
		System.out.println("Enter Account Number - ");
		AcNo = new Scanner(System.in).nextInt();
		
		System.out.println("Enter Pending Balance - ");
		PendBalance = new Scanner(System.in).nextInt();
		
		System.out.println("Enter total items charged this month - ");
		TotCharge = new Scanner(System.in).nextInt();
		
		System.out.println("Total credits applied to the account this month - ");
		Credits = new Scanner(System.in).nextInt();
		
		System.out.println("Allowed credit limit - ");
		AllowedLimit = new Scanner(System.in).nextInt();
		
		NewBalance = PendBalance + TotCharge - Credits ; 
	}
	
	public void display() {
		System.out.println("Allowed Credit = " + AllowedLimit);
		System.out.println("Total Items Charged = " + TotCharge);
		System.out.println("Total of all credit applied to this month = " + Credits);
		System.out.println("Pending balance at the begining of the month = " + PendBalance);
		System.out.println("New Balance for next month = " + NewBalance);
		
		if(NewBalance<AllowedLimit) {
			System.out.println("Credit limit not exceeded");
		}else {
			System.out.println("Credit limit exceeded");
		}
		
	}
}

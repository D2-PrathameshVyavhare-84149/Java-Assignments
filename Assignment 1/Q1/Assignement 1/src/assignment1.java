import java.util.Scanner;

public class assignment1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double num1=0 ;
		double num2=0 ;
		double average ;
		
		System.out.println("Enter first double number - ");
		if(sc.hasNextDouble()) {
			num1=sc.nextDouble();
		}else {
			System.out.println("Value entered is not double");
			System.out.println("Code terminated");
			System.exit(1);
		}
		
		System.out.println("Enter second double number - ");
		if(sc.hasNextDouble()) {
			num2=sc.nextDouble();
		}else {
			System.out.println("Value entered is not double");
			System.out.println("Code terminated");
			System.exit(1);
		}
		average = (num1 + num2)/2 ;
		System.out.print("Average = " + average);
}}

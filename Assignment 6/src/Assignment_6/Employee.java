package Assignment_6;

import java.util.Scanner;

public abstract class Employee {
	private String FirstName;
	private String LastName;
	private int SSN;
	
	public void accept(Scanner sc) {
		System.out.println("Enter first name - ");
		FirstName = sc.next();
		System.out.println("Enter last name - ");
		LastName = sc.next();
		System.out.println("Enter SSN - ");
		SSN = sc.nextInt();
	}
	
	public void display() {
		System.out.println("Employee First Name :" + FirstName);
		System.out.println("Employee Last Name :" + LastName);
		System.out.println("Employee SSN :" + SSN);
	}
	
	@Override
	public String toString() {
		return "Employee [FirstName=" + FirstName + ", LastName=" + LastName + ", SSN=" + SSN + "]";
	}
	
	public void countSalary() {
		
	}; 
}

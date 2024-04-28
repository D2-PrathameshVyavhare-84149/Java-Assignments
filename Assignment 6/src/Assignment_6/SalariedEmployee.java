package Assignment_6;

import java.util.Scanner;

public class SalariedEmployee extends Employee {
	private double WeeklySalary ;
	
	@Override
	public void accept(Scanner sc) {
		super.accept(sc);
		System.out.println("Enter Weekly Salary -");
		WeeklySalary = sc.nextDouble();
	}
	
	@Override
	public void display() {
		super.display();
		System.out.println("Employee Weekly Salary :" + WeeklySalary);
	}
	
	@Override
	public String toString() {
		return "[" + super.toString() + ", Salary =" + getWeeklySalary() + "]" ;
	}
	
	@Override
	public void countSalary() {
		super.countSalary();
		System.out.println("Employee weekly salary :" + WeeklySalary);
	}

	public double getWeeklySalary() {
		return WeeklySalary;
	}

	public void setWeeklySalary(double weeklySalary) {
		WeeklySalary = weeklySalary;
	}
}

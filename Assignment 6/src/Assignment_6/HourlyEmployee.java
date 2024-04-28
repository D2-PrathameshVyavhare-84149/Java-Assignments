package Assignment_6;

import java.util.Scanner;

public class HourlyEmployee extends Employee {
	private double wage;
	private double hours;
	private double HourlySalary ;
	private double OvertimeSalary;

	@Override
	public void accept(Scanner sc) {
		super.accept(sc);
		System.out.println("Enter daily wages -");
		wage = sc.nextDouble();
		System.out.println("Enter working hours -");
		hours = sc.nextDouble();
	}
		
	@Override
	public void countSalary() {
		super.countSalary();
		if(hours<=40) {
			HourlySalary = (wage*hours);
		}else {	
			OvertimeSalary = (wage*1.5)*(hours-40);
			HourlySalary = (wage*hours) + OvertimeSalary ;
		}
	}
	
	@Override
	public void display() {
		super.display();
		System.out.println("Employee daily wages :" + wage);
		System.out.println("Employee working hours :" + hours);
		System.out.println("Empoyee Salary :" + HourlySalary);
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		this.wage = wage;
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		this.hours = hours;
	}

	public double getHourlySalary() {
		return HourlySalary;
	}

	public void setHourlySalary(double hourlySalary) {
		HourlySalary = hourlySalary;
	}

	public double getOvertimeSalary() {
		return OvertimeSalary;
	}

	public void setOvertimeSalary(double overtimeSalary) {
		OvertimeSalary = overtimeSalary;
	}
	
	@Override
	public String toString() {
		countSalary();
		return "[" + super.toString() + ", Wages =" + getWage() + ", Hours =" + getHours() 
				+ ", Salary =" + getHourlySalary() ;
	}

}

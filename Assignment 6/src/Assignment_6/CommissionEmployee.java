package Assignment_6;

import java.util.Scanner;

public class CommissionEmployee extends Employee {
	private double GrossSales ;
	private double CommissionRate ;
	public double CommissionSalary ; 
	
	@Override
	public void accept(Scanner sc) {
		super.accept(sc);
		System.out.println("Enter Gross Sales -");
		GrossSales = sc.nextDouble();
		System.out.println("Enter Commission Rate -");
		CommissionRate = sc.nextDouble(); 
	}
	
	@Override
	public void countSalary() {
		super.countSalary();
		CommissionSalary = GrossSales * ( 1+ (CommissionRate/100)); 
	}
	
	@Override
	public void display() {
		super.display();
		System.out.println("Employee Gross Sales :" + GrossSales);
		System.out.println("Employee Commission Rate :" + CommissionRate);
		System.out.println("Employee Commission Salary :" + CommissionSalary);
	}
	

	public double getGrossSales() {
		return GrossSales;
	}

	public void setGrossSales(double grossSales) {
		GrossSales = grossSales;
	}

	public double getCommissionRate() {
		return CommissionRate;
	}

	public void setCommissionRate(double commissionRate) {
		CommissionRate = commissionRate;
	}

	public double getCommissionSalary() {
		return CommissionSalary;
	}

	public void setCommissionSalary(double commissionSalary) {
		CommissionSalary = commissionSalary;
	}
	
	@Override
	public String toString() {
		countSalary();
		return "[" + super.toString() + ", Gross Sales =" + getGrossSales() + ", Commission Rate =" + getCommissionRate() + 
				", Salary =" + CommissionSalary + "]"; 
	}
}

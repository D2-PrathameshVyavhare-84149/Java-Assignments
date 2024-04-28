package Assignment_6;

import java.util.Scanner;

public class BaseSalariedCommissionEmployee extends CommissionEmployee {
	private double base_salary;
	private double BaseCommSalary;
	private double Bonus;

	@Override
	public void accept(Scanner sc) {
		super.accept(sc);
		System.out.println("Enter Base Salary -");
		base_salary = sc.nextDouble();
	}

	@Override
	public void countSalary() {
		Bonus = BaseCommSalary * 0.1 ;
		BaseCommSalary = base_salary + Bonus ;
		BaseCommSalary = CommissionSalary + BaseCommSalary ;
		}

	@Override
	public void display() {
		super.display();
		System.out.println("Employee Base Salary :" + base_salary);
		System.out.println("Employee Bonus :" + Bonus);
		System.out.println("Employee Total Salary :" + BaseCommSalary);
	}

	public double getBase_salary() {
		return base_salary;
	}

	public void setBase_salary(double base_salary) {
		this.base_salary = base_salary;
	}

	public double getBaseCommSalary() {
		return BaseCommSalary;
	}

	public void setBaseCommSalary(double baseCommSalary) {
		BaseCommSalary = baseCommSalary;
	}

	public double getBonus() {
		return Bonus;
	}

	public void setBonus(double bonus) {
		Bonus = bonus;
	}
	
	@Override
	public String toString() {
		countSalary();
		return "[" + super.toString() + ", Base Salary =" + getBase_salary() + ", Bonus =" + getBonus() + 
				", Total Salary =" + getBaseCommSalary() + "]";
	}
}

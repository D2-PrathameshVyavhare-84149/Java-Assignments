package Assignment_6;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int choice;
		int count = 0;
		int size;
		Scanner sc = new Scanner(System.in);

		System.out.println("How many employee you want to add? -");
		size = sc.nextInt();
		Employee[] arr = new Employee[size];

		do {
			System.out.println("Enter your choice -");
			System.out.println("1.Add Salaried Employee");
			System.out.println("2.Add Hourly Paid Employee");
			System.out.println("3.Add Commission Paid Employee");
			System.out.println("4.Add Based Salaried Commission Employee");
			System.out.println("5.Show details of all employee");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				if (count < size) {
					arr[count] = new SalariedEmployee();
					arr[count].accept(sc);
					count++;
				} else {
					System.out.println("Array is full");
				}
				break;
			case 2:
				if (count < size) {
					arr[count] = new HourlyEmployee();
					arr[count].accept(sc);
					count++;
				} else {
					System.out.println("Array is full");
				}
				break;
			case 3:
				if (count < size) {
					arr[count] = new CommissionEmployee();
					arr[count].accept(sc);
					count++;
				} else {
					System.out.println("Array is full");
				}
				break;
			case 4:
				if (count < size) {
					arr[count] = new BaseSalariedCommissionEmployee();
					arr[count].accept(sc);
					count++;
				} else {
					System.out.println("Array is full");
				}
				break;
			case 5:
//				for(Employee emp : arr)
//				System.out.println(emp);
//				break;
//				OR
				for (int i = 0; i < size; i++) {
					System.out.println(arr[i]);
				}
				break;
			default:
				System.out.println("Array is full");
				break;
			}
		} while (choice != 0);
	}
}

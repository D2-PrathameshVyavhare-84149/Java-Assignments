package com.app.fruits;

import java.util.Scanner;

public class Tester {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	int choice = 0;
	int count = 0;

	System.out.print("Enter size of basket - ");
	int size = sc.nextInt();
	fruits basket[] = new fruits[size];

	do
	{
		System.out.println("Enter your choice");
		System.out.println("0. Exit");
		System.out.println("1. Add Mango");
		System.out.println("2. Add Orange");
		System.out.println("3. Add Apple");
		System.out.println("4. Display names of all fruits");
		System.out.println("5. Display name, color, weight, taste of all fresh fruits");
		System.out.println("6. Mark a fruit as stale");
		System.out.println("7. Display taste of all stale fruits");
		System.out.println("8. Mark all sour fruits stale");
		choice = sc.nextInt();

		switch (choice) {
		case 1:
			if (count < size) {
				basket[count] = new Mango();
				basket[count].acceptFruit(sc);
				count++;
			} else {
				System.out.println("Basket is full");
			}
			break;

		case 2:
			if (count < size) {
				basket[count] = new Orange();
				basket[count].acceptFruit(sc);
				count++;
			} else {
				System.out.println("Basket is full");
			}
			break;

		case 3:
			if (count < size) {
				basket[count] = new Apple();
				basket[count].acceptFruit(sc);
				count++;
			} else {
				System.out.println("Basket is full");
			}
			break;

		case 4:
			if (basket[count-1] != null) {
				for(int i=0; i<count; i++) {
					System.out.println(basket[i].getName());
			}
			}
			break;

		case 5:
			for (count = 0; count < size; count++) {
				if (basket[count].isFresh() == true) {
					System.out.println(basket[count].toString());
					System.out.println(basket[count].taste());
				}
			}
			break;

		case 6:
			System.out.println("Enter the Index");
			int index = sc.nextInt();
			if (index > size - 1 || index < 0) {
				System.out.println("Invalid index");
			} else {
				basket[index].setFresh(false);
				System.out.println("Fruit maerked as stale");
				break;
			}

		case 7:
			for (count = 0; count < size; count++) {
				if (basket[count].isFresh() == false) {
					System.out.println(basket[count].taste());
				}
			}
			break;

		case 8:
			for (count = 0; count < size; count++) {
				if (basket[count].taste() == "sour")
					basket[count].setFresh(false);

			}
			System.out.println("All sour taste fruits are stale");
			break;

		default:
			System.out.println("Thank you !!");
			break;
		}

	}while(choice!=0);
}}

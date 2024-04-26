package com.app.fruits;

import java.util.Scanner;

public class fruits {
	private String name;
	private String color;
	private double weight;
	private boolean isFresh=true;

	Scanner sc = new Scanner(System.in);

	public fruits() {
	}

	public fruits(String name, String color, double weight, boolean isFresh) {
		this.name = name;
		this.color = color;
		this.weight = weight;
		this.isFresh = isFresh;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isFresh() {
		return isFresh;
	}

	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}

	public void acceptFruit(Scanner sc) {
		System.out.println("Enter fruit name - ");
		name = sc.next();
		System.out.println("Enter fruit color - ");
		color = sc.next();
		System.out.println("Enter weight of fruit - ");
		weight = sc.nextDouble();
//		System.out.println("Is fruit is fresh? - ");
//		isFresh = sc.nextBoolean();
	}
	
	public void displayFruit(Scanner sc) {
		System.out.println("Fruit name - " + name);
		System.out.println("Fruit color - " + color);
		System.out.println("Fruit weight - " + weight);
		//System.out.println("Fruit freshness - " + isFresh);
	}

	@Override
	public String toString() {
		return "fruits [name=" + name + ", color=" + color + ", weight=" + weight + ", isFresh=" + isFresh + ", sc="
				+ sc + "]";
	}

	public String taste() {
		return "No specific taste";
	}

}

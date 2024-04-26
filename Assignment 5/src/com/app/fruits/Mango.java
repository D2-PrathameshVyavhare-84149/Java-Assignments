package com.app.fruits;

import java.util.Scanner;

public class Mango extends fruits {
	public Mango() {

	}

	public Mango(String name, String color, double weight, boolean isFresh) {
		super(name, color, weight, isFresh);
	}

	@Override
	public void acceptFruit(Scanner sc) {
		super.acceptFruit(sc);
	}

	@Override
	public void displayFruit(Scanner sc) {
		super.displayFruit(sc);
	}

	@Override
	public String toString() {
		return super.toString();
	}

	@Override
	public String taste() {
		return "Taste is sweet";
	}
}

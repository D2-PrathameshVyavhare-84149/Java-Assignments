package com.app.fruits;

import java.util.Scanner;

public class Apple extends fruits {

	public Apple() {

	}

	public Apple(String name, String color, double weight, boolean isFresh) {
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
		return "Taste is sweet n sour";
	}
}

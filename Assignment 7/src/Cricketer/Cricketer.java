package Cricketer;

import java.util.Scanner;

public class Cricketer extends Player implements Batter,Bowler {
	
	public Cricketer() {
		
	}
	
	public Cricketer(int runs, int wickets) {
		super();
		this.runs = runs;
		this.wickets = wickets;
	}

	int runs;
	int wickets;
	
	@Override
	public void accept(Scanner sc) {
		super.accept(sc);
		System.out.println("Enter Runs made by Player -");
		runs = sc.nextInt();
		System.out.println("Enter Wickets taken by Player -");
		wickets = sc.nextInt();
	}

	@Override
	public int getRuns() {
		return runs;
	}
	@Override
	public int getWickets() {
		return wickets;
	}
	@Override
	public int getMatchesPlayed() {
		return super.getMatchesPlayed();
	}
	
	@Override
	public String toString() {
		return "[" + super.toString() + ", Runs =" + getRuns() + ", Wickets =" + getWickets() ;
	}
	
	@Override
	public void display() {
		super.display();
		System.out.println("Player Total Runs :" + runs);
		System.out.println("Player Total Wickets :" + wickets);
	}

	
}

package Cricketer;

import java.util.Objects;
import java.util.Scanner;

public class Player {
	int id;
	String name;
	int age;
	int matchesPlayed;
	Scanner sc = new Scanner(System.in);
	
	public Player(){
		
	}
	
	public Player(int id, String name, int age, int matchesPlayed) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.matchesPlayed = matchesPlayed;
	}


	public void accept(Scanner sc) {
		System.out.println("Enter Id Of New Player -");
		id = sc.nextInt();
		System.out.println("Enter Name Of New Player -");
		name = sc.next();
		System.out.println("Enter Age Of New Player -");
		age = sc.nextInt();
		System.out.println("Enter Matches Played By New Player -");
		matchesPlayed = sc.nextInt();
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", age=" + age + ", matchesPlayed=" + matchesPlayed + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getMatchesPlayed() {
		return matchesPlayed;
	}

	public void setMatchesPlayed(int matchesPlayed) {
		this.matchesPlayed = matchesPlayed;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, id, matchesPlayed, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Player other = (Player) obj;
		return age == other.age && id == other.id && matchesPlayed == other.matchesPlayed
				&& Objects.equals(name, other.name);
	}
	
	public void display() {
		System.out.println("-------------------");
		System.out.println("Player Id :" + id);
		System.out.println("Player Name :" + name);
		System.out.println("Player Age :" + age);
		System.out.println("Player Matches :" + matchesPlayed);
	}


}

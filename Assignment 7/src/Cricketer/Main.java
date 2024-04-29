package Cricketer;
import java.util.Scanner;

public abstract class Main {
	public static void main(String[] args) {
		Player[] arr = new Player[11];
		int choice=0;
		int count=0;
		int TotalRuns=0;
		int TotalWickets=0;
		int TotalMatches=0;
		int i=0;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Enter your choice");
			System.out.println("1.Add new team");
			System.out.println("2.Show total number of runs of all players");
			System.out.println("3.Show total number of wickets of all players");
			System.out.println("4.Show total number of matches of all players");
			System.out.println("5.Show details all players");
			System.out.println("6.Exit");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1 :
				for(i=0;i<11;i++){
				arr[i] = new Cricketer();
				arr[i].accept(sc);
				}
				break;
		
			case 2 :
				for(i=0; i<11;i++) {
					Cricketer d = (Cricketer) arr[i];
					TotalRuns += d.getRuns();
				}
				System.out.println("Total runs of all players :" + TotalRuns);
				break;
		
			case 3 :
				for(i=0; i<11;i++) {
					Cricketer d = (Cricketer) arr[i];
					TotalWickets += d.getWickets();
				}
				System.out.println("Total wickets of all players :" + TotalWickets);
				break;
			
			case 4 :
				for(i=0; i<11;i++) {
					Cricketer e = (Cricketer) arr[i];
					TotalMatches += e.getMatchesPlayed();
				}
				System.out.println("Total matches of all players :" + TotalMatches);
				break;
			
			case 5 :
				for(i=0; i<11;i++) {
					System.out.println("Player details :");
					arr[i].display();
				}
				break;
			
			case 6 :
				System.out.println("Thank you");
				sc.close();
			
			default :
				System.out.println("Invalid choice");
				break;
			}
		}while(choice != 0 && choice<=6);
	}
	
}
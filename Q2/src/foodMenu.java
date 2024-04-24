import java.util.Scanner;

public class foodMenu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int choice=0;
		int idli=0;
		int dosa=0;
		int samosa=0;
		int vadapav=0;
		int misalpav=0;
		int manchurian=0;
		int pavbhaji=0;
		int panipuri=0;
		int bhel=0;
		int noodles=0;
		int total=0;
		
		
		do {
		System.out.println("---- Welcome to our Food Cort ----");
		System.out.println("What you like to eat -");
		System.out.println("1.Idli");
		System.out.println("2.Dosa");
		System.out.println("3.Samosa");
		System.out.println("4.Vada-Pav");
		System.out.println("5.Misal-Pav");
		System.out.println("6.Noodles");
		System.out.println("7.Manchurian");
		System.out.println("8.Pav-Bhaji");
		System.out.println("9.Pani-Puri");
		System.out.println("10.Bhel");
		System.out.println("11.Generate Bill of Customer");
		
		
		System.out.println("Enter your choice - ");
		choice = sc.nextInt();
		
		switch (choice) {
		case 1:System.out.println("Enter quantity of Idli - ");
			idli = sc.nextInt()*10;
			break;
		 
		case 2:System.out.println("Enter quantity of Dosa - ");
			dosa = sc.nextInt()*20;
			break;
			
		case 3:System.out.println("Enter quantity of Samosa - ");
			samosa = sc.nextInt()*20;
			break;
		
		case 4:System.out.println("Enter quantity of Vada Pav - ");
			vadapav = sc.nextInt() *15;
			break;
		
		case 5:System.out.println("Enter quantity of Misal Pav - ");
			misalpav = sc.nextInt()*30;
			break;
		
		case 6:System.out.println("Enter quantity of Noodles - ");
			noodles = sc.nextInt()*50;
			break;	
		
		case 7:System.out.println("Enter quantity of Manchurian - ");
			manchurian = sc.nextInt() *15;
			break;
		
		case 8:System.out.println("Enter quantity of Pav bhaji - ");
			pavbhaji = sc.nextInt() *100;
			break;
		
		case 9:System.out.println("Enter quantity of Pani-Puri - ");
		panipuri = sc.nextInt() *20;
		break;
		
		case 10:System.out.println("Enter quantity of Bhel - ");
			bhel = sc.nextInt() *20;
			break;
		
		case 11:
			total = idli + dosa + samosa + vadapav + misalpav + noodles + manchurian 
					+ pavbhaji + panipuri + bhel; 
			System.out.println( "Your total bill is = Rupees " + total + "/-");
			System.out.println( "Thank you for your visit !!!");
			System.exit(1);
			break;	
			
			
		default:
			break;
		}
	}while(choice!=0);

	}}

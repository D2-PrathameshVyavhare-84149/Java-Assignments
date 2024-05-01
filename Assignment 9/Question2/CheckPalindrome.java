package Question2;

import java.util.Scanner;

public class CheckPalindrome {
	public static StringBuffer s1;
	public static StringBuffer rev;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String -");
		StringBuffer s1 = new StringBuffer(sc.next());

		if (s1.toString().equals(s1.reverse().toString()))
			System.out.println("It is Palindrome");
		else {
			System.out.println("It is not Palindrome");
		}
	}

}

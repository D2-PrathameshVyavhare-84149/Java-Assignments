package Question1;
import java.util.Scanner;
//import java.io.StringBufferInputStream;

public class ReverseString {
	public static StringBuffer s1;
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String -");
		StringBuffer s1 = new StringBuffer(sc.next());
		System.out.println(s1.reverse());
	}
}

//solution by split method 

package Question3;

import java.util.StringTokenizer;

public class LengthOfString {

	public static void main(String[] args) {
		String s1 = "The class String includes methods for examining individual characters of the sequence, "
				+ "for comparing strings, for searching strings, "
				+ "for extracting substrings, and for creating a copy of a string "
				+ "with all characters translated to uppercase or to lowercase. "
				+ "Case mapping is based on the Unicode Standard version specified by the Character class";

		String[] arr = s1.split("[ ]");

		System.out.println("Number of words in string :" + arr.length);

	}

}

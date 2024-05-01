//solution by StringTokenizer method 

package Question3;

import java.util.StringTokenizer;

public class LengthOfString2 {

	public static void main(String[] args) {

		String s1 = "The class String includes methods for examining individual characters of the sequence, "
				+ "for comparing strings, for searching strings, "
				+ "for extracting substrings, and for creating a copy of a string "
				+ "with all characters translated to uppercase or to lowercase. "
				+ "Case mapping is based on the Unicode Standard version specified by the Character class";

		StringTokenizer stk = new StringTokenizer(s1, " ");
		System.out.println("Number of words :" + stk.countTokens());
	}

}

package Question1;

import java.util.Scanner;

public class StringUser {
	private String str;

	public StringUser() {
	}

	public void setS(String str) {
		if (str.length() > 80) {
			throw new StringException("String is too long");
		}
		this.str = str;
	}

}

package Question1;

import java.util.Arrays;

public class tester {
	public static void main(String[] args) {
		Student[] arr = { new Student(1, "Shubham", 450), new Student(2, "Ishwar", 480),
				new Student(3, "Prathamesh", 400), new Student(4, "Vijay", 420), new Student(5, "Sagar", 410), };
		System.out.println("Students before sorting -");
		for (Student element : arr) {
			System.out.println(element);
		}
		Arrays.sort(arr);
		System.out.println("--------------------------------");
		System.out.println("Students in Descending order of marks -");
		for (Student element : arr) {
			System.out.println(element);
		}
	}
}

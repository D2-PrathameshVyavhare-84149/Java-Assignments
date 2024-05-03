package studentsSorting;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class tester {
	public static int choice;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Students[] arr = new Students[10];

		class nameComparator implements Comparator<Students> {
			@Override
			public int compare(Students o1, Students o2) {
				return o1.name.compareTo(o2.name);
			}
		}
		nameComparator n = new nameComparator();

		class marksComparator implements Comparator<Students> {
			@Override
			public int compare(Students o1, Students o2) {
				return Double.compare(o2.marks, o1.marks);
			}
		}
		marksComparator m = new marksComparator();

		class courseComparator implements Comparator<Students> {
			@Override
			public int compare(Students o1, Students o2) {
				return o1.course.compareTo(o2.course);
			}
		}
		courseComparator c = new courseComparator();

		do {
			System.out.println("Enter your choice - ");
			System.out.println("1.Add new Students");
			System.out.println("2.Sort Students on Roll No.");
			System.out.println("3.Sort Students on Names");
			System.out.println("4.Sort Students on Descending Marks");
			System.out.println("5.Sort Students on Course");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				for (int i = 0; i < 10; i++) {
					arr[i] = new Students();
					arr[i].accept(sc);
				}
				break;
			case 2:
				Arrays.sort(arr);
				for (Students students : arr) {
					System.out.println(students);
				}
				break;
			case 3:
				Arrays.sort(arr, n);
				for (Students students : arr) {
					System.out.println(students);
				}
				break;
			case 4:
				Arrays.sort(arr, m);
				for (Students students : arr) {
					System.out.println(students);
				}
				break;
			case 5:
				Arrays.sort(arr, c);
				for (Students students : arr) {
					System.out.println(students);
				}
				break;
			default:
				break;
			}
		} while (choice != 0);
	}
}
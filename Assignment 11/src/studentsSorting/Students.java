package studentsSorting;
import java.util.Scanner;

public class Students implements Comparable<Students> {
	int rollno;
	String name;
	double marks;
	String course;
	Scanner sc = new Scanner(System.in);
	
	public Students() {

	}

	public Students(int rollno, String name, double marks, String course) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
		this.course = course;
	}

	@Override
	public String toString() {
		return "Students [rollno=" + rollno + ", name=" + name + ", marks=" + marks + ", course=" + course + "]";
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	@Override
	public int compareTo(Students o) {
		return this.rollno - o.rollno;
	}
	
	public void accept(Scanner sc) {
		System.out.println("Enter Student Roll No - ");
		rollno = sc.nextInt();
		System.out.println("Enter Student Name - ");
		name = sc.next();
		System.out.println("Enter Student Marks - ");
		marks = sc.nextDouble();
		System.out.println("Enter Student Course - ");
		course = sc.next();
	}
	
}

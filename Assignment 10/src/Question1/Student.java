package Question1;

public class Student implements Comparable<Student>{
	int rollno;
	String name;
	double marks;
	
	public Student() {
		
	}
	
	public Student(int rollno, String name, int marks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
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
	

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
	}
	
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return Double.compare(o.marks,this.marks);
	}
//	@Override
//	public int compareTo(Student o) {
//		return Integer.compare(o.marks,this.marks);
//	}
	
}	


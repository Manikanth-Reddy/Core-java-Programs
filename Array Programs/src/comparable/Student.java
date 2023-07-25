package comparable;

public class Student implements Comparable<Object>{
	String name;
	int marks;
	public Student(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		
		return "Student[Name="+name+",Marks="+marks+"]";
	}
	@Override
	public int compareTo(Object o) {
		
		return name.compareTo(((Student)o).name);
	}
}

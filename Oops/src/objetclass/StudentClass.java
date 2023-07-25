package objetclass;

class Student
{
	int id;
	String name;
	int age;
	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "id="+id+"\nname="+name+"\nage="+age;
	}
	public boolean equals(Object obj) {
		if(obj instanceof Student)
		{
			Student s=(Student) obj;
			return (id==s.id) && (name.equals(s.name)) && (age==s.age);
		}
		else
			return false;
	}
}
public class StudentClass {

	public static void main(String[] args) {
		Student s=new Student(10,"mani",22);
		Student s1=new Student(10,"mani",22);
		System.out.println(s.toString());
		System.out.println(s.equals(s1));
	}

}

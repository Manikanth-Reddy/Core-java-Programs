package objetclass;

import java.util.Objects;

class Student1 implements Cloneable
{
	int id;
	String name;
	int age;
	String address;
	public Student1(int id, String name, int age, String address) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student1 [id=" + id + ", name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student1 other = (Student1) obj;
		return Objects.equals(address, other.address) && age == other.age && id == other.id
				&& Objects.equals(name, other.name);
	}
	
}
public class CloningStudent  {

	public static void main(String[] args) throws CloneNotSupportedException{
		Student1 s1=new Student1(1,"mani",22,"kadiri");
		Student1 s2=(Student1) s1.clone();
		System.out.println(s1.getClass().getName());
		System.out.println(s1.getClass().getSimpleName());
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
	}

}

package overriding;
class Person
{
	String name;
	Person(String n)
	{
		name=n;
	}
	void display()
	{
		System.out.println("Name ="+name);
	}
}
public class Subject extends Person {
	String sub;
	Subject(String n,String s)
	{	super(n);
		sub=s;
	}
	void display()
	{
		super.display();
		System.out.println("Subject ="+sub);
	}
	public static void main(String[] args) {
		Subject s=new Subject("Mani","Kingkong");
		s.display();
	}
}
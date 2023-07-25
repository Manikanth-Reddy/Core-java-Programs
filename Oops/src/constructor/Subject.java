package constructor;
class Person
{
	String name;
	Person(String n)
	{
		name=n;
	}
}
public class Subject extends Person {
	String sub;
	Subject(String n,String s)
	{	super(n);
		sub=s;
	}
	public static void main(String[] args) {
		Subject s=new Subject("Mani","Kingkong");
		System.out.println("Name ="+s.name);
		System.out.println("Suject ="+s.sub);
	}

}

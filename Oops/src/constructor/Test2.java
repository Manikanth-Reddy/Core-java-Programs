package constructor;
import java.util.Scanner;
class Book 
{
	String title;
	String author;
	Book (String t,String a)
	{
		title=t;
		author=a;
	}
	void display()
	{
		System.out.println("title ="+title);
		System.out.println("Author ="+author);
	}
	static Book create()
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Title=");
		String t=s.next();
		System.out.print("Author=");
		String a=s.next();
		s.close();
		return new Book(t,a);
	}
}
public class Test2 {
	public static void main (String [] arg)
	{
		Book b1=Book.create();
		Book b2=Book.create();
		b1.display();
		System.out.println("==================");
		b2.display();
	}
}

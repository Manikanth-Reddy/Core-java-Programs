package overriding;
class Animal
{
	 void move()
	{
		System.out.println("Running");
	}
}
class snake extends Animal
{
    void move()
	{
		System.out.println("Crawing");
	}
}
public class Test1 {
	public static void main (String[] arg)
	{
		snake s=new snake();
		s.move();
	}
}

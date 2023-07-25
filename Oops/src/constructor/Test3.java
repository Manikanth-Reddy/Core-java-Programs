package constructor;
class E
{
	E()
	{
		System.out.println("E constructor");
	}
}
class F extends E
{
	F()
	{
		System.out.println("F constructor");
	}
}
class G extends F
{
	G()
	{
		System.out.println("G constructor");
	}
}
public class Test3 {
	public static void main(String[]args)
	{
		new G();	
	}
}

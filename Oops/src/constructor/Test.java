package constructor;
class D
{
	D()
	{
		System.out.println("Construcotr  without arguments");
	}
	D(int i )
	{
		System.out.println("constructor with arguments");
	}
}
public class Test {
	public static void main (String [] mani)
	{
		new D();
		System.out.println("==========================");
		new D(111);
	}
}

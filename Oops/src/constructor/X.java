package constructor;
public class X {
X()
{
	System.out.println("Default constructor");
}
X(int i )
{
	this();
	System.out.println("Constructor with arguments");
}
public static void main (String[] args)
{
	new X(10);
}
}

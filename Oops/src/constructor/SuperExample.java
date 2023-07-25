package constructor;
class H
{
	H(int i )
	{
		System.out.println("Parameterd Constructor ");
	}
}
class I extends H
{
	I()
	{
		super(10);
		System.out.println("default constructor");
	}
}
public class SuperExample {
	public static void main(String[] args) {
		new I();
	}
}

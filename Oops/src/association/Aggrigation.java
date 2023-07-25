package association;
class A
{
	public void m1()
	{
		System.out.println(" HI ");
	}
}
class B
{
	A aRef;
	public void m2()
	{
		aRef=new A();
		aRef.m1();
	}
}
public class Aggrigation {

	public static void main(String[] args) {
		B b =new B();
		b.m2();
	}

}

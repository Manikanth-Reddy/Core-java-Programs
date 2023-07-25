package abstraction;
abstract class A
{
	abstract public void m1();
	public void m2()
	{
		System.out.println("M2 of A");
	}
}
class B extends A
{
	@Override
	public void m1()
	{
		System.out.println("M1 of B");
	}
}
public class Demo {

	public static void main(String[] args) {
		A a=new B();
		a.m1();
		a.m2();
		B b=new B();
		b.m1();
		b.m2();
		
	}

}

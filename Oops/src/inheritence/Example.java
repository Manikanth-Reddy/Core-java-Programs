package inheritence;
class A
{
	int i;
	void m1()
	{
		System.out.println("i ="+i);
	}
}
class B extends A
{
	int j;
	void m2()
	{
		System.out.println("j ="+j);
	}
}
public class Example {
	public static void main(String[] args) {
		B b1=new B();
		b1.i=100;
		b1.j=45;
		b1.m2();
		b1.m1();
	}

}

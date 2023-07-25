package Casting;
class A
{
	{
		
	}
	public void m1() 
	{
		System.out.println("M1 of super class");
	}
	public  void m2() //generic method
	{
		System.out.println("m2 of super class (generic method)");
	}
}
class B extends A
{
	public void m1() // Overridden method
	{
		System.out.println("m1 of overridden method");
	}
	public  void m3()  //specific method
	{
		System.out.println(" m3 of sub class ( specific method)");
	}
}
public class Test {
	public static void main(String[] args) {
		// UPCasting
		A a =new B();
		// A a =(A) new B();
		a.m1();
		a.m2();
		// a.m3; not possible 
		
		
		// Down Casting
		
		B b=(B) a;
		b.m3();
		b.m1();
		b.m2();
		// another way of calling 
		((B)a).m3();
		
	}
}

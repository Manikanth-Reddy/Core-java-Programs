package association;
class C
{
	public void m3()
	{
		System.out.println("Hello");
	}
}
class D
{
	C cRef;
	public D(C c)
	{
		this.cRef=c;
	}
	public void m4()
	{
		cRef.m3();
	}
}
public class Composition {

	public static void main(String[] args) {
		D d=new D(new C());
		d.m4();
	}

}

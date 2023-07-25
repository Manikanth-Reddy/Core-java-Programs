package encapsulation;
class A
{
	private int radius;
	public void setRadius (int r)
	{
		radius=r;
	}
	public int getRadius()
	{
		return radius;
	}
}
public class Test {

	public static void main(String[] args) {
		A a=new A();
		a.setRadius(10);
		System.out.println(a.getRadius());	
	}
}

package objetclass;
class Rectangle
{
	int length;
	int breadth;
	public Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	@Override
	public String toString()
	{
		return "length ="+length+"\nbreadth ="+breadth;
	}
	@Override
	public boolean equals(Object arg)
	{
		if(arg instanceof Rectangle)
		return (length== ((Rectangle)arg).length) && (breadth==((Rectangle)arg).breadth);
		else 
			return false;
	}
}
public class RectangleClass {
	public static void main(String[] args) {
		Rectangle r1=new Rectangle(10,20);
		Rectangle r2=new Rectangle(10,20);
		System.out.println(r1.equals(r2));
		System.out.println(r1.equals(null));
	}
}

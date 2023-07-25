package constructor;
class Box
{
	int height;
	int length;
	int width;
	Box(int n)
	{
		height=n;
		length=n;
		width=n;
	}
	Box ()
	{}
	Box(int h,int l,int w)
	{
		height=h;
		length=l;
		width=w;
	}
	public void display ()
	{
		System.out.println(height+","+length+","+width);
	}
}
public class Test1 {
	public static void main(String[] args) {
		Box b1=new Box();
		Box b2=new Box(10);
		Box b3=new Box(4,5,6);
		b2.display();
		b1.display();
		b3.display();
	}

}

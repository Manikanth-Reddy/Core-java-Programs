package objetclass;

class Circle {
	int radius;

	public Circle(int radius) {
		super();
		this.radius = radius;
	}
	@Override
	public String toString()
	{
		return "radius ="+ radius;
		
	}
	@Override
	public boolean equals(Object ref)
	{
		if(!(ref instanceof Circle)) return false;
		return radius== ((Circle)ref).radius;
	}
}

public class CircleClass {
	public static void main(String[] args) {
		Circle c1=new Circle(10);
		Circle c2=new Circle(40);
		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}
}

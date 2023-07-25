package setImplimentation;

public class Circle {
int radius;

public Circle(int radius) {
	super();
	this.radius = radius;
}
@Override
	public int hashCode() {
		return radius;
	}
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Circle[ radius="+radius+"]";
	}
	public boolean equals(Object obj) {
	if(!(obj instanceof Circle)) return false;
		return radius==((Circle)obj).radius ;
	}
}

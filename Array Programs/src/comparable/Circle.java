 package comparable;

public class Circle implements Comparable<Object>{
int radius;

public Circle(int radius) {
	super();
	this.radius = radius;
}
@Override
	public String toString() {
		return "Circle radius= "+radius;
	}
@Override
public int compareTo(Object o) {
	if(radius>((Circle)o).radius) return 1;
	if(radius<((Circle)o).radius) return -1;
	return 0;
}
}

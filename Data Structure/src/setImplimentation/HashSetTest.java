package setImplimentation;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet s=new HashSet();
		Circle c=new Circle(10);
		Circle c1=new Circle(10);
		System.out.println(c.equals(c1));
		s.add(c);
		s.add(c1);
		System.out.println(s.size());
		System.out.println(c);
		System.out.println(c1);
	}

}

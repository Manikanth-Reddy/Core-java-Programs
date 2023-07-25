package comparable;

import java.util.Arrays;

public class ComparableExampleForUSerobject {

	public static void main(String[] args) {
		Circle[] a = new Circle[5];
		a[0] = new Circle(10);
		a[1] = new Circle(30);
		a[2] = new Circle(50);
		a[3] = new Circle(20);
		a[4] = new Circle(40);
		Arrays.sort(a);
		for (Circle n : a)
			System.out.println(n);
	}

}

package basic;

import java.util.ArrayList;

public class InbulidMethods {

	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<Integer>();
		ArrayList<Integer> b=new ArrayList<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		b.add(20);
		b.add(30);
		a.addAll(b);
		b.remove(0);
		System.out.println(a);
	}

}

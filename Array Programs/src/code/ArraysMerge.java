package code;

import java.util.HashSet;

public class ArraysMerge {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4 };
		int[] b = { 2, 4, 6, 8 };
		HashSet<Integer> l = new HashSet<Integer>();
		int i = 0;
		for (int j = 0; i < a.length; i++)
			l.add(a[j]);

		for (int ar2 = 0; ar2 < b.length; ar2++)
			l.add(b[ar2]);
		System.out.println(l);
	}
}

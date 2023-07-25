 package code;

import java.util.*;

public class SortingAString {

	public static void main(String[] args) {
		String[] a = { "Mani", "Abc", "Kanth" };
		Arrays.sort(a);
		for (String n : a)
			System.out.println(n);
	}

	public static void sort(String[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - i - 1; j++) {
				if (a[j].compareTo(a[j + 1]) > 0) {
					String temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		for (String n : a)
			System.out.print(n + " ");
	}

}

package code;

public class LinearSearch {
	public static void main(String[] args) {
		int[] a = { 2, 3, 4, 5, 6 };
		System.out.println(search(a, 4));
	}
	public static int search(int[] a, int e) {
		for (int i = 0; i < a.length; i++)
			if (a[i] == e)
				return i;
		return -1;
	}
}

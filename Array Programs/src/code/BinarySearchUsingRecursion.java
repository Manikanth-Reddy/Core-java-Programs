package code;

public class BinarySearchUsingRecursion {

	public static void main(String[] args) {
		int[] a = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 14, 20 };
		System.out.println("Required is at " + Search(a, 20, 0, a.length - 1) + " index");
	}

	public static int Search(int[] a, int e, int start, int end) {
		if (start > end)
			return -1;
		int mid = (start + end) / 2;
		if (e == a[mid])
			return mid;
		else if (e < a[mid])
			return Search(a, e, start, mid - 1);
		else
			return Search(a, e, mid + 1, end);
	}
}

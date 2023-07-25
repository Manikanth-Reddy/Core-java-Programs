package code;

public class QuickSorting {

	public static void main(String[] args) {
		int[] a = { 11, 2, 3, 4, 6, 7, 9, 8, 0, 1 };
		sort(a, 0, a.length - 1);
		for (int n : a)
			System.out.print(n + " ");
	}
	public static void sort(int[] a, int start, int end) {
		if (start >= end)
			return;
		int pivot = a[(start + end) / 2];
		int i = start, j = end;
		while (i <= j) {
			while (a[i] < pivot)  i++;
			while (a[j] > pivot)   j--;
			if (i <= j) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				i++;
				j--;
			}
		}
		sort(a, start, j);
		sort(a, i, end);
	}
}

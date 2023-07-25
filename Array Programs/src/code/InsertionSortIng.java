package code;

public class InsertionSortIng {

	public static void main(String[] args) {
		int[] a = { 2, 4, 1, 9, 10, 15, 3, 50, 6, 5 };
		InsertionSorting(a);
		for (int n : a)
			System.out.print(n + " ");
	}

	public static void InsertionSorting(int[] a) {
		for (int i = 1; i < a.length; i++) {
			int key = a[i];
			int j = i - 1; 
			while (j >= 0 && a[j] > key) {
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = key;
		}
	}
}

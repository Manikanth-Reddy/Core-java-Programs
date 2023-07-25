package code;

public class SelectionSorting {

	public static void main(String[] args) {
		int[] a = { 2, 4, 7, 9, 10, 15, 3, 50, 6 };
		Selectionsorting(a);
		for (int n : a)
			System.out.print(n + " ");
	}

	static void Selectionsorting(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			int index = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[index])
					index = j;
			}
			if (i != index) {
				int temp = a[i];
				a[i] = a[index];
				a[index] = temp;
			}
		}
	}
}

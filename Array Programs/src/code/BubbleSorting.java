package code;

public class BubbleSorting {

	public static void main(String[] args) {
		int[] a = { 5, 7, 9, 0, 3, 7, 10, 19 };
		Bubblesorting(a);
		for (int n : a)
			System.out.print(n + " ");
	}

	public static void Bubblesorting(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
	}
}

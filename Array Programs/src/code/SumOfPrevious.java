package code;

public class SumOfPrevious {
	public static void main(String[] args) {
		int[] a = { 1, 2, 1 };
		for (int i = 0; i < a.length; i++) {
			int sum = 0;
			for (int j = 0; j <= i; j++)
				sum += a[j];
			System.out.print(sum);
		}
	}
}

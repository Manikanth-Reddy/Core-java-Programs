package twoDimensionalSrray;

public class AddDignalElements {

	public static void main(String[] args) {
addAntiDiagnolAndDiagnol();
	}

	public static void AddDiagnolElements() {
		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i][i];
		}
		System.out.println(sum);
	}

	public static void addAntiDiagnolAndDiagnol() {
		int[][] a = { { 1, 2, 3, 11 }, { 4, 5, 6, 12 }, { 7, 8, 9, 13 } };
		int sum = 0, len = a.length;
		for (int i = 0; i < len; i++) {
			sum += a[i][i];
			if (len % 2 != 0 && i == len / 2)
				continue;
			sum += a[i][len - 1 - i];
		}
		System.out.println(sum);
	}
}

 package twoDimensionalSrray;
public class MatrixMultiplicationExample {
	public static void main(String args[]) {
		int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int b[][] = { { 1, 4, 7 }, { 2, 5, 8 }, { 3, 6, 9 } };
		int len = a.length;

		int c[][] = new int[len][len];
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				for (int k = 0; k < len; k++) {
					c[i][j] += a[i][k] * b[k][j];
				}
				System.out.print(c[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
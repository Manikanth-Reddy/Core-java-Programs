package twoDimensionalSrray;

public class SpiralPatternArray {

	public static void main(String[] args) {
		int[][] a = Spiral(5);
		for (int[] temp : a) {
			for (int n : temp) 	System.out.print(n + "\t");
			System.out.println();
		}
	}
	public static int[][] Spiral(int size) {
		int[][] a = new int[size][size];
		char direction = 'r';
		int row = 0, column = -1;
		for (int i = 1; i <= size * size; i++) {
			switch (direction) {
			case 'r':
				a[row][++column] = i;
				if (column == size - 1 || a[row][column + 1] != 0)
					direction = 'd';
				break;

			case 'd':
				a[++row][column] = i;
				if (row == size - 1 || a[row + 1][column] != 0)
					direction = 'l';
				break;

			case 'l':
				a[row][--column] = i;
				if (column == 0 || a[row][column - 1] != 0)
					direction = 'u';
				break;

			case 'u':
				a[--row][column] = i;
				if (a[row - 1][column] != 0)
					direction = 'r';
			}
		}
		return a;
	}
}

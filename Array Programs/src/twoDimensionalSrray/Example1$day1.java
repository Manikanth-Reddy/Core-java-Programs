package twoDimensionalSrray;

public class Example1$day1 {
	public static void main(String[] args) {
		Initilazing2DArrayWithDifferentSizes();
	}
	public static void NormalMethod() {
		int[][] a = new int[3][4];
		for (int[] s : a) {
			for (int n : s)
				System.out.print(n + "\t");
			System.out.println();
		}
	}
	public static void NotInsliazed1DArray() {
		int[][] a = new int[3][];
		for (int[] s : a)  System.out.println(s);
	}
	public static void Initilazing2DArrayWithDifferentSizes() {
		int[][] a = new int[3][];
		a[0] = new int[4];
		a[1] = new int[5];
		a[2] = new int[6];
		for (int[] s : a) {
			for (int n : s)
				System.out.print(n + "\t");
			System.out.println();
		}
	}
	public static void DirectMethodOfCreating2DArray() {
		int[][]a= {
				{1,2,3},
				{4,5,6},
				{7,8,9}
				};
		for (int[] s : a) {
			for (int n : s)
				System.out.print(n + "\t");
			System.out.println();
		}
	}
}

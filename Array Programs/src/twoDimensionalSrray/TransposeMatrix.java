package twoDimensionalSrray;

public class TransposeMatrix {

	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int len=a.length;
//		int [][]b=new int [len][len];
//		for(int i=0;i<len;i++) {
//			for(int j=0;j<len;j++) {
//				b[j][i]=a[i][j];
//			}
//		}
//		for(int[] s:b) {
//			for(int n:s)System.out.print(n+"\t");
//			System.out.println();
//		}
		System.out.println("=================================================");
	for(int i=0;i<len;i++) {
		for(int j=0;j<len;j++) {
			System.out.print(a[j][i]+" ");
		}System.out.println();
	}
	}

}

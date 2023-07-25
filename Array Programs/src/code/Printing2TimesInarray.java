package code;

public class Printing2TimesInarray {
	public static void main(String[] args) {
		int[] a = { 1, 2, 1 };
//		for (int i = 0; i < a.length; i++) {
//			System.out.print(a[i]);
//		}
//		for (int i = a.length - 1; i >= 0; i--) {
//			System.out.print(a[i]);
//		}
		doublearray(a);

	}

	public static void doublearray(int[] a) {
		int[] b = new int[a.length * 2];
//		for (int i = 0; i < b.length; i++) {
//			if (i < a.length)
//				b[i] = a[i];
//			else {
//				b[i] = a[i - a.length];
//			}
//		}
		System.arraycopy(a, 0, b, 0, 3);
		System.arraycopy(a, 0, b, 3, 3);
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i]);
		}
	}
}

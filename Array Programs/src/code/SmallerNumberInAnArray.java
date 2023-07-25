package code;

public class SmallerNumberInAnArray {

	public static void main(String[] args) {
		int[] a = { 11, 2, 3, 4, 5, 12, 8, 9 };
		int temp = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] < temp)
				temp = a[i];
		}
//		System.out.println(temp);
//		SecondSmallerNumber(a);
		SecondBigestNumber(a);
	}

	static void SecondSmallerNumber(int[] a) {
		int s1 = a[0];
		int s2 = a[0];
		for (int n = 1; n < a.length; n++) {
			if (a[n] < s1) {
				s2 = s1;
				s1 = a[n];
			} else if (a[n] < s2 || s1 == s2)
				s2 = a[n];
		}
		System.out.println(s1);
		System.out.println(s2);
	}

	static void SecondBigestNumber(int[] a) {
		int s1 = a[0];
		int s2 = a[0];
		for (int n = 1; n < a.length; n++) {
			if (s1 < a[n]) {
				s2 = s1;
				s1 = a[n];
			} else if (s2 < a[n] || s1 == s2)
				s2 = a[n];
		}
		System.out.println(s1);
		System.out.println(s2);
	}
}

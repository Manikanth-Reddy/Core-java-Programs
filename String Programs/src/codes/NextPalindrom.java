package codes;

public class NextPalindrom {
	public static void main(String[] args) {
		isPalindeom(131);
	}

	public static void isPalindeom(int n) {
		int sum = 0;
		int rem = 0;
		int m = n;
		while (n > 0) {
			rem = n % 10;
			sum = sum * 10 + rem;
			n /= 10;
		}
		if (sum == m) {
			System.out.println(sum);
			return;
		} else {
			n = m;
			n++;
		}

	}
}

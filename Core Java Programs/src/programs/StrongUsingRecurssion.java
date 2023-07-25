package programs;

public class StrongUsingRecurssion {
	public static void main(String[] args) {
		int n = 145;
		if (isStrong(n) == n)
			System.out.println("Strong");
		else
			System.out.println("not a Strong");
	}

	public static int isStrong(int n) {
		if (n == 0)
			return 0;
		return fact(n % 10) + isStrong(n / 10);
	}

	public static int fact(int n) {
		if (n == 0)
			return 1;
		return n * fact(n - 1);
	}

}

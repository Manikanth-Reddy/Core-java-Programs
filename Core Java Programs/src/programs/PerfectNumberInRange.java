package programs;

import java.util.Scanner;

public class PerfectNumberInRange {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number ");
		int start = s.nextInt();
		int end = s.nextInt();
		s.close();
		for (int n = start; n <= end; n++) {
			int sum = 0;
			for (int i = 1; i <= n / 2; i++) {
				if (n % i == 0)
					sum += i;
			}
			if (sum == n)
				System.out.println(n + " is a perfect number");
		}
	}
}

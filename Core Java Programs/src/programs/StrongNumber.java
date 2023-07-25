package programs;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number :");
		int n = s.nextInt(), original = n, sum = 0;
		s.close();
		while (n > 0) {
			int d = n % 10;
			int fact = 1;
			for (int i = 1; i <= d; i++)
				fact *= i;
			sum += fact;
			n /= 10;
		}
		if (original == sum)
			System.out.println(original + " is a strong number");
		else
			System.out.println(original + " is not a strong number");
	}

}

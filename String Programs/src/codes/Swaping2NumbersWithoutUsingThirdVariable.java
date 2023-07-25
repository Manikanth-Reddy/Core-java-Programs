package codes;

import java.util.Scanner;

public class Swaping2NumbersWithoutUsingThirdVariable {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 2 Numbers");
		int a=s.nextInt();
		int b=s.nextInt();
		s.close();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a);
		System.out.println(b);
	}

}

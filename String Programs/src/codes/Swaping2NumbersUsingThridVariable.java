package codes;

import java.util.Scanner;

public class Swaping2NumbersUsingThridVariable {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 2 Numbers");
		int a=s.nextInt();
		int b=s.nextInt();
		s.close();
		int temp=a;
		 a=b;
		b=temp;
		System.out.println(a+","+b);
	}

}

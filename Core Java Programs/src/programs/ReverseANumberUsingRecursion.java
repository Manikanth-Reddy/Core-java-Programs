package programs;

import java.util.Scanner;

public class ReverseANumberUsingRecursion {
	static int rev=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter a  num");
		int n=s.nextInt();
		s.close();
	if(reverse(n)==n) System.out.println("Palndrome");
	else System.out.println("not a palndrome");
	}
	static int  reverse(int n) {
			if(n==0) return rev;
			rev=(rev)*10+n%10;
			return reverse(n/10);
	}
}

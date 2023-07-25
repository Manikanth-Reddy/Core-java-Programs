package codes;

import java.util.Scanner;

public class Permutation {
	static int count =0;
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string :");
		String s1=s.next();
		permutation(s1, 0, s1.length()-1);
		System.out.println(count);
		s.close();
	}

	static void permutation(String s ,int start, int end ) {
		if (start==end) {
			System.out.println(s);
			count++;
			return;
		}
		for(int i=start;i<=end;i++) {
			String s1=swap(s, start, i);
			permutation(s1, start+1, end);
		}
	}
	static String swap(String s,int start,int end) {
		char [] a=s.toCharArray();
		char temp=a[start];
		a[start]=a[end];
		a[end]=temp;
		return new String(a);
	}
}

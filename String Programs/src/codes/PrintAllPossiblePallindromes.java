package codes;

import java.util.Scanner;

public class PrintAllPossiblePallindromes {
	public static void main(String[] args) {
		System.out.print("Enter a string:");
		Scanner s=new Scanner(System.in);
		String s1=s.next().toLowerCase();
		s.close();
		for(int i=0;i<=s1.length()-1;i++) {
			for(int j=i+1;j<=s1.length()-1;j++) {
				if(isPallindrome(s1, i, j)) {
					System.out.println(s1.substring(i,j+1));
				}
			}
		}
	}
	static boolean isPallindrome(String s,int start,int end) {
		while (start<end) {
			if(s.charAt(start)!=s.charAt(end)) return false;
			start++;
			end--;
		}
		return true;
	}
}

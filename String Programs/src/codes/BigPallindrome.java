package codes;

import java.util.Scanner;

public class BigPallindrome {

	public static void main(String[] args) {
		String BigPallindrome="";
		System.out.print("Enter a string:");
		Scanner s=new Scanner(System.in);
		String s1=s.next().toLowerCase();
		s.close();
		for(int i=0;i<s1.length();i++) {
			for(int j=i+1;j<s1.length();j++) {
				if(isPallindrome(s1, i, j)) {
					String temp=s1.substring(i,j+1);
					if(temp.length()>BigPallindrome.length()) 
						BigPallindrome=temp;
				}
			}
		}
		System.out.println(BigPallindrome);
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

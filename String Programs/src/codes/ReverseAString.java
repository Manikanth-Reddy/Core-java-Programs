package codes;

import java.util.Scanner;

public class ReverseAString {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a String :");
		String s1=s.nextLine();
		String s2="";
		for(int i=s1.length()-1;i>=0;i--) s2+=s1.charAt(i);
		System.out.println(s2);
		s.close();
	}
}

package codes;

import java.util.Scanner;

public class CountOfOvels {
	public static void main(String[] args1) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a string :");
		String s1=s.nextLine();
		s.close();
		s1=s1.toLowerCase();
		int owels=0;
		int consonents=0;
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)=='a'|| s1.charAt(i)=='e'|| s1.charAt(i)=='i'|| s1.charAt(i)=='o'|| s1.charAt(i)=='u')
				owels++;
			else {
				consonents++;
			}
		}
		System.out.println("Toal no of Owels ="+owels);
		System.out.println("Toal no of Consonents ="+consonents);
	}
}

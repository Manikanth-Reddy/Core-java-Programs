package codes;

import java.util.Scanner;

public class ReverseEachWord {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string :");
		String s1=s.nextLine();
		s.close();
		String s2="";
		String [] a=s1.split(" ");
		for(int i=0;i<a.length;i++) {
			String temp="";
			String demo=a[i];
			for(int j=demo.length()-1;j>=0;j--) {
				temp+=demo.charAt(j);
			}
			s2+=temp+" ";
		}
		System.out.println(s2.trim());
	}
}

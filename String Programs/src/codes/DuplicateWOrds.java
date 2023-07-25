package codes;

import java.util.Scanner;

public class DuplicateWOrds {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a string :");
		String s1 = s.nextLine();
		s.close();
		String[] a = s1.split(" ");
		String s2 = "";
		for (int i = 0; i < a.length; i++) {
			if(!s2.contains(a[i])) {
				s2+=a[i];
				s2+=" ";
			}
		
		}
		System.out.println(s2.trim());
	}
}

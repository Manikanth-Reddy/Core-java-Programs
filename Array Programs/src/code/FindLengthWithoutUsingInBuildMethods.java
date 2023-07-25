package code;

import java.util.Scanner;

public class FindLengthWithoutUsingInBuildMethods{
	public static void main(String[] args) {
		Scanner s = new Scanner("java");
		s.useDelimiter("");
		int count=0;
		while (s.hasNext()) {
			count++;
			System.out.println(s.next()+"  ");
		}
		System.out.println(count);
		s.close();
	}
}

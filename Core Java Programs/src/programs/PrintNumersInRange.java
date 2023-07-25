package programs;

import java.util.Scanner;

public class PrintNumersInRange {
	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.println("Enter start & end values :");
		num(s.nextInt(), s.nextInt());
		s.close();
	}
	public static void num(int start,int end) {
		if(start!=end) {
			System.out.println(start);
			num(start+1,end);
		}
		else return;
	}
	
}

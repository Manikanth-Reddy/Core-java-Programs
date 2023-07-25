package programs;

import java.util.Scanner;

public class HappyNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number ");
		int n=s.nextInt();
		int num=n;
		s.close();
		
		while(num!=1 && num!=4) {
			num=isHappy(num);
		}
		if(num==1 ) System.out.println(n+" is a happy number");
		else System.out.println(n+" is not a happy number");
	}
	public static int isHappy(int a) {
		int sum=0;
		while(a>0) {
			int rem=a%10;
			sum+=rem*rem;
			a=a/=10;
		}
		return sum;
		
	}
	
}

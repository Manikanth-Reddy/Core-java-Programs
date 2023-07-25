package programs;
import java.util.Scanner;
public class NeonNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println(" enter a number");
		int n=s.nextInt();
		int sq=n*n;
		s.close();
		int sum=0;
		while(sq>0) {
			int d=sq%10;
			sum+=d;
			sq/=10;
		}
		if (sum==n)	System.out.println(n+" is a neon number ");
	}

}

package programs;
import java.util.Scanner;
public class Lcm {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter two number");
		int a=s.nextInt(),b=s.nextInt();
		int n=a>b?a:b;
		s.close();
		while (true)
		{
			if ((n%a==0)&& (n%b==0)) break;
			n++;
		}
		System.out.println("Lcm of "+a+","+b+" is "+n);
	}

}

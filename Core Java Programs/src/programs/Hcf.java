package programs;
import java.util.Scanner;
public class Hcf {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int a=s.nextInt(),b=s.nextInt();
		s.close();
		int n=a<b?a:b;
		int hcf=0;
		for (int i=2;i<=n;i++)
		{
			if ((a%i==0)&& (b%i==0)) hcf=i;
		}
		System.out.println(hcf);
	}

}

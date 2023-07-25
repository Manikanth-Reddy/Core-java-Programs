package programs;
import java.util.Scanner;
public class SumOfDigitsUntilSingleDigitOutput {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Number");
		int a=s.nextInt();
		int sum=0,add=0;
		s.close();
		while (a>0)
		{
			int n=a%10;
			sum+=n;
			a/=10;
		}
		while (sum>9)
		{
			while (sum>0)
			{
				int d=sum%10;
				add+=d;
				sum/=10;
			}
		}System.out.println(add);
			
	}

}

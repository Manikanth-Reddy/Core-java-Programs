package programs;
import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int a= s.nextInt();
		s.close();
		int count=0;
		if (a>0)
		{
			for ( int i=2;i<=a/2;i++)
			{
				if(a%i==0)
				{
					count++;
				}
			}
			if (count==0)
				System.out.println(a+" is a prime number");
			else 
				System.out.println(a+" is not a prime number");
		}
		else 
			System.out.println(" In valid input");

	}
}

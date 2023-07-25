package programs;
import java.util.Scanner;
public class PerfectNumUsingMethods {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("Enter range: ");
		int start=s.nextInt(),end=s.nextInt();
		s.close();
		for (int i=start;i<=end;i++)
		{
			if ( isPerfect (i)) System.out.println(i+" is perfect number");
		}
	}
	static boolean isPerfect(int n)
	{
		int sum=0;
		 for(int i=1;i<=n/2;i++)
		 {
			 if (n%i==0)	sum+=i;
		 }return sum==n;
	}
}

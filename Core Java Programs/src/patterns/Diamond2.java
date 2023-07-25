package patterns;
import java.util.Scanner;
public class Diamond2 {
	public static void main (String[] king)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int n=s.nextInt();
		int starts=1,spaces=n/2;
		s.close();
		for(int i=1;i<=n;i++)
		{
			for (int j=1;j<=spaces;j++)
			{
				System.out.print(" ");
			}
			for (int j=1;j<=starts;j++)
			{
				System.out.print('x');
			}
			System.out.println();
			if (i<=n/2) 
			{
				spaces--;
				starts+=2;
			}
			else 
			{
				spaces ++;
				starts-=2;
			}
		}
	}
}

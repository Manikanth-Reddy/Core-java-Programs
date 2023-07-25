package patterns;
import java.util.Scanner;
public class BoxPattern {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=s.nextInt();
		s.close();
		for (int i=1;i<=n;i++)
		{
			for (int j=1;j<=n;j++)
			{
				System.out.print('X');
			}
			System.out.println();
		}
	}
}

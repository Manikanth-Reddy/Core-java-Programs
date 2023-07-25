package patterns;
import java.util.Scanner;
public class DecreasingOrderPattern 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number :");
		int n=s.nextInt(),count=n;
		s.close();
		for (int i=1;i<=n;i++)
		{
			for (int j=1;j<=count;j++)
			{
				System.out.print('X');
			}
			count--;
			System.out.println();
		}

	}

}

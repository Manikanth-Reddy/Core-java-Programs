package patterns;
import java.util.Scanner;
public class ReversedPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a number");
		int n=s.nextInt();
		s.close();
		for (int i=1;i<=n;i++)
		{
			for (int j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			for (int j=(n-i);j>0;j--)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
	}
}

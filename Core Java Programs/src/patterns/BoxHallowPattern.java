package patterns;
import java.util.Scanner;
public class BoxHallowPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=s.nextInt();
		s.close();
		for (int i=1;i<=n;i++)
		{
			for (int j=1;j<=n;j++)
			{
				if (i==1 ||j==1 ||j==n ||i==n)
				System.out.print('X');
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}

package patterns;
import java.util.Scanner;
public class SnakePatternOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a number :");
		int n=s.nextInt();
		s.close();
		for (int i=1;i<=n;i++)
		{
			if (i%2!=0)
			{
				int x=((i-1)*n)+1;
				for (int j=1;j<=n;j++)
				{
					System.out.print(x+"\t");
				x++;
				}
			}
			else
			{
				int x=i*n;
				for (int j=1;j<=n;j++)
				{
					System.out.print(x+"\t");
					x--;
				}
			}
			System.out.println();
		}
	}
}

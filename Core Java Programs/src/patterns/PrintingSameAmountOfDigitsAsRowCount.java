package patterns;
import java.util.Scanner;
public class PrintingSameAmountOfDigitsAsRowCount {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		System.out.println("Enter a number");
		int n=s.nextInt();
		int x=0;
		s.close();
		for (int i=1;i<=n;i++)
		{
			if (i%2!=0)
			{
				int a=x+1;
				for (int j=1;j<=i;j++)
				{
					System.out.print(a+"\t");
					a++;
				}
			}
			else 
			{
				 x=(i*(i+1))/2;
				int y=x;
				for (int j=1;j<=i;j++)
				{
					System.out.print(y+"\t");
					y--;
				}
			}
			System.out.println();
		}
	}
}

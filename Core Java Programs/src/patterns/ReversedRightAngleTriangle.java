package patterns;
import java.util.Scanner;
public class ReversedRightAngleTriangle {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("enter a numner");
		int n=s.nextInt(),o=n;
		int i,j,k=1;
		while (n>0)
		{
		for (i=1;i<n;i++ )
		{
			System.out.print(" ");
		}
		for (j=1;j<=k;j++ )
		{
			System.out.print("x");
		}System.out.println();
		k++;
		n--;
		}
		for (i=o;i>0;i--) {
			for (j=o;j>i;j--)
			{
				System.out.print(" ");
			}
			
		for (j=i;j>0;j--)
		{
			System.out.print("X");
		}
		System.out.println();
		}
	}

}

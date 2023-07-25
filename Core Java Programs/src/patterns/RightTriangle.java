package patterns;
import java.util.*;
public class RightTriangle 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
		System.out.print("enter number :");
		int n=s.nextInt();
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
	}
}

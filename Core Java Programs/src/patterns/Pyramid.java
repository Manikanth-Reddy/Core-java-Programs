package patterns;
import java.util.Scanner;
public class Pyramid {
	public static void main(String [] args)
	{
		Scanner s=new Scanner (System.in);
		System.out.print(" enter number :");
		int i, j, n =s.nextInt() ;       
		for (i=0; i<n; i++)   
		{        
			for (j=0;j<n-i; j++)   
			{   
			System.out.print(" "); 
			}   
				for (j=0; j<=i; j++ )   
			{   
			System.out.print("* ");   
			}   
			System.out.println();   
		}   
	}   

}

package patterns;
import java.util.*;
public class SnakePatternPrintedNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a Number :");
		int n=s.nextInt();
		int x=0,y=0;
		s.close();
		for (int i=1;i<=n ;i++)
		{
			if (i%2!=0)
			{
				for (x=y+1;x<y+i ;x++ )
				{
					System.out.print(x +" ");
				}
					System.out.println(x++);
					y=x;
				
			}
				else 
			{
				y=y+i-1;
				for (x= y; x> y- i + 1; x--)
				{
					System.out.print(x + " ");
				}
                System.out.println(x);
			}
	}
	}

}

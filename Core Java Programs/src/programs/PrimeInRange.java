package programs;
import java.util.Scanner;
public class PrimeInRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter range");
		int start=s.nextInt();
		int end=s.nextInt();
		s.close();
		for (int a=start;a<=end;a++)
		{
			int count=0;
			for (int b=1;b<=a ;b++ )
			{
				if (a%b==0)
				{
					count++;
				}
				}
				if (count==2)
				{
					System.out.print(a+" ");
				}
			}
	}

}

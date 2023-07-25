package patterns;
import java.util.Scanner;
public class AlphabetPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("enter a number :");
		int n=s.nextInt();
		s.close();
		int count=n,k=1;
		char c='A';
		for (int i=1;i<=n;i++)
		{
			for (int j=1;j<count;j++) System.out.print('A');
			for (int j=1;j<=k;j++) System.out.print(c);
			System.out.println();
			count--;
			c++;
			k++;
		}
	}
}

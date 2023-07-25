package programs;
import java.util.Scanner;
public class CurrencyCalculator
{
	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter amount value ");
		int amount = s.nextInt();
		s.close();
		if (amount>=2000)
		{
			System.out.println("2000 * = "+(amount/2000));
			amount %=2000;
		}
		if (amount>=500)
		{
			System.out.println("500 * = "+(amount/500));
			amount%=500;
		}
		if (amount>=200)
		{
			System.out.println("200 * = "+(amount/200));
			amount%=200;
		}
		if (amount>=100)
		{
			System.out.println("100 * = "+(amount/100));
		}
	}
}
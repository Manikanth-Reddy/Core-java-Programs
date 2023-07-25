package programs;
import java.util.Scanner;
public class BinaryToDecimal {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter binary to get Decimal");
		int binary=s.nextInt();
		s.close();
		int decimal=0,i=1;
		while (binary>0)
		{
			int d=binary%10;
			decimal+=(d*i);
			i*=2;
			binary/=10;
		}
		System.out.println("Decimal number is ="+decimal);
	}

}

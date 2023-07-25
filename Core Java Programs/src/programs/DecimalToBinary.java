package programs;
import java.util.Scanner;
public class DecimalToBinary {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number to get binary");
		int d=s.nextInt();
		s.close();
		int bin =0,i=1;
		while (d>0)
		{
			int bit=d%2;
			bin+=(bit*i);
			d/=2;
			i*=10;
		}
		System.out.println(bin);
	}

}

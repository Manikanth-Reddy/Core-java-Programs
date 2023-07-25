package programs;
import java.util.Scanner;
public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a number :");
		int n=s.nextInt(),original=n,temp=n,count=0,sum=0;
		s.close();
		while(temp>0)
		{
			temp/=10;
			count++;
		}
		System.out.println(count);
		while (n>0)
		{
			int rem=n%10;
			int power=1;
		for (int i=1;i<=count;i++)	power*=rem;
		System.out.println(rem+"^"+count+"="+power);
		n/=10;
		sum+=power;
		}
		System.out.println(sum);
		if (original==sum)	System.out.println(original+" is a armstrong number");
		else 	System.out.println(original+" is not a armstrong number ");

	}

}

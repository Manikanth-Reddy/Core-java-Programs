package programs;
import java.util.Scanner;
public class ArmstrongInRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	      System.out.println("Enter the first number ::");
	      int start = sc.nextInt();
	      System.out.println("Enter the second number ::");
	      int end = sc.nextInt();
	      sc.close();

	      for (int i = start; i<end; i++)
	      {
	         int temp=i,original=i,count=0,sum=0;
			 while (original!=0)
			 {
				 original/=10;
				 count++;
			 }
	         while(temp != 0)
				 {
				 int rem = temp % 10;
				 int power=1;
			   for (int j=1; j<=count;j++) power*=rem ;
	            temp/= 10;
	           sum+=power;
				 }
	         if(sum == i) System.out.println(i+" is an Armstrong number.");	 
	   }
	}
}

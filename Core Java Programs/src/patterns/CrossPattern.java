package patterns;
import java.util.Scanner;
public class CrossPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter N : ");
		int n=sc.nextInt();	 
			int a=n*2-1;
			sc.close();
				for(int i=1;i<=a;i++)
               {
					 for(int j=1;j<=a;j++)
                
                        {     
							if(j==i || j==a-i+1)
                               System.out.print("X");
                                System.out.print(" ");
								}
					 System.out.println();
               }  
	}
}

package patterns;
public class Diamond {
	public static void main(String[] args) {
		int i, j; 
		for (i=0; i<5; i++)   
		{        
			for (j=5-i; j>1; j--)
			{   
			System.out.print(" "); 
			}   
			for (j=0; j<=i; j++ )   
			{   
			System.out.print("* ");   
			}   
			System.out.println();  
		}
		for (i=5;i>0;i--)
		{
			for (j=5; j>i; j--) System.out.print(" "); 
			for (j=i;j>0;j--) System.out.print("* ");
			System.out.println();
		}
	}
}

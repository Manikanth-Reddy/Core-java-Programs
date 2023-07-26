package unCheckedExceptions;

public class Demo2 {

	public static void main(String[] args) {
		int []a= {1,2,3,4,5,6};
		try {
		System.out.println(a[6]);
		}
//		catch(Exception e) {
//			System.out.println("Exeception Handeled ");
//		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			
			e.printStackTrace();
			
		}
		System.out.println("Main Ends");
	}
}

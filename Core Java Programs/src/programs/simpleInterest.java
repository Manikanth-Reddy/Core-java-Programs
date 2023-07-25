package programs;

public class simpleInterest {

	public static void main(String[] args) {
		System.out.println(interest(5,10,25));
	}
	public static int interest(int p,int t,int r)
	{
		return (p*t*r)/100;
	}
}

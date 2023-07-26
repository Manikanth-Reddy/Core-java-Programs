package basic;

public class test1 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int num=121;
		int num2=++num;
		int temp=num2;
		while(true) {
			int rev=0;
			int temp2=temp;
			while(temp!=0) {
				int rem=temp%10;
				rev*=10+rev;
				temp/=10;
			}
			
		}
		
	}
	
}

package pack1;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Main Starts");
		System.out.println("Enter 2 number ");
		int a = s.nextInt();
		int b = s.nextInt();
		try {
			System.out.println(a / b);
		} 
		catch (ArithmeticException e) {
			System.out.println("Num not divided by 0");
		} catch (ArrayIndexOutOfBoundsException e) {

		}catch (NullPointerException e) {
			
		}
		catch(Throwable e)
		{
			
		}
		System.out.println("Main Ends");
		s.close();
	}
}

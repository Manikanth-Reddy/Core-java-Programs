package practice;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		boolean r = true;
			System.out.println("🙏🙏Welcome to Mani's Calculator🙏🙏 \n" + " Available Options are \n"
					+ "1.Length of a Number \n" + "2.Factorial Of a Number \n" + "3.Power of Number \n"
					+ "4.Sum of a given number \n" + "5.Prime Number \n" + "6.Perfect Number \n" + "7.Strong Number \n"
					+ "8.Armstrong Number \n" + "9.Odd Or Even \n" + "10.Reversing Number \n"
					+ "11.Lcm of two numbers \n" + "12.Hcf of two numbers \n13.Prime NUmber in Range \n"
					+ "14.Perfect Numbers in range \n" + "15.Strong Number in range \n16.Armstrong in range\n17.Exit");
			Scanner s = new Scanner(System.in);
			do {
			System.out.println("Enter your choice :");
			int choice = s.nextInt();
			if (choice == 1) {
				System.out.println("Entered choice is length of a Number \n" + "Enter number to find length");
				int n = s.nextInt();
				System.out.println(CalsiBackEnd.length(n) + " is the length of number");
			} else if (choice == 2) {
				System.out.println("Entered choice is Factorial of a Number \n" + "Enter number to find factorial");
				int n = s.nextInt();
				System.out.println(CalsiBackEnd.fact(n) + " is the factorial of given number");
			} else if (choice == 3) {
				System.out.println("Entered choice is Power of a Number \n" + "Enter base and exponent to find power");
				int base = s.nextInt();
				int exponent = s.nextInt();
				System.out.println(CalsiBackEnd.power(base, exponent) + " is the power");
			} else if (choice == 4) {
				System.out.println("Entered choice is sum Of a Number \n" + "Enter number to find Sum ");
				int i = s.nextInt();
				int j = s.nextInt();
				System.out.println(CalsiBackEnd.sum(i, j) + " is the sum of Enteed Numbers");
			} else if (choice == 5) {
				System.out.println("Entered choice Prime Number \n" + "Enter number to find whether its prime or nor ");
				CalsiBackEnd.prime(s.nextInt());
			} else if (choice == 6) {
				System.out.println(
						"Entered choice is Perfect Number \n" + "Enter number to find whether its perfect or nor");
				CalsiBackEnd.perfect(s.nextInt());
			} else if (choice == 7) {
				System.out.println(
						"Entered choice is Strong Number \n" + "Enter number to find whether its Strong or nor");
				CalsiBackEnd.strong(s.nextInt());
			} else if (choice == 8) {
				System.out.println(
						"Entered choice is ArmStrong Number \n" + "Enter number to find whether its ArmStrong or nor");
				CalsiBackEnd.armStrong(s.nextInt());
			} else if (choice == 9) {
				System.out.println(
						"Entered choice is Odd Or Even Number \n" + "Enter number to find whether its Odd or Even");
				CalsiBackEnd.oddOrEven(s.nextInt());
			} else if (choice == 10) {
				System.out.println("Entered choice is Reversing a  Number \n" + "Enter number to Reverse");
				CalsiBackEnd.reverse(s.nextInt());
			} else if (choice == 11) {
				System.out.println("Entered choice is Lcm of Numbers \n" + "Enter numbers to Find Lcm");
				CalsiBackEnd.lcm(s.nextInt(), s.nextInt());
			} else if (choice == 12) {
				System.out.println("Entered choice is Hcf of Numbers \n" + "Enter numbers to find Hcf");
				CalsiBackEnd.hcf(s.nextInt(), s.nextInt());
			} else if (choice == 13) {
				System.out.println("Entered choice is Prime number in range \n Enter range to find Prime numbers");
				int start = s.nextInt();
				int end = s.nextInt();
				for (int i = start; i <= end; i++)
					CalsiBackEnd.prime(i);
			} else if (choice == 14) {
				System.out.println("Entered choice is Perfect number in range \n Enter range to find Perfect numbers");
				int start = s.nextInt();
				int end = s.nextInt();
				for (int i = start; i <= end; i++)
					CalsiBackEnd.perfect(i);
			} else if (choice == 15) {
				System.out.println("Entered choice is strong number in range \n Enter range to find strong numbers");
				int start = s.nextInt();
				int end = s.nextInt();
				for (int i = start; i <= end; i++)
					CalsiBackEnd.strong(i);
			} else if (choice == 16) {
				System.out.println(
						"Entered choice is Armstrong number in range \n Enter range to find Armstrong numbers");
				int start = s.nextInt();
				int end = s.nextInt();
				for (int i = start; i <= end; i++)
					CalsiBackEnd.armStrong(i);
			} else if (choice==17){
				r = false;
				System.out.println(
						"🙏🙏🙏 Thanks For using My Software🙏🙏🙏\n VISIT AGAIN");
			}
			else
				System.out.println("Entered choice is not available , we are working on it \\n Thank You visit again");
		} while (r);
	}
}
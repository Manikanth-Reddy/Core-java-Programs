package codes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SmallestPrimeNumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a range ");
		int start=s.nextInt();
		int end=s.nextInt();
		s.close();
		List<Integer> l=new ArrayList<>();
		for(int i=start;i<=end;i++) {
			if(isPrime(i)) 
			{
			l.add(i);
			}
		}
		System.out.println(l.get(0));
	}
		static boolean isPrime(int n) {
			for(int i=2;i<=n/2;i++) {
				if(n%i==0) return false;
			}
			return true;
		
	}
}

package practice;
public class CalsiBackEnd 
{
	public static int length(int n)
	{
		int count=0;
		while(n>0)
		{
			n/=10;
			count++;
		}
		return count;
	}
	public static int  fact(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++) fact*=i;
		return fact;
	}
	public static int  power(int base,int exponent )
	{
		int power=1;
		for(int i=1;i<=exponent;i++) power*=base;
		return power;
	}
	public static int sum(int...a)
	{
		int sum=0;
		for(int n:a) sum+=n;
		return sum;
	}
	public static void prime(int n)
	{
		int count=0;
		for(int i=2;i<=n/2;i++) if(n%i==0) count++;
		if(count==0) System.out.println(n+" is a prime number");
	}
	public static void perfect(int n)
	{
		int factor=0;
		for(int i=1;i<=n/2;i++) factor+=i;
		if(factor==n) System.out.print(factor+" is a perfect Number");
	}
	public static void strong(int n)
	{
		int sum=0;
		int temp=n;
		while (n>0)
		{
			int d=n%10;
			sum+=fact(d);
			n/=10;
		}
		if(sum==temp) System.out.println(sum+" is a strong number");
	}
	public static void armStrong(int n )
	{
		int temp=n;
		int sum=0;
		int l=length(n);
		while(n>0)
		{
			int d=n%10;
			sum+=power(d,l);
			n/=10;
		}
		if(sum==temp) System.out.println(sum+" is a Armstrong Number");
	}
	public static void oddOrEven(int n)
	{
		String s=n%2==0?"Even Number":"Odd Number";
		System.out.println(n+" is an "+s);
	}
	public static void reverse(int n)
	{
		while(n>0)
		{
			System.out.print(n%10);
		n/=10;
		}
		System.out.println(" is reversed number ");
	}
	public static void lcm(int a,int b)
	{
		int n=a>b?a:b;
		while (true)
		{
			if ((n%a==0)&& (n%b==0)) break;
			n++;
		}
		System.out.println("Lcm of "+a+","+b+" is "+n);
	}
	public static void hcf(int a,int b)
	{
		int n=a<b?a:b;
		for (int i=2;i<=n;i++) if ((a%i==0)&& (b%i==0)) System.out.println(i+" is the highest common factor");
	}
}

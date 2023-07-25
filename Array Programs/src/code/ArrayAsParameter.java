package code;

public class ArrayAsParameter {

	public static void main(String[] args) {
		int []a=new int[5];
		a[0]=5;
		a[1]=10;
		a[2]=15;
		a[3]=20;
		a[4]=25;
//	Sum(a);
		m1(a);
	}
	public static void m1(int[]a)
	{
		int n=0;
		while(n<a.length) {
			System.out.print(a[n]+",");
			n++;
		}
	}
	static void Sum(int []a) {
		int sum=1;
		int n=0;
		for(n=0;n<a.length;n++) {
			sum=sum*a[n];
			System.out.print(sum+" ");
		}
	
	}
}

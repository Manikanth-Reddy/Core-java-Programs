package codes;

public class ChangeCaseWithoutUsingStringFuncions {
	public static void main(String[] args) {
		System.out.println(ChangeCase("java"));
	}
	static String ChangeCase(String s) {
		char[] a=s.toCharArray();
		for(int i=0;i<=a.length-1;i++) {
			if(a[i]>='A'&& a[i]<='Z') a[i]=((char)(a[i]+32));
			else if (a[i]>='a'&& a[i]<='z') a[i]=((char)(a[i]-32));
		}  
		return new String(a);
	}
}

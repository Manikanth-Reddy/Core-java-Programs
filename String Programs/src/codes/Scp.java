package codes;

public class Scp {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		String s1="java";
		String s2="java";
		String s3=new String("java");
		String a1="javadev";
		String a2="java"+"dev";
		System.out.println(s1==s2);
		System.out.println(a1==a2);// true
	}
}

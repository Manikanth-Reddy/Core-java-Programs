package Test;

public class Demo {
	public static void main(String[] args) {
		String s1 = "We are Java Developers";
//		char a = s1.charAt(8);
//		System.out.println(a);
//		int in = s1.indexOf('e');
//		System.out.println(in);
//		int length = s1.length();
//		System.out.println(length);
//		char[] c = s1.toCharArray();
//		for(char a:c)System.out.println(a);
//		System.out.println(s1.toLowerCase());
//		System.out.println(s1.toUpperCase());
		String[] s = s1.split("e");
		for(String a: s)System.out.println(a);
	}
}

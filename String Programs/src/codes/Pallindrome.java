package codes;

public class Pallindrome {
	public static void main(String[] args) {
		String s1 = "malayalam";
	System.out.println(isPallindrome(s1));
	}
	static boolean isPallindrome(String arg) {
		char[] ar = arg.toCharArray();
		int i = 0, j = ar.length - 1;
		while (i < j) {
			if (ar[i] != ar[j])
				return false;
			i++;
			j--;
		}
		return true;
	}
}

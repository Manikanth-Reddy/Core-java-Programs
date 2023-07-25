package codes;

public class PallindromeOfNotCaseSensitive {

	public static void main(String[] args) {
		System.out.println(isPallindrome("mAdam"));
	}
	static boolean isPallindrome(String arg) {
		arg=arg.toLowerCase();
		System.out.println(arg);
		char[] ar=arg.toCharArray();
		int i =0,j=ar.length-1;
		while(i<j) {
			if(ar[i]!=ar[j])return false;
			i++;
			j--;
		}
		return true;
	}
}

package codes;

public class DeletingSameRepeatingConsigutiveCharacters {
	public static void main(String[] args) {
		String s = "succeffff";
		char[] a = s.toCharArray();
		for (int i = 0; i < a.length-1; i++) {
			if (i  < a.length-1 && a[i] == a[i + 1] );
			else
				System.out.print(a[i]);
			
		}
	}
}

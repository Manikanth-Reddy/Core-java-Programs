package codes;

public class CountOfWOrds {
	public static void main(String[] args) {
		String s2="java is very easy and java is very easy to learn java ";
		countOfWords(s2);
	}

	public static void countOfWords(String s) {
		int count = 0;
		String[] s1 = s.split(" ");
		for (int i = 0; i < s1.length; i++)
			if (s1[i].equals("java"))
				count++;
		System.out.println("java is repeated for " + count);
	}
}

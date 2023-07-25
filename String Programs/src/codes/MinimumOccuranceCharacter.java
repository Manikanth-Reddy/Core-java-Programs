package codes;

public class MinimumOccuranceCharacter {
	public static void main(String[] args) {
		String s = "aabcebcdesssss";
		int min =s.length();
		char c = ' ';
		while (s != "") {
			char ch = s.charAt(0);
			String s1 = s.replace(ch + "", "");
			int count = s.length() - s1.length();
			if (min >= count) {
				min = count;
				c = ch;
			}
			s = s1;
		}
		System.out.println(c + " =" + min);
	}
}

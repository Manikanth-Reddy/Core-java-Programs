package codes;

public class Anagram {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		String s = "silent";
		String s1 = "listen";
		for (int i = 0; i < s.length(); i++) {
			if (!s1.contains(s.charAt(i) + "")) {
				System.out.println("Pranagram");
				break;
			} else {
				System.out.println("anagram");
				break;
			}
		}
	}
}

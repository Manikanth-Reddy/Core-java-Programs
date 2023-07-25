package codes;

public class ToCharArray {

	public static void main(String[] args) {
		String s1="javadev";
		char[] ar=s1.toCharArray(); 
		// toCharArray will take each and every character in the string 
		for(char c:ar) System.out.println(c);

	}

}

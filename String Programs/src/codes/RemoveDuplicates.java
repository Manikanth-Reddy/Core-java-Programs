package codes;

public class RemoveDuplicates {
	public static void main(String[] args) {
	System.out.println(removeDuplicates("ManiKanthReddy"));
	}
	static String removeDuplicates(String s) {
		String s2="";
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(s2.indexOf(c)==-1)s2+=c;
		
		}return s2;
	}
}
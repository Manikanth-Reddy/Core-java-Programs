package codes;

public class MaximumOccuranceCharacter {
	public static void main(String[] args) {
		String s = "ineee0aaaaadtogoformy native";
		int max=0;
		char c=' ';
		while (s!="") {
			char ch=s.charAt(0);
			String s1=s.replace(ch+"", "");
			int count =s.length()-s1.length();
			if(max<=count) {max=count;
			c=ch;}
			s=s1;
		}
		System.out.println(c+" ="+max);
	}
}

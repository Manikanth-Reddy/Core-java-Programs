package codes;

public class PrintNumbersInAString {

	public static void main(String[] args) {
		String s="KA123ECGH5HHO697";
		for(int i=0;i<s.length();i++) {
		char c=s.charAt(i);
		if(c>='0'&& c<='9') System.out.println(c);
		}
	}

}

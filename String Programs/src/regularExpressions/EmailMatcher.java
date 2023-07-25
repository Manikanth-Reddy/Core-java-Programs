package regularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailMatcher {

	public static void main(String[] args) {
		String exp="[a-zA-Z0-9]+@[a-zA-Z0-9]+[.]com";
		String str="Manikanth11800@gmail.com";
		Pattern p=Pattern.compile(exp);
		Matcher m=p.matcher(str);
		if(m.matches()) System.out.println(str);
		else System.out.println("Not Macthed");	}
}

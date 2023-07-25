package regularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNUmberMatch {
	public static void main(String[] args) {
		String exp="[6789][0-9]{9}";
		String str="9398502657";
		Pattern p=Pattern.compile(exp);
		Matcher m=p.matcher(str);
//		while(m.find()) {
//			System.out.println(m.group());
//		}
		if(m.matches()) System.out.println(str);
		else System.out.println("Not Macthed");
	}
}

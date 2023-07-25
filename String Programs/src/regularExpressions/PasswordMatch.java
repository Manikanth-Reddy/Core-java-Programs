package regularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordMatch {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		String exp="(?=.*[0-9])(?=.*[A-Z])(?=.*[!@[ #$%^&*()]]).{6,}";
		String exp2="([0-9]\\1*)";
		String str="Manikaanth@42899";
		Pattern p=Pattern.compile(exp2);
		Matcher m=p.matcher(str);
		if(m.matches()) System.out.println(str);
		else System.out.println("Not Macthed");
		while(m.find()) System.out.println(m.group());
	}
}

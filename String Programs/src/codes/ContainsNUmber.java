package codes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ContainsNUmber {
	public static void main(String[] args) {
		Pattern p = Pattern.compile(".*\\d.*");
		Matcher m = p.matcher("Mani");
		System.out.println(m.matches());
	}
}

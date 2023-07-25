package regularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchingCharactersInAStringByBackReferencing {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("([a-z])([0-9])\\2\\1");
		// to match 1 or more repeating characters we use + operator after the pattern
		Matcher m = p.matcher("a1abc3cdd33d");
		RepalceAll$Split();
		while (m.find()) {
			System.out.println(m.group());
		}
		MatchPatternInString();
	}
	public static void MatchPatternInString() {
		Pattern p=Pattern.compile("([a-z]+)\\1");
		Matcher m=p.matcher("ssssss");
		while(m.find()) {
			System.out.println(m.start());
			System.out.println(m.group());
		}
	}
	public static void RepalceAll$Split() {
		String s1="a1b2c3";
		String s2=s1.replace("[0-9]","a");
		System.out.println(s2);
		String s3=s1.replaceAll("[0-9]","_mani_");
		System.out.println(s3);
		String []a=s1.split("[0-9]");
		for (String s:a)System.out.println(s);
	}
}

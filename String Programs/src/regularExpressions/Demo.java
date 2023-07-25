package regularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {

	public static void main(String[] args) {
		Pattern p=Pattern.compile("bad"); // . can match with all alphabets 
		Matcher m=p.matcher("badabjdbadgadkabad");
		int count=0;
		while(m.find()) {
//			System.out.println(m.start());
//			System.out.println(m.end());
//			System.out.println(m.group());
			count++; 
		}	
		System.out.println(count);
	}
}

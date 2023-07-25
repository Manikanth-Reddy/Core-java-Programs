package codes;

import java.util.ArrayList;
import java.util.List;

public class SplitAStringWIthoutUsingSlpit {
	public static void main(String[] args) {
	String s1="I am a java developer i dont know java";
	int j=0;
	int i=0;
	int len=s1.length();
	List<String> l=new ArrayList<>();
		while(j<len) {
			while(j<len && s1.charAt(j)!=' ') j++;
			String temp=s1.substring(i,j);
			l.add(temp);
			i=++j;
		}
		for(int k=0;k<l.size();k++) {
			String s=l.get(k);
			if(s.charAt(0)>='a' && s.charAt(0)<='z')
			s=s.replace(s.charAt(0),(char) (s.charAt(0)-32));
			System.out.println(s);
			
		}
	}
}

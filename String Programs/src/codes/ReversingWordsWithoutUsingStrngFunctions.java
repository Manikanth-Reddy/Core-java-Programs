package codes;

public class ReversingWordsWithoutUsingStrngFunctions {
	public static void main(String[] args) {
		String s1="Java is an oop lang";
		char[]a=s1.toCharArray();
		int len=a.length;
		int i=len-1;
		int j=len-1;
		String s2="";
		while(j>=0) {
			
			while (j>=0 && a[j]!=' ') j--;
			String temp="";
			int k=i;
			while(k>=j+1) {
				temp+=a[k];
				k--;
			}
			s2+=temp;
			s2+=" ";
			i=--j;
		}
		System.out.println(s2);	
	}
}

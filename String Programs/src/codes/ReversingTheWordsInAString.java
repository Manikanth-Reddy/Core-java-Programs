package codes;

public class ReversingTheWordsInAString {

	public static void main(String[] args) {
		String s1="java is oop language";
		String[] a =s1.split(" ");
		String s2="";	
		for(int j=a.length-1;j>=0;j--){
			s2 += a[j];
			s2 +=" ";	
		}
		s2=s2.trim();
		System.out.println(s2);
	}
}

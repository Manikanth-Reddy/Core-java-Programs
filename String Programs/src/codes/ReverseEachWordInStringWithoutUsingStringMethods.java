package codes;

public class ReverseEachWordInStringWithoutUsingStringMethods {

	public static void main(String[] args) {
		String s1="Mani kanth reddy";
		char[]a=s1.toCharArray();
		int len=a.length;
		int i=0;
		int j=0;
		String s2="";
		while(j<len) {
			while (j<len && a[j]!=' ') j++; 
			
			String temp="";
			int k=j-1;
			while(k>=i) {
				temp+=a[k];
				k--;
			}
			s2+=temp;
			if (j<len) s2+=" ";
			i=++j;
		}
		System.out.println(s2);
		
	}

}

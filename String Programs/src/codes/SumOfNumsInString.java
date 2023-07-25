package codes;

public class SumOfNumsInString {

	public static void main(String[] args) {
		String s="1345";
		int sum=0;
		for(int i=0;i<=s.length()-1;i++) {
			char c=s.charAt(i);
			if(c>='0'&&c<='9') {
				int n=c-'0';
				sum+=n;
			}
		}
		System.out.println(sum);
	}

}

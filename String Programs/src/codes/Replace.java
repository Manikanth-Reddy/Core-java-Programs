package codes;

public class Replace {

	public static void main(String[] args) {
		

		String s="I love my india and i live in india";
		replacebyname(s);
		
	}
	
	
	public static void replacebyname(String s) {
		String[] s1=s.split(" ");
		for(int i=0;i<s1.length;i++) {
			if(s1[i].equals("india")) s1[i]="Myself";
		}
		for(int n=0;n<s1.length;n++) System.out.print(s1[n]+" ");
	}
}

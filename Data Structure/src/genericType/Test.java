package genericType;

public class Test {
		
	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(44);
		a.add(12);
		a.add(15);
		a.add(20);
		a.add(55);
		a.add(10);
		a.add(0,30);
		for(int n=0;n<a.size();n++) System.out.println(a.get(n));
		System.out.println(a.toString());
	}

}

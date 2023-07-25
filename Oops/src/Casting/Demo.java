package Casting;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
        int a = 0, b = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(">");
            }
            int c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }
	}

}

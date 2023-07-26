package checkedExceptions;

public class ThowsKeyword {
	public static void div() {
		System.out.println(10/0);
	}
	public static void main(String[] args) throws Exception  {
		div();
	}
}

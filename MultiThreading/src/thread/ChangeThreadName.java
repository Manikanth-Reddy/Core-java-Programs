package thread;

public class ChangeThreadName {

	public static void main(String[] args) {
	System.out.println(Thread.currentThread().getName());
	Thread.currentThread().setName("7ecm9");
	System.out.println(Thread.currentThread().getName());
	}
}

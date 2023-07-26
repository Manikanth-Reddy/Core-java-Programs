package syncronised;

class myThread extends Thread {
	String name;

	public myThread(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println("Child " + name);
	}
}

public class Demo {

	public static void main(String[] args) {
		myThread t = new myThread("Mani");
		myThread t1 = new myThread("Reddy");
		t.start();
		t1.start();

	}

}
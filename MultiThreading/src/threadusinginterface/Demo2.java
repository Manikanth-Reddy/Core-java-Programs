package threadusinginterface;

class Thread1 extends Thread {
	static Thread m;

	@Override
	public void run() {
		try {
			m.join();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		for (int i = 1; i <= 3; i++) {
			System.out.println("Child Thread");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Thread2 extends Thread {
	@Override
	public void run() {
		for (int i = 1; i <= 3; i++)
			System.out.println("Sub Child");
	}
}

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
		Thread1 t1 = new Thread1();
		Thread1.m = Thread.currentThread();
		t1.start();
		t1.join();
		for (int i = 1; i <= 3; i++)
			System.out.println("Main Thread");

	}

}

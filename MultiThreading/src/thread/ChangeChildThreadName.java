package thread;

class Mani extends Thread {
	@Override
	public void run() {
		System.out.println("Hii");
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setName("Ramana");
		System.out.println(Thread.currentThread().getName());
	}
}

public class ChangeChildThreadName {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Mani m = new Mani();
		m.start();
		System.out.println(Thread.currentThread().getPriority() + " " + Thread.currentThread().getName()
				+ " Thread Before change");
		Thread.currentThread().setPriority(1);
		System.out.println(
				Thread.currentThread().getPriority() + " " + Thread.currentThread().getName() + " Thread After change");
		m.currentThread().setPriority(2);
		System.out.println(m.currentThread().getPriority() + " " + m.currentThread().getName());

	}
}

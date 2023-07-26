package syncronised;

class Sweety {
	public static synchronized void Propose(String name) {
		for (int i = 1; i <= 3; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.print("Proposed by :");

			System.out.println(name);
		}

	}
}

class Thread1 extends Thread {
	Sweety s;
	String name;

	public Thread1(Sweety s, String name) {
		super();
		this.s = s;
		this.name = name;
	}

	@SuppressWarnings("static-access")
	@Override
	public void run() {
		s.Propose(name);
	}
}

public class Demo2 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Sweety s1 = new Sweety();
		Sweety s2 = new Sweety();
		Thread1 t = new Thread1(s1, "Mani");
		Thread1 t1 = new Thread1(s1, "Reddy");
		t.start();
		t1.start();

	}

}

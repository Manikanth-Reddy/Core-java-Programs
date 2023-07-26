package syncronised;

class Printing {
	public void Printnum() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i + " Print Num");
			Thread.yield();
		}
	}

	public  void PrintChar() {
		for (int i = 65; i <= 70; i++) {
			System.out.println((char) i + " Print Char");
	
		}
	}
}

class Thread3 extends Thread {
	Printing p;

	public Thread3(Printing p) {
		super();
		this.p = p;
	}

	@Override
	public void run() {
		p.PrintChar();
	}
}

class Thread4 extends Thread {
	Printing p;

	public Thread4(Printing p) {
		super();
		this.p = p;
	}

	@Override
	public void run() {
		p.Printnum();
	}
}

public class Test {

	public static void main(String[] args) {
		Printing p1 = new Printing();
		Thread3 t = new Thread3(p1);
		Thread4 t1 = new Thread4(p1);
		t.start();
		t1.start();

	}

}

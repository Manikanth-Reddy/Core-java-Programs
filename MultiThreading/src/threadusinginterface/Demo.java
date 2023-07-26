package threadusinginterface;

class Mythread implements Runnable {

//	{
//		Mythread t=new Mythread();
//		Thread t1=new Thread();
//		Thread t2=new Thread(t);
//		t.start(); // Compile time error
//		t.run(); // Normal Method Call
//		t1.start(); // Thread Class run method with empty return value
//		t1.run(); // Thread class run method with out thread creation
//		t2.start(); // Thread created and Mythread run method is executed
//		t2.run();// Mythread run method is executed 
//	}

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Child Thread");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		Mythread my = new Mythread();
		Thread t = new Thread(my);
	
		t.start();
		t.join();
		for (int i = 1; i <= 5; i++) {
			System.out.println("Main Thread");
			Thread.yield();
		}
	}

}

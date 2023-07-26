package daemonThread;

class MyThread extends Thread {
	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println("Jinala Hurrr " +i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block 
				e.printStackTrace();
			}
		}
	}
}

public class DaemonThread2 {
	public static void main(String[] args) throws InterruptedException {
		MyThread m = new MyThread();
		m.setDaemon(true);
		m.start();
		for(int i=0;i<=5;i++) {
			System.out.println("Main Thread"+i);
			Thread.sleep(1000);
		}
	}
}

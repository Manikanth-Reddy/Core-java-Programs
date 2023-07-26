package daemonThread;

public class DaemonThread1 {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().isDaemon());
		Thread.currentThread().setDaemon(true);
	}
}

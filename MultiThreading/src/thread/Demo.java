package thread;
class MyThread extends Thread
{
	@Override
	public void run() {
		m1(10);
	}
	public void m1(int j) {
	for(int i=1;i<=10;i++)
		System.out.println(i);
	try {
		MyThread.sleep(2000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	}
}
public class Demo {
	public static void main(String[] args) throws IllegalThreadStateException {
	MyThread t=new MyThread();
	t.start();
	for(int i=65;i<=75;i++) System.out.println((char) i);
	}
}

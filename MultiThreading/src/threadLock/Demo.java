package threadLock;
class Mythread extends Thread{
	 static A a=new A();
	static B b=new B();
//	B b=new B();
//	public void m1()
//	{
//		this.start();
//		a.d1(b);
//	}
	@Override
	public void run() {
		a.d1(b);
	}
}
class Thread2 extends Thread {
	@Override
	public void run() {
		Mythread.b.d2(Mythread.a);
	}
	
}
class A{
	public  synchronized void d1 (B b) {
		System.out.println("A class d1 method");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}System.out.println("A class calling  B class last method");
		b.last();
	}
	public synchronized void last() {
		System.out.println("Last method of A class");
	}
}
class B{
	public synchronized void d2(A a) {
		System.out.println("B class d2 method ");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("B class calling  A class last method");
		a.last();
	}
	public synchronized void last() {
		System.out.println("Last method of B class");
	}
}
public class Demo {

	public static void main(String[] args) {
	Mythread t1=new Mythread();
	t1.start();
	Thread2 t2=new Thread2();
	t2.start();
	

	}

}

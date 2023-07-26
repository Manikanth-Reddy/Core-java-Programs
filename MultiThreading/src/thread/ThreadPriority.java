package thread;
class ThreadMani  extends Thread
{
	@Override
	public void run() {
		for(int i=1; i<=3;i++)
		System.out.println("Child Thread");
	}
}
public class ThreadPriority {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		ThreadMani ma=new ThreadMani();
		ma.start();
		ma.currentThread().setPriority(1);
		for(int i=1; i<=3;i++) System.out.println("Main Thread");
//		Some operating systems wont support thread priority i.e. the reason for variable output
	}

}

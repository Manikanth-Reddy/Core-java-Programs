package checkedExceptions;
public class InturptedCheckedException {

	public static void main(String[] args)  {
		System.out.println("Main starts");
		for(int i=1;i<=5;i++) {
			System.out.println(i);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
			}
		}
	}
}

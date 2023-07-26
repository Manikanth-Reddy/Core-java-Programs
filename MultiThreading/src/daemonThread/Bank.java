package daemonThread;
class Emp{
	int balace=10000;
	public synchronized void withdraw(int amount) {
		if(balace<amount) {
			try {
				System.out.println("You Fool Less Balance");
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		balace-=amount;
		System.out.println("Withdrawn done.......");
	}
	public synchronized void deposit(int money) {
		System.out.println("You fool enter money to Deposit.......");
		balace+=money;
		System.out.println("Money is deposited succesfully");
		notify();
	}
}
public class Bank {

	public static void main(String[] args) {
		Emp e=new Emp();
		new Thread() {
			public void run() {
				e.withdraw(15000);
			}
		}
		.start();
		new Thread() {
			public void run() {	
				e.deposit(5000);
			}
		}
		.start();
	}

}

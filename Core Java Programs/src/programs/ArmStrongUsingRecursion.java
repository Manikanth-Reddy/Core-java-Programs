package programs;

public class ArmStrongUsingRecursion {
	public static void main(String[] args) {
		int n = 1634;
		if (isArmStrong(n, count(n)) == n)
			System.out.println("ArmStrong");
		else
			System.out.println("Not Arm Strong");
	}
	public static int count(int n) {
		if(n==0)return 0;
		return 1+count(n/10);
	}

	public static int isArmStrong(int n, int pow) {
		if (n == 0)
			return 0;
		return (int) Math.pow(n % 10, pow) + isArmStrong(n / 10, pow);
	}

}

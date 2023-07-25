package inheritence;
class C
{
	int i=1;
}
public class Super extends C{
	int i=2;
	public static void main(String[] args) {
		Super s=new Super();
		s.m1();
	}
	void m1()
		{
			System.out.println(i);
			System.out.println(super.i);
		}

	}
package overriding;
class Car
{
	void Acc()
	{
		System.out.println("Car is Accelerated");
	}
}
public class Audi extends Car{
	void Acc(int n)
	{
		System.out.println("Car acclerated to"+n);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Audi a=new Audi();
		a.Acc();
		a.Acc(120);
				
	}

}

package objetclass;

public class BikeEngineClass {
	public static void main(String[] args)
	{
		Engine e1 = new Engine("MamB&W", "petrol", 10000);
		
		Bike bike1 = new Bike("BMW", 30000, e1);
		
		Bike bike2 = new Bike("BMW", 30000, e1);
		
		System.out.println(bike1.toString());
		System.out.println(bike2.toString());

	}

}

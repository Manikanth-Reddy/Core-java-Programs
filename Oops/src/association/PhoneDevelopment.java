package association;

import java.util.Scanner;

class Jio
{
	String simName;
	public Jio(String SimName)
	{
		this.simName=SimName;
	}
	public void callImplimentation()
	{
		System.out.println(simName+" can be used for calling and internet at a time ");
	}
}
class Airtel
{
	String simName;
	public Airtel(String simName)
	{
		this.simName=simName;
	}
	public void callImplimentation()
	{
		System.out.println(simName+" cannot be used for calling and internet at a time ");
	}
}
class Battery
{
	String battery;

	public Battery(String battery) {
		super();
		this.battery = battery;
	}
}
class Phone
{
	Jio jio;
	Airtel airtel;
	Battery battery;
	public Phone(Battery battery)
	{
		this.battery=battery;
	}
	public void call()
	{
	Scanner s=new Scanner(System.in);
	System.out.println("1.jio\n2.airtel");
	int choice=s.nextInt();
	if (choice==1)
	{
		jio=new Jio("JIO");
		jio.callImplimentation();
	}
	else if(choice==2)
	{
		airtel=new Airtel("AIRTEL");
		airtel.callImplimentation();
	}
	s.close();
}
}
public class PhoneDevelopment {

	public static void main(String[] args) {
		Phone p1=new Phone(new Battery("Li-Ion"));
		p1.call();
	}
}

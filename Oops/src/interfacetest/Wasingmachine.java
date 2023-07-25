package interfacetest;
class Washerman
{
	public void wash (Object obj) 
	{
		if(obj instanceof Washable)
			System.out.println("Use water with force to clean");
		else 
			System.out.println(obj.getClass()+" not washable ");
	}
}
class car implements Washable
{
	
}
class bike implements Washable
{
	
}
class truck implements Washable
{
	
}
class Tv 
{
	
}
interface Washable
{	
}
public class Wasingmachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Washerman wash=new Washerman();
		wash.wash(new car());
		wash.wash(new bike());
		wash.wash(new Tv());
	}

}

package programs;
import java.util.Scanner;
class NameOfDayInWeek
{
	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter week number  ");
		int d= s.nextInt();
		s.close();
		switch(d)
		{
			case 1 :System.out.println("Monday");
						break;
			case 2 :System.out.println("Tuesday");
						break;
			case 3 :System.out.println("Wednesday");
						break;
			case 4 :System.out.println("Thursday");
						break;
			case 5 :System.out.println("Friday");
						break;
			case 6 :System.out.println("Sturday");
						break;
			case 7 : System.out.println("Sunday");
						break;
		}
	}
}
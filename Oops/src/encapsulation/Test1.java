package encapsulation;
import java.util.Scanner;
class MovieHall
{
	private int seats=50;
	private static MovieHall ref;
	private MovieHall() {}
	public static  MovieHall getInstnce()
	{
		if(ref==null) ref=new MovieHall();
		return ref;
	}
	public void reserveSeats(int n)
	{
		System.out.println("Seats available ="+seats);
		if(n>seats) 
		{
			System.out.println("Seats are full ");
			return;
		}
		seats-=n;
		System.out.println(n+" seats are reserved");
	}	
}
class TicketBooking
{
	public static void bookTickets()
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter no of seats");
		int t =s.nextInt();
		MovieHall m=MovieHall.getInstnce();
		m.reserveSeats(t);
		s.close();
	}
}
public class Test1 {
	public static void main (String[] args)
	{
	TicketBooking.bookTickets();
	TicketBooking.bookTickets();
	TicketBooking.bookTickets();
	}
}

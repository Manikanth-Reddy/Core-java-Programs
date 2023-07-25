package basic;
import java.util.LinkedList;
import java.util.Queue;

public class QueueBasedOnLinkedList {
	public static void main(String[] args) {
		Queue<Integer> a = new LinkedList<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		System.out.println(a);
		while (!a.isEmpty())
			System.out.println(a.poll());
	}
}

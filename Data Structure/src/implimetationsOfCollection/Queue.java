package implimetationsOfCollection;

public class Queue {
	private Node first = null;
	private int count = 0;
	public void add(Object e) {
		if (first == null) {
			first = new Node(e, null);
			count++;
			return;
		}
		Node current = first;
		while (current.next != null) 	current = current.next;
		current.next = new Node(e, null);
		count++;
	}
	public int size() {
		return count;
	}
	public boolean isEmpty() {
		return first == null;
	}
	public Object peek() {
		if (first == null) return null;
		return first.ele;
	}
	public Object pool() {
		if (first == null)	return null;
		Object e = first.ele;
		first = first.next;
		count--;
		return e;
	}
}


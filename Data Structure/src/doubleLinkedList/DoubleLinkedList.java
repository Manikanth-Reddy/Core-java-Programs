package doubleLinkedList;
public class DoubleLinkedList {
	private Node first = null;
	private int count = 0;
	public void add(Object e) {
		if (first == null) {
			first = new Node(e, null, null);
			count++;
			return;
		}
		Node current = first;
		while (current.next != null) current = current.next;
		current.next = new Node(e, null, current);
		count++;
	}
	public Object get(int index) {
		if (index <= -1 || index >= size()) {
			throw new IndexOutOfBoundsException();
		}
		Node current = first;
		for (int i = 0; i < index; i++)current = current.next;
		return current.ele;
	}
	public int size() {
		return count;
	}
	public void add(int index, Object e) {
		if (index <= -1 || index >= size())
			throw new IndexOutOfBoundsException();
		if (index == 0) {
			first = new Node(e, first, null);
			count++;
			return;
		}
		Node current = first;
		for (int i = 1; i < index; i++)	current = current.next;
		Node n = new Node(e, current.next, current);
		current.next.previous = n;
		current.next = n;
		count++;
	}
}

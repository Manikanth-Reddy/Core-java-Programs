package setImplimentation;

public class HashSet {
	private Node [] a=new Node[10];
	private int count=0;
	public boolean add(Object key) {
		int index=hashCode()%10;
		if(a[index]==null) {
			a[index]=new Node(key,null);
			count++;
			return true;
		}
		Node current=a[index];
		Node previous=null;
		while(current!=null) {
			if(current.Key.equals(key)) return false;
			previous=current;
			current=current.next;
		}
		previous.next=new Node(key,null);
		count++;
		return true;
	}
	public int size() {
		return count;
	}
	public void display() {
		for(int i=0;i<a.length;i++) {
			Node current=a[i];
			while(current!=null) {
				System.out.print(current.Key+" ");
				current=current.next;
			}
		}
	}
}

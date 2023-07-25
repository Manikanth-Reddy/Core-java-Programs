package implimetationsOfCollection;
public class LinkedListWithoutLast {
	Node first=null;
	private int count=0;
	public void add(Object e) {
		if(first==null) {
			first=new Node(e,null);
			count++;
			return;
		}
		Node current=first;
		while(current.next!=null)	current=current.next;
		current.next=new Node(e,null);
		count++;
	}
	public void add(int index,Object e) {
		if(index<=-1||index>=size()) throw new IndexOutOfBoundsException();
		if(index==0) {
			first=new Node(e,first);
			count++;
			return;
		}
		Node current =first;
		for(int i=1;i<index;i++) current=current.next;
		current.next=new Node(e,current.next);
		count++;
	}
	public Object get(int index) {
		if(index<=-1|| index>=size()) {
			throw new IndexOutOfBoundsException();
		}
		Node current=first;
		for(int i=0;i<index;i++) current=current.next;
		return current.ele;
	}
	public int size() {
		return count;
	}
	public void remove(int index) {
		if(index <=-1 ||index>=size()) throw new ArrayIndexOutOfBoundsException();
		if(index==0) {
			first=first.next;
			count--;
			return;
		}
		Node Current=first;
		for(int i=1;i<index;i++) Current=Current.next;
		Current.next=Current.next.next;
		count--;
	}
	public void reverse() {
		Node previous=null;
		Node curent=first;
		Node next=null;
		while(curent!=null) {
			next=curent.next;
			curent.next=previous;
			previous=curent;
			curent=next;
		}
		first=previous;
	}
	 @Override
		public String toString() {
			 if(size()==0) return "[]";
			 String s="["+first.ele;
			 for(int i=1;i<size();i++) s+=","+get(i);
			 s=s+"]";
			return s;
		}
}

package implimetationsOfCollection;

public class LinkedListWithLast {
	private int count=0;
	private Node first=null;
	private Node last=first;
//	public void add(Object e) {
//		if(first==null) {
//			first=new Node(e,null);
//			count++;
//			return;
//		}
//		Node current=first;
//		while(current.next!=null) {
//			current=current.next;
//		}
//		current.next=new Node(e,null);
//		count++;
//		
//	}
	public void add (Object e) {
		if(first==null) {
			first=new Node(e,null);
			last=first;
			count++;
			return;
		}
		last.next=new Node(e,null);
		last=last.next;
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
		for(int i=0;i<index;i++) {
			current=current.next;
		}
		return current.ele;
	}
	public void remove(int index) {
		if(index <=-1 ||index>=size()) throw new ArrayIndexOutOfBoundsException();
		if(index==0) {
			  first=first.next;
			  count--;
			  Node current=first;
				for(int i=1;i<size()-1;i++) {
					current=current.next;
				}
			  last=current.next;
			  return;
		}
			Node Current=first;
			for(int i=1;i<index;i++)
			{
				Current=Current.next;
			}
			Current.next=Current.next.next;
			count--;
			Node cu=first;
			for(int i=1;i<size();i++) {
				cu=cu.next;
			}
		  last=cu;
			
	}
	 @Override
	public String toString() {
		 if(size()==0) return "[]";
		 String s="["+first.ele;
		 for(int i=1;i<size();i++) s+=","+get(i);
		 s=s+"]";
		 System.out.println(last.ele);
		return s;
	}
	public int size() {
		return count;
	}
}

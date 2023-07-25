package genericType;

public class Container <E>{
	private E obj;
	public void set (E obj) {
		this.obj=obj;
	}
	public E get() {
		return obj;
	}
	public static void main(String[] args) {
		Container<Integer> c=new Container<Integer>();
		c.set(10);
		c.set(20);
		c.set(30);
		System.out.println(c.get());
	}
}
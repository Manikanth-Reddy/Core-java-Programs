package basic;

class A {

}

class B {
	A a = new A();// aggr

	public B(A a) {
		super();
		this.a = a;
	}

}

public class Test {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		B b = new B(new A());// compos
		
	}

}

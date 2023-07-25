package implimetationsOfCollection;

public class ArrayList {
	private Object[] a = new Object[3];
	private int p = 0;
	public void add(Object e) {
		if (p >= a.length)
			Increase();
		a[p++] = e;
	}
	public void add(int index, Object e) {
		if (index <= -1 || index >= size())
			throw new ArrayIndexOutOfBoundsException();
		if (p >= a.length)
			Increase();
		for (int i = size() - 1; i >= index; i--) {
			a[i + 1] = a[i];
		}
		a[index] = e;
		p++;
	}
	public void remove(int index) {
		if (index <= -1 || index >= size())
			throw new ArrayIndexOutOfBoundsException();
		for (int i = index+1; i < size(); i++)
			a[i - 1] = a[i];
		p--;
		a[p] = null;
	}

	public void clear() {
		a = new Object[5];
		p = 0;
	}
	@Override
	public String toString() {
		if (size() == 0)
			return "[]";
		String s = "[" + a[0];
		for (int i = 1; i < size(); i++)
			s += "," + a[i];
		s += "]";
		return s;
	}
	
	private void Increase() {
		Object[] temp = new Object[a.length + 2];
		System.arraycopy(a, 0, temp, 0, a.length);
		a = temp;
	}
	public Object get(int index) {
		if (index <= -1 || index >= size())
			throw new IndexOutOfBoundsException();
		return a[index];
	}
	public int size() {
		return p;
	}
}

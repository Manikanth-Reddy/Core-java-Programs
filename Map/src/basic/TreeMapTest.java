package basic;

import java.util.*;

public class TreeMapTest {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		Map m = new TreeMap();
		m.put("java", 90);
		m.put("python", 76);
		m.put("C", 30);
		Set s = m.keySet();
		Iterator i = s.iterator();
		while (i.hasNext()) {
			Object k = i.next();
			Object v = m.get(k);
			System.out.println(k + "=" + v);
		}

	}
}

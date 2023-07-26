package basic;
import java.util.*;
public class CharacterPosition {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String s1 = s.next();
		LinkedHashMap<Character, String> m = new LinkedHashMap<Character, String>();
		for (int i = 0; i < s1.length(); i++) {
			char c = s1.charAt(i);
			if (!m.containsKey(c))
				m.put(c, i + "");
			else {
				String v = m.get(c);
				v += "," + i;
				m.put(c, v);
			}
		}
		Set<Character> s2 = m.keySet();
		Iterator<Character> i = s2.iterator();
		while (i.hasNext()) {
			Object k = i.next();
			Object v = m.get(k);
			System.out.println(k + "=" + v);
		}s.close();
	}
}

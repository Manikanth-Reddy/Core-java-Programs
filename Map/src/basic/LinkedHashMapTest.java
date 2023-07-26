package basic;
import java.util.LinkedHashMap;
import java.util.Map;
public class LinkedHashMapTest {
@SuppressWarnings({ "unchecked", "rawtypes" })
public static void main(String[] args) {
	Map m=new LinkedHashMap();
	System.out.println(m.put("a",10));
	System.out.println(m.put("b",20));
	System.out.println("size ="+m.size());
	System.out.println(m.get("a"));
	System.out.println(m.get("b"));
	System.out.println(m.containsKey("a"));
	m.clear();
}
}

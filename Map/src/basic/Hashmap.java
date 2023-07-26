package basic;
import java.util.*;
public class Hashmap {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		Map m=new HashMap();
		System.out.println(m.put("a",10));
		System.out.println(m.put("a",20));
		System.out.println("size ="+m.size());
		System.out.println(m.get("a"));
		System.out.println(m.containsKey("a"));
	}

}

package basic;

import java.util.*;

public class IdentityHashMapTest {
@SuppressWarnings({ "unchecked", "rawtypes" })
public static void main(String[] args) {
	String s=new String("java");
	String s1=new String("java");
	HashMap<String, Integer> m1=new HashMap();
	m1.put(s1, 50);
	IdentityHashMap<String, Integer> m2=new IdentityHashMap();
	m2.put(s1, 50);
	System.out.println(m2.get(s1)); //50
	System.out.println(m2.get(s));//null
}
}

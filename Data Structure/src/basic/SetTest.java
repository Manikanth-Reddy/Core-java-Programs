package basic;

import java.util.*;
public class SetTest {

	public static void main(String[] args) {
		SortedSet<Integer> s=new TreeSet<>();
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		s.add(70);
		s.add(60);
		s.add(50);
		System.out.println(s.first());
		System.out.println(s.last());
		SortedSet<Integer> s1=s.headSet(40);
		System.out.println(s1);
		SortedSet<Integer> s2=s.tailSet(40);
		System.out.println(s2);
		SortedSet<Integer> s3=s.subSet(20, 60);
		System.out.println(s3);
		
	}
}

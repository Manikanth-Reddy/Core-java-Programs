package compartor;

import java.util.Comparator;

public class MarksComparator implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {
		return ((Student)o1).marks-((Student)o2).marks;
	}

}

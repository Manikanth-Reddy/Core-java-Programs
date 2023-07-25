package compartor;

import java.util.Comparator;

public class LengthCompare implements Comparator<Object>{

	@Override
	public int compare(Object o1, Object o2) {
		return ((String)o1).length()-((String)o2).length();
	}

}

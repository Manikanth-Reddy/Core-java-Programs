package compartor;

import java.util.Arrays;

public class SortingBylength {

	public static void main(String[] args) {
		String []s= {"java","c","sql","python"};
		Arrays.sort(s,new LengthCompare());
		for(String n:s)System.out.println(n);
	}

}

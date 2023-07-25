package comparable;

import java.util.Arrays;

public class ComparingStudentNames {

	public static void main(String[] args) {
		Student[] a = new Student[5];
		a[0]=new Student("Mani", 30);
		a[1]=new Student("Potti", 20);
		a[2]=new Student("Dolly", 50);
		a[3]=new Student("Pinky", 40);
		a[4]=new Student("Siri", 50);
		a[0 ]=new Student("Navanitha",10);
		Arrays.sort(a);
		for(Student n:a) System.out.println(n);
	}


}

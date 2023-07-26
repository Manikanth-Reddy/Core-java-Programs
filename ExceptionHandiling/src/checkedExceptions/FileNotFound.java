package checkedExceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotFound {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		try {
			FileReader r=new FileReader("\"D:\\id card.pdf");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		

	}

}

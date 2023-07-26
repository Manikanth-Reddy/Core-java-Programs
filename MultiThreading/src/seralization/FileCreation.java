package seralization;

import java.io.File;
import java.io.IOException;

public class FileCreation {

	public static void main(String[] args) throws IOException {
		File f =new File("C:\\Users\\manik\\Desktop\\Manikanth\\java.txt");
//		f.mkdir();
		System.out.println(f.createNewFile());
	}

}

package fileHandiling;

import java.io.File;

public class FileCreation {

	public static void main(String[] args) throws Exception {
		File f = new File("C:\\Users\\manik\\Desktop\\Mani\\text.txt");
		f.createNewFile();
		System.out.println(f.canExecute());
		System.out.println(f.canWrite());
		System.out.println(f.canRead());
		
	}

}

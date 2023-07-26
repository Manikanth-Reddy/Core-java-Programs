package fileHandiling;

import java.io.File;
import java.io.IOException;

public class FileRename {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\manik\\Desktop\\Mani\\Java.txt");
		f.createNewFile();
		System.out.println(f.canExecute());
		System.out.println(f.canWrite());
		System.out.println(f.canRead());
		File f1=new File("C:\\Users\\manik\\Desktop\\Mani\\python.txt");
		f.renameTo(f1);

	}

}

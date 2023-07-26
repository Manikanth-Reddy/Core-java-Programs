package fileHandiling;

import java.io.File;
import java.io.IOException;

public class Filecreate {

	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\manik\\Desktop\\Manikanth\\java.txt");
//		f.mkdir();
		f.createNewFile();
		}

}

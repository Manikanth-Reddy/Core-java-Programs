package fileHandiling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

	public static void main(String[] args) throws IOException {
		FileWriter f=new FileWriter("C:\\Users\\manik\\Desktop\\Mani\\Java.txt");
		f.write("Manikanth Reddy ");
		f.close();
	}

}

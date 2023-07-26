package seralization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream f=new FileInputStream("C:\\Users\\manik\\Desktop\\Manikanth\\java.txt");
		ObjectInputStream o=new ObjectInputStream(f);
		Book b=(Book) o.readObject();
		System.out.println(b.name);
		System.out.println(b.pages);
		System.out.println("Deserialization.......");
	}

}

package seralization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

@SuppressWarnings("serial")
class Book implements Serializable {
	int pages;
	String name;
	public Book(int pages, String name) {
		super();
		this.pages = pages;
		this.name = name;
	}
	
}
public class Serialization {
	public static void main(String[] args) throws Exception {
		Book b=new Book(123,"hiii");
		FileOutputStream O=new FileOutputStream("C:\\Users\\manik\\Desktop\\Manikanth\\java.txt");
		try(ObjectOutputStream ou=new ObjectOutputStream(O)){
			ou.writeObject(b);
			System.out.println("Serialization ........");
		}
		
	}
}

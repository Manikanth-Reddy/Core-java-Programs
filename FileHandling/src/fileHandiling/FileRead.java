package fileHandiling;

import java.io.FileInputStream;

public class FileRead {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		FileInputStream f=new FileInputStream("D:\\Docs\\eclipse-workspace\\Oops\\src\\encapsulation\\Test1.java");
		int n=f.read();
		while(n!=-1){
			System.out.print((char)n);
			n=f.read();
		}
	}

}

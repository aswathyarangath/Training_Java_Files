package file;

import java.io.FileWriter;
import java.io.IOException;

public class TextFileWriting {
	public static void main(String[] args) throws IOException {
		FileWriter w=new FileWriter("E:abc.txt",true);
		w.write("\r\n");
		w.write("Hello world");
		w.write("\r\n");//write new line
		w.write("Good Bye");
		w.close();
		
	}

}

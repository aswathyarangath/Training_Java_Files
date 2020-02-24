package file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WritingTextBufferedReader {
	public static void main(String[] args) throws IOException {
		FileWriter w=new FileWriter("E:abc.txt",true);
		BufferedWriter br=new BufferedWriter(w);
		br.newLine();
		br.write("Hiiii");
		br.newLine();
		br.write("See you soon!!!!!");
		br.close();
		
	}

}

package file;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestReader {
	public static void main(String[] args) throws IOException {
	
			FileReader fr=new FileReader("E:abc.txt");
			int c;
			while((c=fr.read())!=-1){
				System.out.print((char)c);
			}
			fr.close();
		
	}
}

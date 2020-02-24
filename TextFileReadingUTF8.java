package file;

import java.io.FileInputStream;

import java.io.IOException;
import java.io.InputStreamReader;


public class TextFileReadingUTF8 {
	public static void main(String[] args) throws IOException {
		FileInputStream is=new FileInputStream("E:abc.txt");
		InputStreamReader reader=new InputStreamReader(is,"UTF-8");
		int ch;
		while((ch=reader.read())!=-1){
			System.out.println((char) ch);
		}
		reader.close();
	}

}

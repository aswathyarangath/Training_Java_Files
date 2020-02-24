package file;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;

public class ReadingUsingBufferedReader {
	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("E:abc.txt");
		BufferedReader br=new BufferedReader(fr);
		String str;
		while((str=br.readLine())!=null){
			System.out.println(str);
		}
	}
}

package file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestSerializeLaptop {
	static void serialize(Laptop l){
	
	try{
			FileOutputStream fos=new FileOutputStream("E:Laptop.txt");
			ObjectOutputStream os=new ObjectOutputStream(fos);
			os.writeObject(l);
			os.close();
	}
	catch(IOException e){
		e.printStackTrace();
		
	}
			
			
	
		}
	static Laptop deserialize() throws ClassNotFoundException{
		Laptop l1=null;
		try{
		FileInputStream fis=new FileInputStream("E:Laptop.txt");
	
	ObjectInputStream is=new ObjectInputStream(fis);
		l1=(Laptop) is.readObject();
		is.close();
	
		}
		catch(IOException e){
			System.out.println(e);
		}
		return l1;
	}
		
public static void main(String[] args) throws IOException, ClassNotFoundException {
	Laptop l=new Laptop("HP",1,32);
	serialize(l);
	System.out.println("Object serialized");
	Laptop l1=deserialize();
	System.out.println(l1);
}
}


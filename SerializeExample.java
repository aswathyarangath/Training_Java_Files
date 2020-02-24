package file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class SerializeExample {
	static void serialize(User user){
		try{
		FileOutputStream fos=new FileOutputStream("E:User.txt");
		ObjectOutputStream os=new ObjectOutputStream(fos);
		os.writeObject(user);
		os.close();
		}
		catch(IOException e){
			System.out.println(e);
		}
	}
	static User deserialize() throws ClassNotFoundException{
		User saveduser=null;
		try{
		FileInputStream fis=new FileInputStream("E:User.txt");
		ObjectInputStream is=new ObjectInputStream(fis);
		saveduser=(User) is.readObject();
		is.close();
	
		}
		catch(IOException e){
			System.out.println(e);
		}
		return saveduser;
	}
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Date ob=new Date();
		User newuser=new User("Anu","anu@gmail.com","swae123",ob,23);
		serialize(newuser);
		System.out.println("Object serialized");
		User saveduser=deserialize();
		System.out.println(saveduser);
		
	}

}

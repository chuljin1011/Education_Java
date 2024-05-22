package xyz.itwill.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Date;
import java.util.List;

public class ObjectInputStreamApp {
	public static void main(String[] args) throws IOException, ClassNotFoundException {

		ObjectInputStream in = new ObjectInputStream(new FileInputStream("c:/data/object.txt"));

		String object1 = (String)in.readObject();
		Date object2 = (Date)in.readObject();
		List<String> object3 = (List<String>)in.readObject();

		System.out.println(object1);
		System.out.println(object2);
		System.out.println(object3);
		
		in.close();
		
	}

}

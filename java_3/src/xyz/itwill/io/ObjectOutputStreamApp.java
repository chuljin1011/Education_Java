package xyz.itwill.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;
import java.util.List;

public class ObjectOutputStreamApp {
	public static void main(String[] args) throws IOException {
		
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("c:/data/object.txt"));
		
		out.writeObject("홍길동");				
		out.writeObject(new Date());
		out.writeObject(List.of("임꺽정", "전우치", "일지매"));
		
		
		out.close();
		
		System.out.println("확인해");
		
		
				
				
	}

	
	
}

package xyz.itwill.io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileWriterApp {
	
	public static void main(String[] args) throws IOException {
		
		System.out.println("입력해주세요");
		
		InputStreamReader in = new InputStreamReader(System.in);
		
		FileWriter out = new FileWriter("c:/data/character.txt",true);
		
		int readByte;
		while(true) {
			readByte=in.read();
			if(readByte == -1) break;
			out.write(readByte);
		}
		
		
		out.close();
		
		System.out.println("[결과] c:/data/character.txt 파일을 확인해보세요. ");
		 
	}

}

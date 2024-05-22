package xyz.itwill.io;

import java.io.FileOutputStream;
import java.io.IOException;

// 키보드로 원시데이터를 입력받아 파일에 전달하여 저장하는 프로그램
// EOF 신호(Ctrl  +z - 입력) 시 종료
public class FileOutputStreamApp {
	public static void main(String[] args) throws IOException {
		System.out.println("[메세지] 키보드를 눌러 값을 입력해 주세요.");
		
		FileOutputStream out = new FileOutputStream("c:/data/byte.txt", true);
		
		int readByte;
		while(true) {
			readByte=System.in.read();
			
			if(readByte == -1) break;
			
			out.write(readByte);
			
		}
		
		out.close();
		
		System.out.println("[결과]c:\\data\\byte.txt 파일을 확인해보세요.");
	}
}

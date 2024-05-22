package xyz.itwill.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopyCharApp {
	public static void main(String[] args) throws IOException {
		BufferedReader in = null;
		
		try {
			in = new BufferedReader(new FileReader("c:/data/bandizip.exe"));
		} catch (FileNotFoundException e) {
			System.out.println("[에러]c:/data/bandizip.exe 파일을 찾을 수 없습니다.");
			System.exit(0);
		}
		
		BufferedWriter out = new BufferedWriter(new FileWriter("c:/data/bandizip_byte.exe"));
		
		int readByte;
		while (true) {
			readByte = in.read();
			if (readByte == -1)
				break;
			out.write(readByte);
		}


		in.close();
		out.close();

		System.out.println("[메세지]c:/data/bandizip_byte.exe로 file이 복사되었습니다..");
		
	}
}

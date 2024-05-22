package xyz.itwill.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// (c:/data/bandizip.exe) (c:/data/bandizip_byte.exe)
public class FileCopyByteApp {
	public static void main(String[] args) throws IOException {

		BufferedInputStream in = null;

		try {
			in = new  BufferedInputStream(new FileInputStream("c:/data/bandizip.exe"));
		} catch (FileNotFoundException e) {
			System.out.println("[에러]c:/data/bandizip.exe 파일을 찾을 수 없습니다.");
			System.exit(0);
		}

		BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("c:/data/bandizip_byte.exe"));

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

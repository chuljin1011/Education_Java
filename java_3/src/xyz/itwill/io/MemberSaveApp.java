package xyz.itwill.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

//회원정를 파일에 전달하여 저장하는 프로그램 작성
public class MemberSaveApp {
	public static void main(String[] args) throws IOException {
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("c:/data/member.txt"));
		
		out.writeObject(new Member("abc123", "홍길동", "abc@itwill.xyz"));		
		out.writeObject(new Member("opq456", "임꺽정", "opq@itwill.xyz"));		
		out.writeObject(new Member("xyz789", "전우치", "xyz@itwill.xyz"));		
		
		out.close();
		
		
		System.out.println("c:\\data\\member.txt 파일에 회원정보를 저장 하였습니다.");
		
		
		
		
	}

}

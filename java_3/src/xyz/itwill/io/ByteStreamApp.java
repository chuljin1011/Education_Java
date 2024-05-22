package xyz.itwill.io;

import java.io.IOException;

//java.io 패키지 : 입력 스트림과 출력스트림을 생성할 수 있는 Java 자료형이 선언된 패키지

//스트림(Stream) : 값을 전달하기 위한 목적으로 선언된 입력클래스 또는 출력클래스로 생성된 객체
// => 시냇물이 흐르는 모양을 모델링 하여 만들어진 클래스로 한쪽방향으로 순차적으로 전달되도록 처리

//원시데이타 기반 스트림(Byte Stream) : 가공하지 않은 순수한 값(원시데이타)를 전달하기 위한
//입력클래스 또는 출력클래스로 생성된 스트림(객체)
// => 전달값을 1Byte 단위로 입력 또는 출력하기 위한 스트림
// => InputStream 추상클래스와 OutputStream 추상클래스를 기반으로 선언된 클래스


//키보드로 입력받은 원시데이타(1Byte)를 모니터로 전달하여 출력하는 프로그램 작성
// => EOF(End Of File) 신호(Ctrl+Z - 입력 종료)를 받기 전까지 반복 처리
public class ByteStreamApp {
	public static void main(String[] args) throws IOException {
		System.out.println("[메세지]키보드를 눌러 문자값을 입력해 주세요.");

		int readByte;
		
		while(true) {

			readByte=System.in.read();
			

			if(readByte == -1) break;
			

			System.out.write(readByte);
//			System.out.println("1byte");
		}
		
		System.out.println("[메세지]프로그램을 종료합니다.");
	}
}
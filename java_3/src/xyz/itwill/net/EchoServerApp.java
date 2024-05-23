package xyz.itwill.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServerApp {
	public static void main(String[] args) {

		ServerSocket echoServer = null;

		try {
			echoServer = new ServerSocket(3000);
			System.out.println("[메세지] Echo Server Running... ");

			while (true) {
				Socket socket = echoServer.accept();
				
				BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

				System.out.println("[" + socket.getInetAddress().getHostAddress()
						+"]님이 보내온 메세지 = " + in.readLine());
				
				socket.close();
			}

		} catch (IOException e) {
			System.out.println("[에러] 서버 네트워크에 문제가 발생하였습니다.");
		} finally {
			try {
				// ServerSocket.close() : ServerSocket 객체를 제거하는 메소드 - 서버 종료
				// => 접속중인 모든 클라이언트와의 접속 해제
				echoServer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}

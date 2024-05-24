package xyz.itwill.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class EchoClientApp {
	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("전달 메세지 입력 >>");

		String message = in.readLine();

		try {
			Socket socket = new Socket("192.168.13.16", 3000);
//
//			BufferedWriter out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
//
//			out.write(message);
//			out.flush();
			
			PrintWriter out = new PrintWriter(socket.getOutputStream());
			out.println(message);
			out.flush();

			socket.close();
		} catch (UnknownHostException e) {
			System.out.println("[에러]서버를 찾을 수 없습니다.");
		} catch (IOException e) {
			System.out.println("[에러]서버에 접속 할 수 없습니다.");
		}
	}
}
package xyz.itwill.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class MessagwSendApp {

	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("전달 메세지 입력 >> ");
		
		String message = in.readLine();
		
		DatagramSocket datagramSocket = new DatagramSocket();
		
		InetAddress inetAddress = InetAddress.getByName("192.168.13.16");
		
		byte[] data = message.getBytes();
		
		DatagramPacket datagramPacket = new DatagramPacket(data, data.length, inetAddress, 4000);
		
		datagramSocket.send(datagramPacket);
		
		datagramSocket.close();
		
		System.out.println("[메세지] 연결된 컴퓨터로 메세지를 보냈습니다.");
		
	}

}

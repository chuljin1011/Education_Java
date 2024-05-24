package xyz.itwill.net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class MessageReceiveApp {
	public static void main(String[] args) throws IOException {

		DatagramSocket datagramSocket = new DatagramSocket(4000);

		byte[] data = new byte[1024];

		DatagramPacket datagramPacket = new DatagramPacket(data, data.length);

		datagramSocket.receive(datagramPacket);

		String message = new String(data);

		System.out.println("[결과] 보내온 메세지 = " + message);

		datagramSocket.close();

	}

}

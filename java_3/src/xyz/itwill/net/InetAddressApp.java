package xyz.itwill.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressApp {

	public static void main(String[] args) throws UnknownHostException {

		InetAddress myComputer = InetAddress.getLocalHost();

		System.out.println(myComputer.getHostName());
		System.out.println(myComputer.getHostAddress());

		System.out.println("=====================================");

		InetAddress itwill = InetAddress.getByName("www.itwill.xyz");
		System.out.println(itwill.getHostAddress());

		InetAddress[] naver = InetAddress.getAllByName("www.naver.com");

		for (InetAddress address : naver) {
			System.out.println(address.getHostAddress());
		}
		System.out.println("======================================");
	}
}

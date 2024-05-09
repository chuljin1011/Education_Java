package xyz.itwill.app;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class ClacAgeApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("이름을 입력하세요");
		String name = sc.nextLine();
		System.out.println("출생연도를 입력하세요");
		int birt = sc.nextInt();

		Date now = new Date();
		
		@SuppressWarnings( "deprecation")
		int currentYear = now.getYear() + 1900;
		int age = currentYear - birt;
		
//		System.out.println(Calendar.YEAR + " , " + now.getYear());
		System.out.println("[결과]" + name + " 님의 나이는 " + age + "살 입니다.");

	}

}

package xyz.itwill.util;

import java.util.Date;

public class DateApp {
	public static void main(String[] args) {

		Date now = new Date();

		System.out.println("현재 날짜와 시간 =" + now);

		System.out.println("현재 날짜와 시간 = " + now.toLocaleString());

		String[] day = { "일", "월", "화", "수", "목", "금", "토" };

		String printDate = (now.getYear() + 1900) + "년" + (now.getMonth() + 1) + "월" + now.getDate() + "일"
				+ day[now.getDay()] + "요일";

		System.out.println("현재 날짜 = " + printDate);

		long currentTime = now.getTime();
		
		Date wantDate = new Date(100, 0, 1);
		long wantTime = wantDate.getTime();
		
		System.out.println("연산결과(일)" + ((currentTime-wantTime)/(1000*86400)));
		
		

	}
}

package xyz.itwill.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatApp {

	public static void main(String[] args) {
		
		Date now = new Date();
		
//		System.out.println(now);
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 hh시 mm분 ss초 ");
//		System.out.println(dateFormat);0000000000000
		
		String printDate = dateFormat.format(now);
		
		
		System.out.println(printDate);
		
		dateFormat.applyPattern("yyyy-MM-dd HH:mm:ss");
		System.out.println(dateFormat.format(now));
		
		
		String wantStr = "2000-01-01 00:00:00";
		try {
			Date wantDate = dateFormat.parse(wantStr);
			System.out.println(wantDate);
		} catch (ParseException e) {
			System.out.println("[에러] 형식에 맞지 않는 날짜와 시간을 입력해 주세요");
		
		}
		
	}
}

package xyz.itwill.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class DayCalculateApp {
	public static void main(String[] args) {
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		
		Scanner scanner = new Scanner(System.in);
		String dateIn = scanner.nextLine();
		try {
			Date wantData = dateFormat.parse(dateIn);
			System.out.println(wantData);
		} catch (ParseException e) {
			System.out.println("잘못된 값을 입력하였습니다.");
			
		}
		
		
		
//		Date now = new Date();
//		String printDate = dateFormat.format(now);
//		System.out.println(dateFormat.format(now));
		
		

//		Scanner scanner = new Scanner(System.in);
		
//		System.out.println("현재 날짜 = " + printDate);
//		long currentTime = now.getTime();
//		Date wantDate = new Date(100, 0, 1);
//		long wantTime = wantDate.getTime();
//		System.out.println("연산결과(일)" + ((currentTime-wantTime)/(1000*86400)));
//
//		
		
		
		
	}
}
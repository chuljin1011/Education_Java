package xyz.itwill.util;

import java.util.Calendar;

public class CalendarApp {

	public static void main(String[] args) {

		String[] day = { "일", "월", "화", "수", "목", "금", "토" };
		
		Calendar calendar = Calendar.getInstance();
		
		System.out.println(calendar);
		
		String printDate = calendar.get(calendar.YEAR)+"년 "+(calendar.get(Calendar.MONTH)+1) + "월 " + calendar.get(Calendar.DATE) + "일 " + day[calendar.get(Calendar.DAY_OF_WEEK)-1]+"요일";
		System.out.println(printDate);

	}

}

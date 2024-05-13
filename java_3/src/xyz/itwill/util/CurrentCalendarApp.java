package xyz.itwill.util;

import java.util.Calendar;

public class CurrentCalendarApp {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();

//		System.out.println(calendar);


		calendar.set(Calendar.DATE, 1);

		
		System.out.println("================================");

		int week = calendar.get(Calendar.DAY_OF_WEEK);
		
		System.out.println("================================");
		System.out.println(week);
		System.out.println("================================");

		System.out.println("           " + calendar.get(Calendar.YEAR) + "년 " + (calendar.get(Calendar.MONTH) + 1) + "월");
		System.out.println("================================");

		System.out.println("  일  월  화  수  목  금  토");
		System.out.println("================================");

		for (int i = 0; i < week; i++) {
			{
				System.out.print("   ");
			}

		}

		for (int i = 1; i <= 31; i++) {
			if (i <= 9) {
				System.out.print("   " + i);
			} else {
				System.out.print("  " + i);
			}
			
			week++;
			
			if(week % 7 == 1) {
				System.out.println();
			}
			
		}

	}

}

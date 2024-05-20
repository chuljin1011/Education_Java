package xyz.itwill.util;

import java.util.Calendar;
import java.util.Iterator;
import java.util.Scanner;

public class ExampleCal {
	public static void main(String[] args) {

		int year;
		int month;

		Scanner scanner1 = new Scanner(System.in);
		System.out.print("[입력] 년 >>");
		year = scanner1.nextInt();

		Scanner scanner2 = new Scanner(System.in);
		System.out.print("[입력] 월 >>");
		month = scanner2.nextInt();

		Calendar calendar = Calendar.getInstance();

		calendar.set(year, month - 1, 1);

		int week = calendar.get(Calendar.DAY_OF_WEEK);

		System.out.println("          " + year + "년 " + month + "월");
		System.out.println("===================================");
		System.out.println("  일  월  화  수  목  금  토");
		System.out.println("===================================");

		for (int i = 1; i < week; i++) {
			System.out.print("    ");
		}
		
		for (int i = 1; i < calendar.getActualMaximum(Calendar.DATE); i++) {
			if(i <= 9) {
				System.out.print("   " + i);
			} else {
				System.out.print("  " + i);
			}
			week ++;
			
			if(week % 7 == 1) {
				System.out.println();
			}
			
		}

	}

}

package xyz.itwill.util;

import java.util.Calendar;
import java.util.Scanner;

public class WantCalendarApp {
	public static void main(String[] args) {

		int year;
		int month;

		Scanner scanner1 = new Scanner(System.in);
		while (true) {
			System.out.print("[입력] 년 >>");
			year = scanner1.nextInt();
			if (year > 1900) {
				break;
			} else {
				System.out.println("[에러] 올바른 값이 아닙니다.");
			}

		}
		Scanner scanner2 = new Scanner(System.in);
		while (true) {
			System.out.print("[입력] 월 >>");
			month = (scanner2.nextInt() - 1);
			if (month > 0 && month <= 12) {
				break;
			} else {
				System.out.println("[에러] 올바른 값이 아닙니다.");
			}

		}

		Calendar calendar = Calendar.getInstance();

		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.MONTH, month);
		calendar.set(Calendar.DATE, 1);

		int week = calendar.get(Calendar.DAY_OF_WEEK);

		System.out.println();
		System.out
				.println("           " + calendar.get(Calendar.YEAR) + "년 " + (calendar.get(Calendar.MONTH) + 1) + "월");
		System.out.println("================================");

		System.out.println("  일  월  화  수  목  금  토");
		System.out.println("================================");

		for (int i = 1; i < week; i++) {
			{
				System.out.print("    ");
			}

		}

		for (int i = 1; i <= 31; i++) {
			if (i <= 9) {
				System.out.print("   "+i);
			} else {
				System.out.print("  "+i);
			}

			week++;

			if (week % 7 == 1) {
				System.out.println();
			}
		}
		scanner1.close();
		scanner2.close();

	}

}

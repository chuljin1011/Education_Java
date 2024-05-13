package xyz.itwill.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DayCalculateApp {
	public static void main(String[] args) {

		Date now = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

		Scanner scanner = new Scanner(System.in);
		System.out.println("출생일 ex) 1994-10-11 >> ");
		String dateIn = scanner.nextLine();

		try {
			Date date = dateFormat.parse(dateIn);
			long wantTime = date.getTime();
			long currentTime = now.getTime();
			System.out.println("연산결과(일)" + ((currentTime - wantTime) / (1000 * 86400)));

		} catch (ParseException e) {
			System.out.println("올바른 날짜 형식이 아닙니다.");
		}

		scanner.close();
 
	}
}
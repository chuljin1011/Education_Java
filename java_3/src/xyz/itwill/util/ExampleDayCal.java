package xyz.itwill.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ExampleDayCal {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

		Date birthday = null;

		System.out.print("생년월일 입력 [ex. 2000-01-01] >>  ");

		try {
			birthday = dateFormat.parse(scanner.nextLine());
		} catch (ParseException e) {
			System.out.println("[에러] 생년월일을 형식에 맞게 입력해 주세요.");
			System.exit(0);
		} finally {
			scanner.close();
		}

		long day = (System.currentTimeMillis() - birthday.getTime()) / (1000*60*60*24);
		System.out.println("[결과] 태어난지 " + day + "일 지났습니다.");

	}

}

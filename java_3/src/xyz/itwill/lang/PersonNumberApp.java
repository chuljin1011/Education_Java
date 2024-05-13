package xyz.itwill.lang;

import java.util.Scanner;

public class PersonNumberApp {

	// 000101-4567890

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String number; // 주빈번호 입력
		while (true) {
			System.out.print("주민번호[ex.901125-123456789] >> ");
			number = scanner.nextLine().trim();

//			if(number.length() == 14 && number.charAt(6) == '-') break;
			if (number.length() == 14 && number.indexOf('-') == 6)
				break;

			System.out.println("[에러] 형식에 맞게 주민번호를 다시 입력 해주세요.");

		}
		scanner.close();

		String separation = number.substring(7, 8);

		String birthday = "";

		if (separation.equals("1") || separation.equals("2")) { // 20세기에 태어난 경우
			birthday += "19";
		} else if (separation.equals("3") || separation.equals("4")) { // 2000년도
			birthday += "20";
		}

		birthday += number.substring(0, 2) + "년 ";
		birthday += number.substring(2, 4) + "월 ";
		birthday += number.substring(4, 6) + "일 ";


		String gender = "";

		if (separation.equals("1") || separation.equals("2")) { 
			gender += "남자";
		} else if (separation.equals("3") || separation.equals("4")) { 
			gender += "여자";
		}
		
		System.out.println("[결과]생년월일 = " + birthday + ", 성별 = " + gender );
		

	}

}

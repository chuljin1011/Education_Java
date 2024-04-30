package basic;

import java.util.Scanner;

public class InputCheckApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		/*
		 * System.out.print("점수 입력[0~100] >>"); int score = scanner.nextInt();
		 */

		int score;

//		do {
//			System.out.print("점수 입력[0~100] >>");
//			score = scanner.nextInt();
//			if (score < 0 || score > 100) {
//				System.out.println("[에러] 비정상적인 값이 입력 되었습니다.");
//			}
//		} while (score < 0 || score > 100);

		while (true) {
			System.out.print("점수 입력[0~100] >>");
			score = scanner.nextInt();
			if (score >= 0 && score <= 100) break;
			System.out.println("[에러] 비정상적인 값이 입력 되었습니다.");
		}

		String grade = "";
		switch (score / 10) {
		case 10:
		case 9:
			grade = "A";
			break;
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		case 6:
			grade = "D";
			break;
		default:
			grade = "F";
			break;

		}

		System.out.println("[결과]" + score + "점 = " + grade + "학점");

		scanner.close();
	}

}

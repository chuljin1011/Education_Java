package xyz.itwill.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PassWordMatchApp {
	public static void main(String[] args) {
		int password = 123456;

//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.print("비밀번호 입력 >> ");
//		int number = scanner.nextInt();
//		
//		if (number == password) {
//			System.out.println("[결과] 키보드로 입력한 비밀번호가 맞습니다.");
//		} else {
//			System.out.println("[결과] 키보드로 입력한 비밀번호가 틀립니다.");
//		}
//		scanner.close();

		Scanner scanner = new Scanner(System.in);

		try {

			System.out.print("비밀번호 입력 >> ");
			int number = scanner.nextInt();

			if (number != password) {
				throw new PasswordMismatchException("[결과] 키보드로 입력된 비밀번호가 틀립니다. ");

			}

			System.out.println("[결과] 키보드로 입력한 비밀번호가 맞습니다.");

		} catch (InputMismatchException e) {
			System.out.println("[에러] 숫자만 입력 가능합니다.");

		} catch (PasswordMismatchException e) {
			System.out.println(e.getMessage());

		} catch (Exception e) {
			System.out.println("[에러] 프로그램 실행에 예기치 못한 오류가 발생 되었습니다.");

		} finally {
			scanner.close();
		}

	}

}

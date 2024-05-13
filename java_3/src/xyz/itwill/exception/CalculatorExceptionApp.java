package xyz.itwill.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorExceptionApp {
//	public CalculatorExceptionApp() throws InputMismatchException, ArithmeticException {
		public CalculatorExceptionApp()  {  
		Scanner scanner = new Scanner(System.in);

		System.out.print("첫번째 정수값 입력 >> ");
		int num1 = scanner.nextInt();

		System.out.print("두번째 정수값 입력 >> ");
		int num2 = scanner.nextInt();

		System.out.println("[결과]" + num1 + " / " + num2 + " = " + (num1 / num2));
		
		scanner.close();
	}

	public static void main(String[] args) {
		try {
			new CalculatorExceptionApp();
		} catch (InputMismatchException e) {
			System.out.println("[에러] 형식에 맞는 값을 입력해 주세요.");
		} catch (ArithmeticException e) {
			System.out.println("[에러] 0으로 나눌 수 없습니다.");
		} catch (Exception e) { // 모든 예외
			System.out.println("[에러] 모든 에러");
		}

	}

}

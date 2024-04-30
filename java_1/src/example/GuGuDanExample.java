package example;

import java.util.Scanner;

// 입력은 2~9

public class GuGuDanExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int input1 = 0;
		int input2 = 0;

		while (true) {
			System.out.println("첫번째 값 입력 [정수 2~9] : ");
			input1 = scanner.nextInt();
			if (input1 < 2 || input1 > 9) {
				System.out.println("[에러1] 잘못된 값이 입력 되었습니다.");
			} else
				break;
		}
		while (true) {
				System.out.println("두번째 값 입력 [정수 2~9] : ");
				input2 = scanner.nextInt();
				if (input2 < 2 || input2 > 9) {
				System.out.println("[에러2] 잘못된 값이 입력 되었습니다.");
			} else
				break;
		}
		System.out.println();
		System.out.println(input1 + " 과 " + input2 + "를 곱한 값은 "+ (input1 * input2) + "입니다.");
		
		System.out.println();
		System.out.println("프로그램 종료");

	}

}

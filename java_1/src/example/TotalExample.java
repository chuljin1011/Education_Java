package example;

import java.util.Scanner;

//키보드로 정수값을 계속 입력받아 합계를 계산하여 출력하는 프로그램을 작성하세요.
//단, 입력된 정수값이 0인 경우 입력을 종료하고 합계 출력
//ex) 정수값 입력[0:종료] >> 10
//    정수값 입력[0:종료] >> 20
//    정수값 입력[0:종료] >> 30
//    정수값 입력[0:종료] >> 0
//    [결과]합계 = 60
public class TotalExample {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int input1 = 0;
		int sum = 0;

		while (true) {
			System.out.println("정수 입력 : ");
			input1 = scanner.nextInt();
			if (input1 != 0) {
				sum += input1;
				System.out.println(" 더하기 " + input1 +" 의 합계 " + sum);
			} else
				break;

		}
		System.out.println();
		System.out.println("프로그램 종료");
	}
}

package xyz.itwill.lang;

import java.util.Scanner;

public class SystemApp {

	public static void main(String[] args) {
		// System.in : 표준 입력장치(키보드)에 대한 입력 스트림 (inputStrea 객체)가 저장된 정적 필드
		Scanner scanner = new Scanner(System.in);

		System.out.print("정수값 입력 >> ");
		int num = scanner.nextInt();

		if (num == 0) {
			System.out.println("[메세지] 프로그램을 종료합니다.");
			System.exit(0); // 프로그램의 모든 스레드를 소멸시켜 프로그램을 종료
		}

		System.gc();

		long startTime = System.currentTimeMillis();

		for (int i = 0; i < num; i++) {
			System.out.println(i + "번째 실행되는 명령");
		}
		
		long endTime = System.currentTimeMillis();
		
		System.out.println("반복문 실행 시간 = " + (endTime - startTime) + "ms");

	}

}

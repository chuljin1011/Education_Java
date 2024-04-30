package basic;

import java.util.Scanner;

public class NumberTotalApp {
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		int total = 0;
		
		for (int i = 0; i < 5; i++) {
	System.out.print(i + "번째 정수값 입력 >> : ");
		int number = scanner.nextInt();
		total += number;
		
		}
		System.out.println("결과) 합계 = " + total);
	}

}

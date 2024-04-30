package example;

import java.util.Scanner;

public class UpAndDown2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int dap = (int) (Math.random() * 100) + 1;
		
		boolean result = false;

		for (int i = 1; i <= 10; i++) {
			int input;
			while (true) {
				System.out.println(i + "번째 정수값 입력 [ 1~100 ] >> ");
				input = scanner.nextInt();
				if (input >= 1 && input <= 100)
					break;
				System.out.println("[에러] 1~100 범위의 정수값만 입력 가능합니다.");

			}

			if (dap == input) {
				System.out.println("[메세지] 축하합니다. " + i + "번째 만에 정답을 맞췄습니다.");
				result = true;
				break;
			} else if(dap > input) {
				System.out.println("[결과] " +  input +  "보다 큰값을 입력하세요");
			} else {
				System.out.println("[결과] " +  input +  "보다 작은값을 입력하세요");
			}
		}
		
		if (!result)
		System.err.println("[결과] 정답을 맞추지 못했군요. 정답은 ["+ dap + "] 입니다.");
		
		scanner.close();

	}
}

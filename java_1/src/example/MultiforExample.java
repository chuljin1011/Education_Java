package example;

public class MultiforExample {
	public static void main(String[] args) {
		// ★★★★★
		// ☆★★★★
		// ☆☆★★★
		// ☆☆☆★★
		// ☆☆☆☆★

		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("☆");
			}
			for (int j = 0; j < 5 - i; j++) {
				System.out.print("★");
			}
			System.out.println();
		}

		System.out.println("===============================================================");
		// ☆☆☆☆★
		// ☆☆☆★★★
		// ☆☆★★★★★
		// ☆★★★★★★★
		// ★★★★★★★★★

		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j < 5 - i; j++) {
				System.out.print("☆");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("★");
			}
			for (int j = 1; j < i; j++) {
				System.out.print("★");
			}
			System.out.println();
		}

		System.out.println("===============================================================");
		// ★☆☆☆★
		// ☆★☆★☆
		// ☆☆★☆☆
		// ☆★☆★☆
		// ★☆☆☆★

		int s1 = 1;
		int s2 = 5;

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (j == s1 || j == s2) {
					System.out.print("★");
				} else {
					System.out.print("☆");
				}
			}
			System.out.println();
			s1++;
			s2--;
		}

		System.out.println("===============================================================");

		int n = 31;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j == i || j == n - i - 1 || i == (n / 2) || j == (n / 2) || j == (n / 2) || j == (n / 2 - i)
						|| j == (n / 2 + i) || j == -(n / 2) + i || j == n + (n / 2) - i - 1) {
					System.out.print("★");
				} else {
					System.out.print("☆");
				}
			}
			System.out.println(); // 다음 줄로 이동
		}

		System.out.println(); // 다음 줄로 이동
		System.out.println("===============================================================");
		System.out.println(); // 다음 줄로 이동

		int n1 = 31;

		for (int i = 0; i < n1; i++) {
			for (int j = 0; j < n1; j++) {
				if (j == -(n1 / 2) + i || j == n1 + (n1 / 2) - i - 1 || j == 0 && i <= (n1 / 2) && i >= (n1 / 4)
						|| j == n1 - 1 && i <= (n1 / 2) && i >= (n1 / 4) || i <= (n1 / 4) && j == (n1 / 4) - i
						|| i <= (n1 / 4) && j == (n1 / 4) + i + 1 || i <= (n1 / 4) && j == (n1 / 4) + (n1 / 2) - i
						|| i <= (n1 / 4) && j == (n1 / 4) + (n1 / 2) + i + 1) {
					System.out.print("♥");
				} else {
					System.out.print("♡");
				}
			}
		}
			System.out.println(); // 다음 줄로 이동
			System.out.println(); // 다음 줄로 이동
			System.out.println("===============================================================");
			System.out.println(); // 다음 줄로 이동
			for (int i = 0; i < n1; i++) {
				for (int j = 0; j < n1; j++) {
					if (j == -(n1 / 2) + i || j == n1 + (n1 / 2) - i - 1 || j == 0 && i <= (n1 / 2) && i >= (n1 / 4)
							|| j == n1 - 1 && i <= (n1 / 2) && i >= (n1 / 4) || i <= (n1 / 4) && j == (n1 / 4) - i
							|| i <= (n1 / 4) && j == (n1 / 4) + i + 1 || i <= (n1 / 4) && j == (n1 / 4) + (n1 / 2) - i
							|| i <= (n1 / 4) && j == (n1 / 4) + (n1 / 2) + i + 1) {
						System.out.print("♥");
					} else {
						System.out.print("♡");
					}
				}
				System.out.println(); // 다음 줄로 이동
		}
	}
	
}

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
				if(j == s1 || j == s2) {
					System.out.print("★");
				}
				else {
					System.out.print("☆");
				}								
			}
			System.out.println();
			s1++;
			s2--;
		}
		

		System.out.println("===============================================================");
	}
}
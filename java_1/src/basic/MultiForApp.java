package basic;

public class MultiForApp {
	public static void main(String[] args) {

		int count = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {

				count++;

			}

		}

		System.out.println(count);  
		System.out.println("=========================================");

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		System.out.println("=========================================");
		
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 8; j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		System.out.println("=========================================");
	}
}



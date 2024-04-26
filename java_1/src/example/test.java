package example;

public class test {
	public static void main(String[] args) {
//			System.out.println("check point1");
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == 3)
					continue;
				System.out.print(i + " ");

			}
			System.out.println();
		}
		System.out.println();
		System.out.println("=======================================================");
		System.out.println();
			
			
		loop:
			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 5; j++) {
					if (i == 3)
						continue loop;
					System.out.print(i + " ");
					
				}
				System.out.println();
			}
	}
}

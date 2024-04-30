package basic;

public class MathRandomApp {
	public static void main(String[] args) {
		
		// 0.0 <= 난수값 < 1.0
		
		for (int i = 1; i <= 5; i++) {
			System.out.println(i + "번째 실수 난수 값 = " + Math.random());			
		}
		System.out.println("======================================================");
		for (int i = 0; i < 5; i++) {
			System.out.println(i + "번째 실수 난수 값 = " + (int)(Math.random()*100));
		}
		System.out.println("======================================================");			
		for (int i = 0; i < 5; i++) {
			System.out.println(i + "번째 실수 난수 값 = " + ((int)(Math.random()*45)+1));
		}
		System.out.println("======================================================");			
	}

}

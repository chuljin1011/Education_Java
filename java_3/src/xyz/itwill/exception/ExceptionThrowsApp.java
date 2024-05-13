package xyz.itwill.exception;

public class ExceptionThrowsApp {
	public static void display() throws ArrayIndexOutOfBoundsException {
		int[] array = { 10, 20, 30, 40, 50 };
		for (int i = 0; i <= array.length; i++) {
			System.out.println("array[" + i + "] = " + array[i]); // 예외 발생 가능 명령
		}
	}

	public static void main(String[] args) {
		try {
			display();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("[에러] 오류 발생 ");
		}
	}

}

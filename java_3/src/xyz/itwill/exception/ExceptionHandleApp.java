package xyz.itwill.exception;

// 예외(Exception) : JVM에 의해 java 프로그램이 실행될 때 발생하는 오류

public class ExceptionHandleApp {
	public static void main(String[] args) {
		int[] array = { 10, 20, 30, 40, 50 };
		
		

		try {
		for (int i = 0; i <= array.length; i++) {
			System.out.println("array[" + i + "] = " + array[i]); // 예외 발생 가능 명령
		}

		System.out.println("[메세지] 프로그램이 정상적으로 실행되었습니다.");
		} catch (ArrayIndexOutOfBoundsException e) {
			// ArrayIndexOutOfBoundsException 객체를 전달받아 참조변수에 저장하여 예외처리 사
			
			// 프로그램 사용자에게 예외 관련 정보를 제공
//			System.out.println("[에러] 프로그램 실행에 예기치 못한 오류가 발생 되었습니다.");
			
			System.out.println("[예외]" + e.getMessage());
			
//			e.printStackTrace();
			
		} finally {
			System.out.println("[메세지] 예외 발생과 상관없이 무조건 실행될 명령");
		}
	}

}
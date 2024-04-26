package basic;

public class DataTypeApp {
	public static void main(String[] args) {
		System.out.println("정수값(10진수 100) = " + 100);
		System.out.println("정수값(8진수 100) = " + 0100);
		System.out.println("정수값(16진수 100) = " + 0x100);
		System.out.println("정수값(10진수 100) = " + 100L);
		
		System.out.println(2147483647);
		System.out.println(2147483648L);
		
		// 
		byte a1 = 1; // 1byte
		short a2 = 3; // 2byte
		int a3 = 123; // 4byte
		long a4 = 12; // 8bye
		
		// 정수형
		float b1 = 1.2f;
		double b2 = 1.2;
		
		System.out.println("ab\tab");
		System.out.println('\0');		
		
		char d1 = 'a' +1;
		System.out.println(d1);
	}

}

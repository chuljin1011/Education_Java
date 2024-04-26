package basic;

public class TypeCastApp {
	public static void main(String[] args) {
		//자동 형변환
		System.out.println("결과 = " + (3+1.5));
		System.out.println(95/10);
		System.out.println(95/10.);
		
		//강제 형변환 : 개발자가 cast 연산자를 사용하여 값을 원하는 자료형의 값으로 변환
		// cast 연산자 : (자료형)값
		int num=(int)12.3;
		System.out.println(num);
		
		int num1=95, num2=10;
		double num3 = (double)num1 / num2;
		System.out.println(num3);
		
		int num4 = 100_000_000, num5=30;
		long num6 = (long)num4 * num5;
		System.out.println(num6);
		
		double number = 1.23456789;
		System.out.println("numner = " + number);
		
		// 변수의 자릿수를 소수점 2번째 자리까지만 출력되도록 변환
		
		System.out.println((int)number*100);
		System.out.println((int)(number*100));
		System.out.println((int)(number*100)/100.);
		
		
	}
}

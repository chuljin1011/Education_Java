package oop;

public class Method {
	void displayOne() {
		System.out.println("Method 클래스에 작성 된 displayOne() 메소드 호출");
	}

	void displayTwo() {
		System.out.println("Method 클래스에 작성 된 displayOne() 메소드 호출");
	}

	public static void main(String[] args) {
		Method one = new Method();
		one.displayOne();
	}

	void printOne() {
		int tot = 0;
		for (int i = 1; i <= 100; i++) {
			tot += i;
		}
		System.out.println(tot);
	}

	void printTwo(int num) {
		if (num < 0) {
			System.out.println("에러] 매개변수에는 0보다 큰 값이 전달 디어야 합니다.");
			return;
		}
		int tot = 0;
		for (int i = 1; i <= num; i++) {
			tot += i;
		}
		System.out.println(tot);
	}

	void printThree(int num1, int num2) {

		int tot = 0;
		for (int i = num1; i <= num2; i++) {
			tot += i;
		}
		System.out.println(tot);

	}

	int returnTot(int num1, int num2) {
		int tot = 0;

		if (num1 > num2) {
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}

		for (int i = num1; i < num2; i++) {
			tot += i;
		}
		return tot;
	}

	boolean isOddEven(int num) {
		if (num % 2 != 0) {
			return false;
		} else {
			return true;

		}

	}

	int[] returnArray() {

		return new int[] { 10, 20, 30, 40, 50 };
	}

	int sumOne(int... array) {
		int sum = 0;
		for (int su : array) {
			sum += su;
		}
		return sum;
		
		

	}
}

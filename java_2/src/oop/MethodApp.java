package oop;

public class MethodApp {
	public static void main(String[] args) {

		Method method = new Method();

		System.out.println(method);

		method.displayOne();

		method.printOne();
		method.printTwo(-50);

		int total = method.returnTot(30, 70);
		int total1 = method.returnTot(20, 70);
		
		System.out.println(total);
		System.out.println(total1);
		
		boolean result = method.isOddEven(10);
		
		if(result) {
			System.out.println("짝수입니다");
		} else {
			System.out.println("홀수입니다");
		}
		
		System.out.println("==================================================================");
		
		int[] suArray= {10, 20, 30};
		System.out.println("합계 = " + method.sumOne(suArray));
		System.out.println("합계 = " + method.sumOne(new int[]{1, 2, 3}));
		System.out.println("합계 = "+method.sumOne(new int[]{10, 20}));
		
		
		
	}
}

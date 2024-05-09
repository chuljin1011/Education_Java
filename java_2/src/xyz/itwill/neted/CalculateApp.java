package xyz.itwill.neted;

public class CalculateApp {
	public static void main(String[] args) {

//		class CalculateImpl implements Calculate {
//			@Override
//			public int sum(int num1, int num2) {
//				return num1 + num2 ;
//			}
//		}
//		
//		Calculate calculate = new CalculateImpl();
//		System.out.println("합계 = " + calculate.sum(10, 20));

		/*
		 * Calculate calculate = new Calculate() {
		 * 
		 * @Override public int sum(int num1, int num2) { return num1 + num2 ;
		 * 
		 * }
		 * 
		 * }; System.out.println("합계 = " + calculate.sum(10, 20));
		 */

//		Calculate calculate = (int num1, int num2) -> 
//		{
//			return num1 + num2;
//		};
//		System.out.println("합계 = " + calculate.sum(10, 20));
		Calculate calculate = (int num1, int num2) -> num1 + num2;

		System.out.println("합계 = " + calculate.sum(10, 20));
	}

}

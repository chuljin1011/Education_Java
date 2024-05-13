package xyz.itwill.lang;

public class WrapperApp {
	public static void main(String[] args) {
//		int num1 = 100, num2 = 200;
//		int num3 = num1 + num2;
//		System.out.println("합계 = " + num3);

//		Integer num1 = new Integer(100);
		Integer num1 = Integer.valueOf(100);
		Integer num2 = Integer.valueOf("200");

		Integer num3 = Integer.valueOf(num1.intValue() + num2.intValue());
//		System.out.println(num1 + num2);

		System.out.println("합계 = " + num3.intValue());

		// 오토박싱 기능 때문 : 리터럴(값)
		Integer num10 = 100, num20 = 200;
		Integer num30 = num10 + num20;
		System.out.println("합계 = " + num30.intValue());

		Integer num = Integer.valueOf("ABC", 16);
		System.out.println(num);

		Integer su = 50;
		System.out.println("10진수=" + su);
		System.out.println("8진수=" + Integer.toOctalString(su));
		System.out.println("8진수=" + Integer.toHexString(su));
		System.out.println("8진수=" + Integer.toBinaryString(su));

		su = -50;
		System.out.println("8진수=" + Integer.toBinaryString(su));
		System.out.println("============================================================");
		String str1="100", str2="200";
		System.out.println("합계 = " + (str1 + str2));
		
		System.out.println("합계 = " + (Integer.parseInt(str1) + Integer.parseInt(str2)));
		System.out.println("합계 = " + (Integer.valueOf(str1) + Integer.valueOf(str2)));
		System.out.println();

	}

}

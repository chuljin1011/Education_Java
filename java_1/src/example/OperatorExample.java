package example;

public class OperatorExample {
	public static void main(String[] args) {
		// 245678초를 일시분초 형식으로 변환하여 출력하세요.

		int test = 245678;
		int t1 = test / 60;
		int sec = test % 60;

//		System.out.println(t1);
//		System.out.println(sec);

		int hour = t1 / 60;
		int minute = t1 % 60;

//		System.out.println(hour);
//		System.out.println(minute);

		System.out.println(hour + "시" + minute + "분" + sec + "초");

		System.out.println("==============================================================");
		// 한대의 가격이 1억 5천원만인 비행기를 20대 구매할 경우 지불해야될 금액을 계산하여 출력하세요.
		// 단, 15대 이상 구매할 경우 1대당 25%의 할인율을 적용하여 계산하세요.

		int price = 150000000;
		int count = 20;
		long money = (long) (count >= 15 ? price * 0.75 : price) * count;

		System.out.println(money + "원 입니다.");
//		}

		System.out.println("==============================================================");
	}
}
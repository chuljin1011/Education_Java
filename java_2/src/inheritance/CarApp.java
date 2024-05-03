package inheritance;

public class CarApp {
	public static void main(String[] args) {
		Car car = new Car("싼타페", "홍길동");

		System.out.println("모델명 = " + car.getModelName());
		System.out.println("소유자명 = " + car.getUserName());
		System.out.println("=============================================");
		System.out.println(car.toString()); // 참조변수에 저장 된 객체를 참조하여 클래스명@메모리 주소
		System.out.println("=============================================");

		System.out.println("car = " + car);

		String name = "홍길동";

		System.out.println("name.toString() = " + name.toString());

	}

}

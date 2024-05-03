package oop;

public class CarApp {
	public static void main(String[] args) {

		// Car 클래스로 객체를 생성하여 참조변수에 객체의 메모리 주소 저장
		Car carOne = new Car();
		Car carTwo = new Car();

		System.out.println(carOne);
		System.out.println(carTwo);

		Car carThree = carOne;
		System.out.println(carThree);

		carOne.setModelName("싼타페");

		System.out.println("첫번째 자동차의 모델명 = " + carOne.getModelName());
		System.out.println("첫번째 자동차의 엔진상태 = " + carOne.isEnginStatus());
		System.out.println("첫번째 자동차의 현재속도 = " + carOne.getCurrentSpeed());

		System.out.println("====================================================");

		carTwo.setModelName("쏘나타");
		carTwo.setEnginStatus(true);
		carTwo.setCurrentSpeed(-40);
		System.out.println("두번째 자동차의 모델명 = " + carTwo.getModelName());
		System.out.println("두번째 자동차의 엔진상태 = " + carTwo.isEnginStatus());
		System.out.println("두번째 자동차의 현재속도 = " + carTwo.getCurrentSpeed());

		System.out.println("====================================================");

		carOne.startEngine();
		carOne.speedUp(50);
		carOne.speedUp(300);
		carOne.speedDown(40);
		carOne.speedZero();
		carOne.stopEngine();

		System.out.println("====================================================");

		carTwo.startEngine();
		carTwo.speedUp(50);
		carTwo.speedUp(300);
		carTwo.speedDown(40);
		carTwo.speedZero();
		carTwo.stopEngine();
		System.out.println("====================================================");
	}
}

package oop;

public class Car {
	String modelName;
	boolean enginStatus;
	int currentSpeed;

	void startEngine() {
		enginStatus = true;
		System.out.println(modelName + "의 자동차 시동을 켰습니다.");
	}

	void stopEngine() {
		enginStatus = false;
		System.out.println(modelName + "의 자동차 시동을 껐습니다.");
	}

	void speedUp(int speed) {
		currentSpeed += speed;
		System.out.println(modelName + "의 자동차 속도가 " + speed + "km/h 증가 되었습니다. "
				+ "현재 속도는 " +currentSpeed+ "km/h 입니다.");
	}
	
	void speedDown(int speed) {
		currentSpeed -= speed;
		System.out.println(modelName + "의 자동차 속도가 " + speed + "km/h 감소 되었습니다. "
				+ "현재 속도는 " +currentSpeed+ "km/h 입니다.");
	}
	
	void speedZero() {
		currentSpeed = 0;
		System.out.println(modelName + "의 자동차 속도가 멈췄습니다. "
				+ "현재 속도는 " +currentSpeed+ "km/h 입니다.");
	}
}

package oop;

public class Car {
	private String modelName;
	private boolean enginStatus;
	private int currentSpeed;

	void startEngine() {
		enginStatus = true;
		System.out.println(modelName + "의 자동차 시동을 켰습니다.");
	}

	void stopEngine() {
		if (currentSpeed != 0) {
//			currentSpeed = 0;
//			System.out.println(modelName + "의 자동차 시동을 껐습니다.");

			speedZero();
		}

		enginStatus = false;
		System.out.println(modelName + "의 자동차 시동을 껐습니다.");
	}

	void speedUp(int speed) {
		if (!enginStatus) {
			System.out.println(modelName + "의 자동차 시동이 꺼져 있습니다.");
			return;
		}

		if (currentSpeed + speed > 150) {
			speed = 150 - currentSpeed;
		}

		currentSpeed += speed;
		System.out
				.println(modelName + "의 자동차 속도가 " + speed + "km/h 증가 되었습니다. " + "현재 속도는 " + currentSpeed + "km/h 입니다.");
	}

	void speedDown(int speed) {
		if (!enginStatus) {
			System.out.println(modelName + "의 자동차 시동이 꺼져 있습니다.");
			return;
		}
		if (currentSpeed < speed) {
			speed = currentSpeed;
		}
		currentSpeed -= speed;
		System.out
				.println(modelName + "의 자동차 속도가 " + speed + "km/h 감소 되었습니다. " + "현재 속도는 " + currentSpeed + "km/h 입니다.");
	}

	void speedZero() {
		if (!enginStatus) {
			System.out.println(modelName + "의 자동차 시동이 꺼져 있습니다.");
			return;
		}
		currentSpeed = 0;
		System.out.println(modelName + "의 자동차 속도가 멈췄습니다. " + "현재 속도는 " + currentSpeed + "km/h 입니다.");
	}

	// Getter 메소드 : 클래스 외부에서 필드값을 사용할 수 있도록 필드값을 반환하는 메소드
	// 형식) public 반환 메소드명() { return 필드명; }
	// 메소드의 이름은 [get필드명] 형식으로 작성하는 것을 권장
	// 필드의 자료형이 [boolean]인 경우 [is필드명] 형식으로 작성
	public String getModelName() { // modelName 필드값을 반환하는 메소드
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName; // this = 메소드에서 메소드를 호출한 객체를 표현하기 위한 키워드
	}

	public boolean isEnginStatus() {
		return enginStatus;
	}

	public void setEnginStatus(boolean enginStatus) {
		this.enginStatus = enginStatus;
	}

	public int getCurrentSpeed() {
		return currentSpeed;
	}

	public void setCurrentSpeed(int currentSpeed) {
		this.currentSpeed = currentSpeed;
	}
	
}

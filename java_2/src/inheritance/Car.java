package inheritance;

// class 작성 시 상속받은 부모클래스가 없는 경우 무조건 Object class를 상속받아 사용
// 모든 java class는 Object class를 상속받는다.
public class Car {

	private String modelName; // 모델명
	private String userName; // 소유자명

	public Car() {
		// TODO Auto-generated constructor stub
	}

	public Car(String modelName, String userName) {
		super();
		this.modelName = modelName;
		this.userName = userName;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "modleName : " + modelName + " , userName : " + userName;

	}

}

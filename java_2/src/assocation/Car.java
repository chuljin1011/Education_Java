package assocation;

public class Car {
	private String modelName;
	private int productionYear;
	
	//엔진정보를 저장하기 위한 필드 - Engine 클래스를 사용하여 필드 작성
	private Engine engine;
	
	public Car() {
		// TODO Auto-generated constructor stub
	}	
	public Car(String modelName, int productionYear, Engine engine) {
		super();
		this.modelName = modelName;
		this.productionYear = productionYear;
		this.engine = engine;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public int getProductionYear() {
		return productionYear;
	}

	public void setProductionYear(int productionYear) {
		this.productionYear = productionYear;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	public void displayCar() {
		System.out.println("모델명 = " + modelName);
		System.out.println("생산년도 = " + productionYear);
//		System.out.println("엔진정보 = " + engine);
		System.out.println("엔진타입 = " + engine.getFualType());
		System.out.println("배기량 = " + engine.getDisplacement());
	}


}

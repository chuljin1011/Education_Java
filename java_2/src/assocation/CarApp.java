package assocation;

public class CarApp {
	public static void main(String[] args) {
		Engine engine = new Engine();
		
		//Setter 메소드를 호출하여 객체 필드값 변경
		engine.setFualType("경유");
		engine.setDisplacement(2500);
		
		engine.displayEngine();
		
		System.out.println("================");
		
		Car carOne = new Car();
		
		carOne.setModelName("쏘렌토");
		carOne.setProductionYear(2020);
		carOne.setEngine(engine);
		
		carOne.displayCar();
		System.out.println("================");
		
		Car carTwo = new Car("싼타페", 2022, new Engine("휘발유", 2900));
		
		
		carTwo.displayCar();
		
		
		System.out.println("================");
		
		System.out.println(carOne.getEngine());
		System.out.println("================");
		carTwo.getEngine().displayEngine();
	}

}

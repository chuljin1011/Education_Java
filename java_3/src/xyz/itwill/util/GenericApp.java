package xyz.itwill.util;

public class GenericApp {
	public static void main(String[] args) {
		
		Generic<Integer> generic1 = new Generic<Integer>();
		
		generic1.setField(100);
//		generic1.setField(12.34);
		
		Integer returnObject1 = generic1.getField();
		
		System.out.println("필드값 = " + returnObject1);
		
		Generic<Double> generic2 = new Generic<Double>();
		generic2.setField(12.34);
		
		Double returnObject2 = generic2.getField();
		System.out.println("필드값 = " + returnObject2);
		System.out.println("필드값 = " + generic2.getField());

		
	}

}

package xyz.itwill.util;

public class NonGenericApp {
	public static void main(String[] args) {
		NonGeneric nonGeneric1 = new NonGeneric();

		nonGeneric1.setFeild(100);

		Integer returnObject1 = (Integer) nonGeneric1.getFeild();

		System.out.println("필드값 = " + returnObject1);

		NonGeneric nonGeneric2 = new NonGeneric();

		nonGeneric2.setFeild(12.34);

		if (nonGeneric2.getFeild() instanceof Integer) {

			Integer returnObject2 = (Integer) nonGeneric2.getFeild();
			System.out.println("필드값 = " + returnObject2);
		} else if (nonGeneric2.getFeild() instanceof Double) {
			Double returnObject2 = (Double) nonGeneric2.getFeild();
			System.out.println("필드값 = " + returnObject2);
		}
		NonGeneric nonGeneric3 = new NonGeneric();
		
		nonGeneric3.setFeild("홍길동");
		
		String returnObject3 = (String)nonGeneric3.getFeild();
		
		System.out.println("필드값 = " + returnObject3);

	}

}

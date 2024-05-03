package oop;

public class RuntimeApp {
	public static void main(String[] args) {
//		Runtime runtime = new Runtime();

		Runtime runtime1 = Runtime.getRuntime();
		Runtime runtime2 = Runtime.getRuntime();

		System.out.println(runtime1);
		System.out.println(runtime2);
		System.out.println("=====================================================");

		System.out.println("메모리 정리 전 메모리 사용량 >> ");
		System.out.println((Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) + "Byte");

		// Runtime.getRuntime().gc();
		System.gc();
		System.out.println("=====================================================");

		System.out.println("메모리 정리 후 메모리 사용량 >> ");
		System.out.println((Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) + "Byte");

	}

}

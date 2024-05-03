package oop;

public class OverloadApp {
	public static void main(String[] args) {
		Overload overload = new Overload();
		
		overload.displayInt(100);
		overload.displayBoolean(false);
		overload.displayString("홍길동");
		
		System.out.println("==========================================================");
		
		overload.display(100);
		overload.display(false);
		overload.display("홍길동");
		
		
		
		
		
		
	}
}

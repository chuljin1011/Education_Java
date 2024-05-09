package xyz.itwill.realization;

public class PrintableApp {
	public static void main(String[] args) {
		Printable printOne = new PrintSingle();
		
		Printable.power();
		printOne.print();
		printOne.scan();
		System.out.println("================================================================================");
		
		Printable printTwo = new PrintMulti();
		
		Printable.power();
		printTwo.print();
		printTwo.scan();
		
		
		System.out.println("================================================================================");
		
		
	}

}

package xyz.itwill.neted;

import xyz.itwill.neted.OuterOne.InnerOne;

public class OuterOneApp {
	public static void main(String[] args) {
		OuterOne outerOne = new OuterOne(100);
		outerOne.outerDisplay();
		System.out.println("======================================================");
		
		InnerOne innerOne = outerOne.new InnerOne();
		innerOne.innerDisplay();
		
		
	}

}

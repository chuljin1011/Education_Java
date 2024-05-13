package xyz.itwill.lang;

import java.text.DecimalFormat;

public class DecimalFormatApp {
	public static void main(String[] args) {

		int money = 100000000;
		System.out.println("금액 = " + money + "원 ");
		
//		DecimalFormat decimalFormat = new DecimalFormat("###,###,##0") ;
		
//		System.out.println(decimalFormat.format(money));
		System.out.println(DecimalFormat.getInstance().format(money));
		System.out.println(DecimalFormat.getCurrencyInstance().format(money));
		
		
		
	}

}

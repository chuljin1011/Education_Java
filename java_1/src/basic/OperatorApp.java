package basic;
// 연산자 (operator) : 계산에 목적으로 제공되는 기호 또는 키워드
// -> 피연사자 : 연산자에 의해 계산 되어 지는 값

public class OperatorApp {
	public static void main(String[] args) {
		System.out.println("10 + 20 * 3 = "+(10+20*3));
		System.out.println("(10 + 20) * 3 = "+((10+20)*3));
		System.out.println("===================================================");
		
		int a1=10;
		System.out.println(+(-a1));
		System.out.println((20>10));
		System.out.println(!(20>10));
		
		int a2 = 10, a3 = 10;
		++a2;
		--a3;
		a2++;
		a3--;
		System.out.println(("" + a2) + "  " + a3);
		System.out.println(a2 * a3);
		
		int b1 = 1;
		int b2 = 1;
		int b3 = ++b1 + b2--;
		int b4 = ++b1 + (b2--);
		System.out.println(b3);
		System.out.println(b4); 
		
		
		char mun = 'A';
		++mun;
		System.out.println(mun);
		
		int e1=10, e2=20;
		System.out.println("큰 값 = " + (e1 > e2 ? e1 : e2));
		
		int e4 = 10;
		System.out.println("e4 = " + e4);
		e4+=20;
		System.out.println("e4 = " + e4);
				
		int f1 = 1;
		int f2 = 2;
		int f3 = 3;
		
		f1 = f2 = f3;
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);		
		
	}	
}

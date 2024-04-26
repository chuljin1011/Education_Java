package basic;

public class forApp {
	public static void main(String[] args) {

		/*
		 * for (int i = 1; i <= 5; i++) { System.out.print(i + "\t"); }
		 * 
		 * for (int i = 1; i <= 5; i++) { System.out.print(i + "\t"); }
		 */

		// 1~100 범위의 정수들의 합계
		int tot = 0;
		for (int i = 1; i <= 100; i++) {
			tot += i;
		}
		System.out.println(tot);
		
		int begin = 80, end = 20;
		
		if(begin > end) {
			int temp = begin;
			begin = end;
			end = temp;			
			System.out.println("[에러]");
		}
		
		int sum = 0;
		for(int i=begin; i<=end; i++) {
			sum+=i;
		}
		
		System.out.println(sum);

		

	}

}

//break point 후 디버깅 시 전으로 돌아가는 것이 있는지 질문
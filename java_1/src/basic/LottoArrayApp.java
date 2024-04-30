package basic;

//1 부터 45 범위

public class LottoArrayApp {
	public static void main(String[] args) {
		int[] lotto = new int[6];
		
		boolean result = false;

		for (int i = 0; i < lotto.length; i++) {
			while (true) {
				lotto[i] = (int) (Math.random() * 45) + 1;

				for (int j = 0; j < i; j++) {
					if(lotto[i] == lotto[j] ) {
						result = true;
						break;  // for문 종료
					}
				}
				
				if(!result) break;
			}
		}
		
		for (int i = 0; i < lotto.length-1; i++) {
			for (int j = i+1; j < lotto.length; j++) {
				if(lotto[i] > lotto[j]) {
					int ch1 = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = ch1;
					
				}
				
			}
			
		}
		
		
		System.out.println("행운의 숫자 >>");
		for (int number : lotto) {
			System.out.print(number + " ");
		}
		System.out.println();
	}

}

package basic;

public class IfApp {
	public static void main(String[] args) {
		int su = 90;
		
		// 변수값이 50 이상인 경우 변수값을 화면에 출력
		
		if(su > 50) {
			System.out.println("su = " + su);
			System.out.println("");
			
		int score = 80;
			if(score > 60) {
				System.out.println("합격");
			}
			else {
				System.out.println("불합격");
			}
		}
		
		int score1 = 80;
		System.out.println(score1 > 60 ? "합격":"불합격");
		
		char s1 = '0';
		if(s1 >= 'a' && s1 <= 'z' || s1 > 'A' && s1 < 'Z')
		System.out.println("영문 입니다.");
		else
			System.out.println("비영문 입니다.");
		
		System.out.println("=================================");
		
		int jumsu = 1;
 		
		if(!(jumsu >= 0 && jumsu <= 100)) {
			System.out.println("비정상 점수 입니다.");
			
		}
	}	
}

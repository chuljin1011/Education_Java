package basic;

public class whileApp {
	public static void main(String[] args) {
		int i = 1;
		while (i <= 5) {
			System.out.println("Java Programing");
			i++;
		}
		System.out.println("==========================================");

		int j = 1, tot = 0;
		do {
			tot += j;
			j++;
		} while (j <= 100);
		System.out.println("1~100의 범위의 정수들의 합계 = " + tot);
		System.out.println("==========================================");

		// A4 용지를 반으로 계속 접어서 펼쳤을 때 사각형 갯수가 500개 이상이 만들어 지리면

		int cnt = 0, gae = 1;
		while (gae < 500) {
			cnt++;
			gae *= 2;
		}
		System.out.println(cnt + "번 접으면 " + gae + "개의 사각형 모양이 만들어집니다.");

		// 1~X 범위의 정수들의 합계가 300이상이 만들어지려면 X가 얼마인지 계산하여 출력

		int total = 0;
		int a1 = 1;
		while (total < 300) {
			total += a1;
			a1++;
		}
		a1--;
		System.out.println("1~X 범위의 정수들의 합계가 300이상이 만들어지려면 x 는 " + a1);

//		int x = 1, sum = 0;
//
//		while (sum < 300) {
//			sum += x;
//			x++;
//		}
//		x--;
//		System.out.println(x);
	}
}

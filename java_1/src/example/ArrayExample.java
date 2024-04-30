package example;

import java.util.Arrays;

public class ArrayExample {
	public static void main(String[] args) {
		// 사람들의 나이를 저장한 배열 생성하여 참조변수에 저장
		int[] age = { 27, 16, 22, 36, 57, 60, 43, 23, 14, 29, 44, 52, 59, 51, 39, 33, 11 };

		// 배열에 저장된 모든 사람들의 나이 평균을 계산하여 출력하세요.
		int sum = 0;
		for (int a1 : age) {
			sum += a1;

		}
		System.out.println("모든 사람들의 나이평균은" + ((double) sum / age.length));

		System.out.println("===============================================================");
		// 배열에 저장된 사람들의 나이를 연령별로 구분하여 인원수를 계산하여 출력하세요.
		// ex) 10대 = 3명
		// 20대 = 4명
		// ...
		// 60대 = 1명
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		int count5 = 0;
		int count6 = 0;

		for (int i = 0; i < age.length; i++) {
			switch (age[i] / 10) {
			case 1:
				count1++;
				break;
			case 2:
				count2++;
				break;
			case 3:
				count3++;
				break;
			case 4:
				count4++;
				break;
			case 5:
				count5++;
				break;
			case 6:
				count6++;
				break;

			}
		}
		System.out.println("10대 :" + count1 + "명");
		System.out.println("20대 :" + count2 + "명");
		System.out.println("30대 :" + count3 + "명");
		System.out.println("40대 :" + count4 + "명");
		System.out.println("50대 :" + count5 + "명");
		System.out.println("60대 :" + count6 + "명");

		int[] cnt = new int[6];
		for (int nai : age) {
			switch (nai / 10) {
			case 1:
				cnt[0]++;
				break;
			case 2:
				cnt[1]++;
				break;
			case 3:
				cnt[2]++;
				break;
			case 4:
				cnt[3]++;
				break;
			case 5:
				cnt[4]++;
				break;
			case 6:
				cnt[5]++;
				break;
			}
		}
		System.out.println(Arrays.toString(cnt));
		
		Arrays.sort(cnt);
		
 		

		System.out.println("===============================================================");
	}
}
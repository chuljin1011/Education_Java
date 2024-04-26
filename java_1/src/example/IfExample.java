package example;

public class IfExample {
	public static void main(String[] args) {
		// 변수에 저장된 문자값을 출력하세요.
		// 단, 변수에 저장된 문자값이 소문자인 경우 대문자로 변환하여 출력하세요.
		char mun = 'd';

		if (mun >= 'a' && mun <= 'z') {
			mun -= 32;
		}
		System.out.println(mun);

		System.out.println("============================================================");
		// 변수에 저장된 정수값이 4의 배수인지 아닌지를 구분하여 출력하세요.
		int num = 345644;

		if (num % 4 == 0) {
			System.out.println("4의 배수 입니다.");
		} else {
			System.out.println("4의 배수가 아닙니다.");

		}

		System.out.println("============================================================");
		// 이름이 [홍길동]인 학생이 국어점수 89점, 영어점수 93점, 수학점수 95점을 받은 경우
		// 총점과 평균, 학점을 계산하여 이름, 총점, 평균, 학점을 출력하세요.
		// => 국어,영어,수학 점수 중 하나라도 0~100 범위가 아닌 경우 프로그램 강제 종료
		// System.exit(0) : 프로그램을 강제로 종료하는 메소드
		// => 평균을 이용한 학점 계산 : 100~90:A, 89~80:B, 79~70:C, 69~60:D, 59~0:F
		// => 평균은 소숫점 두자리까지만 출력하고 나머지는 절삭 처리 하세요.

		String name = "홍길동";
		int language = 89;
		int english = 93;
		int math = 95;
		int subject = 3;
		String grade = "";

		if (language >= 0 && language <= 100 || english >= 0 && english <= 100 || math >= 0 && math <= 100) {
			int pointSum = language + english + math;
			double pointAvg = (int) ((((double) language + english + math) / subject) * 100) / 100.;
			System.out.println("이름 : " + name);
			System.out.println("총점 : " + pointSum);
			System.out.println("평균 : " + pointAvg);
			switch ((int) (pointAvg / 10)) {
			case 10:
				grade = "A";
				break;
			case 9:
				grade = "B";
				break;
			case 8:
				grade = "C";
				break;
			case 7:
				grade = "D";
				break;
			case 6:
				grade = "E";
				break;
			default:
				grade = "F";
			}

//			if (pointAvg >= 90) {
//				grade = "A";
//			} else if (pointAvg >= 80) {
//				grade = "B";
//			} else if (pointAvg >= 70) {
//				grade = "C";
//			} else if (pointAvg >= 60) {
//				grade = "D";
//			} else {
//				grade = "E";
//			}

			System.out.println("학점 : " + grade);

		} else {
			System.exit(0);
		}

		System.out.println("============================================================");
	}
}
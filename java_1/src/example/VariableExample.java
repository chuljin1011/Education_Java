package example;

public class VariableExample {
	public static void main(String[] args) {
		//가로의 길이가 7이고 세로의 길이가 10인 사각형의 넓이를 계산하여 출력하세요.
		
		int width = 7;
		int height = 10;
		int area = width * height;
		System.out.println("사각형의 넓이는 "+ area);
				
		
		System.out.println("==============================================================");
		//높이가 9이고 밑변의 길이가 7인 삼각형의 넓이를 계산하여 출력하세요.
		
		int width2 = 7;
		int height2 = 9;
		double area2 = width2 * (double)height2 /2 ;
		System.out.println("사각형의 넓이는 "+ area2);
		
		System.out.println("==============================================================");
		//10명의 전체 몸무게가 759Kg인 경우 평균 몸무게를 계산하여 출력하세요.
		
		int weightSum = 759;
		int peopleNum = 10;
		double weightAvg = weightSum / (double)peopleNum;
		System.out.println("10명의 평균 몸무게는 " + weightAvg);
		
		
	
		System.out.println("==============================================================");
		//이름이 [홍길동]인 학생이 국어점수 89점, 영어점수 93점, 수학점수 95점을 받은 경우
		//총점과 평균을 계산하여 이름, 총점, 평균을 출력하세요.
		//단, 평균은 소숫점 한자리까지만 출력하고 나머지는 절삭 처리 하세요.
		
		String name = "홍길동";
		int language = 89;
		int english = 93;
		int math = 95;
		int subject = 3;
		
		int pointSum = language + english + math;
		double pointAvg = (int)((((double)language + english + math) / subject)*10)/10.;
		System.out.println("이름 : " + name);
		System.out.println("총점 : " + pointSum);
		System.out.println("평균 : " + pointAvg);
				
				

	System.out.println("==============================================================");
	}
}

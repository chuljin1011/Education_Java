package test2;

public class scoreApp {
	public static void main(String[] args) {

		Score[] scores = new Score[6];
		scores[0] = new Score(1000, "홍길동", 87, 100, 90);
		scores[1] = new Score(2000, "전재준", 73, 58, 90);
		scores[2] = new Score(3000, "이순신", 56, 64, 81);
		scores[3] = new Score(4000, "정유비", 91, 76, 49);
		scores[4] = new Score(5000, "김관우", 75, 55, 58);
		scores[5] = new Score(1000, "박장비", 85, 68, 72);

		Calc clac = new Calc();

		for (Score score : scores) {
			score.display();

			
			clac.setCount(clac.getCount() + 1);
			
			clac.setSum(clac.getSum() + score.getTotal());

//			sum1 = sum.getCount() 
//			+= score.getTotal();

		}

		System.out.println();
		System.out.println("총 학생 " + clac.getCount() + "명의 평균 점수는 " + (clac.getSum() / clac.getCount()) + "점 입니다.");

		
	}

}

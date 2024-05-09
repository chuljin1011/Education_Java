package test2;

public class Score {
	private int no;
	private String name;
	private int koreaScore;
	private int englishScore;
	private int mathScore;
	private int total;
	
	public Score() {
		// TODO Auto-generated constructor stub
	}

	public Score(int no, String name, int koreaScore, int englishScore, int mathScore) {
		super();
		this.no = no;
		this.name = name;
		this.koreaScore = koreaScore;
		this.englishScore = englishScore;
		this.mathScore = mathScore;
		this.total = koreaScore + englishScore + mathScore;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKoreaScore() {
		return koreaScore;
	}

	public void setKoreaScore(int koreaScore) {
		this.koreaScore = koreaScore;
	}

	public int getEnglishScore() {
		return englishScore;
	}

	public void setEnglishScore(int englishScore) {
		this.englishScore = englishScore;
	}

	public int getMathScore() {
		return mathScore;
	}

	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}

	public int getTotal() {
		return total;
	}

//	public void setTotal(int total) {
//		this.total = total;
//	}	
	
	public void display() {
		System.out.print("국어성적 = " + koreaScore + "\t");
		System.out.print("영어성적 = " + englishScore + "\t");
		System.out.print("수학성적 = " + mathScore + "\t");
		System.out.print("시험총점 = " + total + "\t");
		System.out.println();
		System.out.println("========================================================================");
		
	}
}

package basic;

public class switchApp {
	public static void main(String[] args) {

		int point = 4;

		switch (point) {
		case 1:
			System.out.println("철진");
			break;
		case 2:
			System.out.println("민석");
			break;
		case 3:
			System.out.println("영호");
			break;
		case 4:
			System.out.println("준엽");
			break;
		case 5:
			System.out.println("충완");
			break;
		default:
			System.out.println("아무도 아님");
		}

		int jumsu = 87;
		String grade = "";

		switch (jumsu / 10) {
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

		System.out.println(grade + "입니다");
	}
}
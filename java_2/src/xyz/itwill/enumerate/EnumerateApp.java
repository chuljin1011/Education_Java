package xyz.itwill.enumerate;

public class EnumerateApp {
	public static void main(String[] args) {
		
		System.out.println(Enumerate.INSERT);
		System.out.println(Enumerate.UPDATE);
		System.out.println(Enumerate.SELECT);
		System.out.println(Enumerate.DELETE);
		
		System.out.println("삽입(EnumerateTwo.ADD) = " + EnumerateTwo.ADD);
		System.out.println("삽입(EnumerateTwo.MODIFY) = " + EnumerateTwo.MODIFY);
		System.out.println("삽입(EnumerateTwo.REMOVE) = " + EnumerateTwo.REMOVE);
		System.out.println("삽입(EnumerateTwo.SEARCH) = " + EnumerateTwo.SEARCH);
		
		Enumerate choice = Enumerate.INSERT;
		System.out.println(choice);
		
		switch(choice) {
//		case 1:
		case INSERT:
			System.out.println(" # 학생정보를 삽입합니다.");
		case UPDATE:
			System.out.println(" # 학생정보를 변경합니다.");
		case DELETE:
			System.out.println(" # 학생정보를 삭제합니다.");
		case SELECT:
			System.out.println(" # 학생정보를 검색합니다.");
		}
		
		
		
	}                                                                                                                                                                           

}

package basic;

import java.util.Scanner;

//System.out : 값을 화면(콘솔) 에 출력 - 추력 스트림
//System.in : 키보드로부터 입력된 값을 얻어와 제공하기 위한 객체 -  입력 스트림



public class ScannerApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("이름을 입력 >> ");
		String name = scanner.nextLine();
		
		System.out.print("나이 입력 >> ");
		int age = scanner.nextInt();
		
		System.out.println(name + " 님의 나이는 " + age + "살 입니다.");
		
	 scanner.close();  
	}

}

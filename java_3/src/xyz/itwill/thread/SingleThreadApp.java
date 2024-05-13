package xyz.itwill.thread;

public class SingleThreadApp {
	public static void main(String[] args) {
		System.out.println("singlethread App 클래스의 main() 메소드 시작");
		
		System.out.println("[" + Thread.currentThread().getName() + "] 에 의해 실행중");
		
		for(char i = 'A'; i<='Z' ; i++) {
			System.out.print(i);
		}
		System.out.println();
		
		new SingleThread().display();
		
		System.out.println("singlethread App 클래스의 main() 메소드 종료");
	}

}

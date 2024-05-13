package xyz.itwill.thread;

public class SingleThread {
	public void display() {
		System.out.println("singlethread 클래스의 display() 메소드 시작");
		
//		System.out.println("[" + Thread.currentThread().getName() + "] 에 의해 실행중");

		
		for(char i = 'a'; i<='z' ; i++) {
			System.out.print(i);
		}
		System.out.println();
		
		System.out.println("singlethread 클래스의 display() 메소드 종료");
	}

}

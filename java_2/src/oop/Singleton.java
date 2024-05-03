package oop;

public class Singleton {

	private static Singleton _instance;

	// 생성자는 private 접근 제한자를 사용화여 은닉화 처리 되도록 작성
	private Singleton() {
		// TODO Auto-generated constructor stub
	}

	static {
		_instance = new Singleton();
	}

	public static Singleton getSingleton() {
		return _instance;
	}
	
	public static void replaceInstance(Singleton newInstance) {
        _instance = newInstance;
    }

	public void display() {
		System.out.println("Singleton 클래스의 display() 메소드 호출");

	}

}

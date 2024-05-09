package xyz.itwill.realization;

public interface Printable {

	void print();

	static void power() {
		System.out.println("[장치] 전원을 켰습니다.");
	}

	default void scan() {
		System.out.println("[에러] 스캔 기능을 제공하지 않습니다.");

	}

}

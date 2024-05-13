package xyz.itwill.thread;

import java.util.Iterator;

public class MultiThreadApp {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("[" + Thread.currentThread().getName() + "] 에 의해 실행중");

//		Thread thread = new Thread();
//		thread.start();

//		MultiThreadOne one = new MultiThreadOne();
//		one.start();

//		one.start();

//		new MultiThreadOne().start();
//		new MultiThreadOne().start();

//		new Thread(new MultiThreadTwo()).start();

		new Thread(() -> {
			for (char i = 'a'; i <= 'z'; i++) {
				System.out.print(i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO: handle exception
					e.printStackTrace();
				}

			}

		}).start();

		for (int i = 1; i <= 9; i++) {
			System.out.print(i);

		}

	}
}

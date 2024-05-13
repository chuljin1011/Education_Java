package xyz.itwill.thread;

public class Account {

	private int balance;

	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(int blance) {
		super();
		this.balance = blance;
	}

	public int getBlance() {
		return balance;
	}

	public void setBlance(int blance) {
		this.balance = blance;
	}

	public synchronized void disposit(String name, int amount) {
		balance += amount;
		System.out.println("[입금]" + name + "님이 " + amount + "원을 입금하여 잔액은 " + balance + "원 입니다.");
	}

	public void withDraw(String name, int amount) {
		if (balance < amount) {
			System.out.println("[에러]" + name + "님, 잔액이 " + balance + "원 남아 " + amount + "원을 출금할 수 없습니다.");
			return;
		}

		balance -= amount;
		System.out.println("[입금]" + name + "님이 " + amount + "원을 출금하여 잔액은 " + balance + "원 입니다.");
	}

}

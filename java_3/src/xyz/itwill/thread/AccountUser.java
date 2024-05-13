package xyz.itwill.thread;

public class AccountUser extends Thread {

	private Account account;
	private String userName;

	public AccountUser() {
		// TODO Auto-generated constructor stub
	}

	public AccountUser(Account account, String username) {
		super();
		this.account = account;
		this.userName = username;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public String getUsername() {
		return userName;
	}

	public void setUsername(String username) {
		this.userName = username;
	}

	@Override
	public void run() {
//		account.disposit(userName, 5000);
		
		synchronized (account) {
			account.withDraw(userName, 5000);
			
		}
		
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

}

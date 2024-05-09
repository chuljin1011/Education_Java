package xyz.itwill.realization;

public class jdbcApp {
	public static void main(String[] args) {
		Jdbc mysql = new jdbcMySql();
		
		mysql.insert();
		mysql.update();
		mysql.delete();
		mysql.select();
	}

}

package xyz.itwill.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateStudentApp {
	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String username = "scott";
			String password = "tiger";
			
			con = DriverManager.getConnection(url, username, password);
			
			stmt=con.createStatement();
			
			String sql = "update student set name ='임걱정', address = '부천시 원미구' where no = 1000";
			int rows = stmt.executeUpdate(sql);
			
			System.out.println("[메세지]" + rows + "명의 학생정보를 삽입하여 변경 하였습니다.");
			
		} catch (ClassNotFoundException e) {
			System.out.println("[에러] OracleDriver 클래스를 찾을 수 없습니다.");
		} catch (SQLException e) {
			System.out.println("[에러] DBMS 관련 오류 = " + e.getMessage());
		} finally {
			try {
				if(stmt!=null) stmt.close();
				if(con!=null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}

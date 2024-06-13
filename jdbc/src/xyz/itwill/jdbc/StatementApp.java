package xyz.itwill.jdbc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.xml.transform.Result;

public class StatementApp {
	public static void main(String[] args) throws NumberFormatException, IOException, SQLException{
		
		/* BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("<<학생정보 입력 >>");
		System.out.print("학번 입력 >> ");
		int no = Integer.parseInt(in.readLine());
		System.out.print("이름 입력 >> ");
		String name = in.readLine();
		System.out.print("전화번호 입력 >> ");
		String phone = in.readLine();
		System.out.print("주소입력 입력 >> ");
		String address = in.readLine();
		System.out.print("생일 입력 >> ");
		String birthday = in.readLine();
		System.out.println("=========================================================================");
		
		Connection con  = ConnectionFactory.getConnection();
		Statement stmt = con.createStatement();
		
		String sql1 = "insert into student values("+ no +",'"+name+"','"+phone+"','"+address+"','"+birthday+"')";
		int rows = stmt.executeUpdate(sql1);0
		
		System.out.println(rows + "명의 학생정보를 삽입하였습니다.");

		String sql2 = "select no, name, phone, address, birthday from student order by no";
		ResultSet rs = stmt.executeQuery(sql2);
		
		System.out.println("<<학생 정보 출력>>");;
		while(rs.next()) {
			System.out.println("학번 = "+rs.getInt("no")+", 이름 = "+rs.getString("name")
			+", 전화번호 = "+rs.getString("phone")+", 주소 = "+rs.getString("address")
			+", 생년월일 = "+rs.getString("birthday").substring(0,10));
		}
		
		System.out.println();
		ConnectionFactory.close(con, stmt, rs);
		*/
		
		
		BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("<<학생정보 입력 >>");
		System.out.print("이름 입력 >> ");
		String name = in.readLine();
		System.out.println("======================================");
		
		Connection con  = ConnectionFactory.getConnection();
		Statement stmt = con.createStatement();
		
		String sql = "select no, name, phone,address,birthday from student where name = '' or '1' = '1' order by no";
		
		ResultSet rs = stmt.executeQuery(sql);
		
		System.out.println("<<조회 결과>>");
		
		if(rs.next()) {
			do {
				System.out.println("학번 = "+rs.getInt("no")+", 이름 = "+rs.getString("name")
				+", 전화번호 = "+rs.getString("phone")+", 주소 = "+rs.getString("address")
				+", 생년월일 = "+rs.getString("birthday").substring(0,10));
			} while(rs.next());
			
		} else {
			System.out.println("입력하신 정보가 없습니다.");
		}
		System.out.println("====================================");
		ConnectionFactory.close(con, stmt, rs);
		
		
		
	}

}

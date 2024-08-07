package xyz.itwill.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import xyz.itwill.dto.BoardDTO;

public class BoardDAO extends JdbcDAO {
	private static BoardDAO _dao;
	
	private BoardDAO() {
		// TODO Auto-generated constructor stub
	}
	
	static {
		_dao=new BoardDAO();
	}
	
	public static BoardDAO getDAO() {
		return _dao;
	}
	
	//댓글정보(BoardDTO 객체)를 전달받아 board 테이블의 행으로 삽입하고 삽입행의
	//갯수(int)를 반환하는 메소드
	public int insertBoard(BoardDTO Board) {
		Connection con=null;
		PreparedStatement pstmt=null;
		int rows=0;
		try {
			con=getConnection();
			
			String sql="insert into board values(board_seq.nextval,?,?,sysdate)";
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, Board.getWriter());
			pstmt.setString(2, Board.getContent());
			
			rows=pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("[에러]insertBoard() 메소드의 SQL 오류 = "+e.getMessage());
		} finally {
			close(con, pstmt);
		}
		return rows;
	}
	
	//댓글정보(BoardDTO 객체)를 전달받아 board 테이블에 저장된 행을 변경하고 
	//변경행의 갯수(int)를 반환하는 메소드
	public int updateBoard(BoardDTO Board) {
		Connection con=null;
		PreparedStatement pstmt=null;
		int rows=0;
		try {
			con=getConnection();
			
			String sql="update board set writer=?,content=? where num=?";
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, Board.getWriter());
			pstmt.setString(2, Board.getContent());
			pstmt.setInt(3, Board.getNum());
			
			rows=pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("[에러]updateBoard() 메소드의 SQL 오류 = "+e.getMessage());
		} finally {
			close(con, pstmt);
		}
		return rows;
	}
	
	//댓글번호(int)를 전달받아 board 테이블에 저장된 행을 삭제하고 삭제행의 갯수(int)를
	//반환하는 메소드
	public int deleteBoard(int num) {
		Connection con=null;
		PreparedStatement pstmt=null;
		int rows=0;
		try {
			con=getConnection();
			
			String sql="delete from board where num=?";
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, num);
			
			rows=pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("[에러]deleteBoard() 메소드의 SQL 오류 = "+e.getMessage());
		} finally {
			close(con, pstmt);
		}
		return rows;
	}
	
	//댓글번호(int)를 전달받아 board 테이블에 저장된 행을 검색하여 댓글정보(BoardDTO 객체)를
	//반환하는 메소드
	public BoardDTO selectBoard(int num) {
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		BoardDTO Board=null;
		try {
			con=getConnection();
			
			String sql="select num,writer,content,regdate from board where num=?";
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, num);
			
			rs=pstmt.executeQuery();
			
			if(rs.next()) {
				Board=new BoardDTO();
				Board.setNum(rs.getInt("num"));
				Board.setWriter(rs.getString("writer"));
				Board.setContent(rs.getString("content"));
				Board.setRegdate(rs.getString("regdate"));
			}
		} catch (SQLException e) {
			System.out.println("[에러]selectBoard() 메소드의 SQL 오류 = "+e.getMessage());
		} finally {
			close(con, pstmt, rs);
		}
		return Board;
	}
	
	//board 테이블에 저장된 모든 행을 검색하여 댓글목록(List 객체)를 반환하는 메소드
	public List<BoardDTO> selectBoardList() {
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		List<BoardDTO> BoardList=new ArrayList<BoardDTO>();
		try {
			con=getConnection();
			
			String sql="select num,writer,content,regdate from board order by num desc";
			pstmt=con.prepareStatement(sql);
			
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				BoardDTO Board=new BoardDTO();
				Board.setNum(rs.getInt("num"));
				Board.setWriter(rs.getString("writer"));
				Board.setContent(rs.getString("content"));
				Board.setRegdate(rs.getString("regdate"));
				BoardList.add(Board);
			}
		} catch (SQLException e) {
			System.out.println("[에러]selectBoardList() 메소드의 SQL 오류 = "+e.getMessage());
		} finally {
			close(con, pstmt, rs);
		}
		return BoardList;
	}
}
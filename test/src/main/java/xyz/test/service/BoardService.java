package xyz.test.service;

import java.sql.SQLException;
import java.util.List;

import xyz.test.dao.BoardDAO;
import xyz.test.dto.BoardDTO;

//Service 클래스 : 모델 클래스의 요청 처리 메소드에서 데이타 처리 기능을 제공하기 위한 클래스
// => 단위 프로그램(모듈 - Module) : 컴퍼넌트(Component)
// => 다수의 DAO 클래스의 메소드를 호출하여 데이타 처리에 필요한 기능을 제공 - DAO 모듈화
// => 데이타 처리 기능 구현시 발생되는 모든 문제에 대해 인위적 예외 발생하여 전달
public class BoardService {
	private static BoardService _service;
	
	private BoardService() {
		// TODO Auto-generated constructor stub
	}
	
	static {
		_service=new BoardService();
	}
	
	public static BoardService getService() {
		return _service;
	}
	
	public List<BoardDTO> getUserinfoList() throws SQLException {
		return BoardDAO.getDAO().selectBoardList();
	}
	
	
}
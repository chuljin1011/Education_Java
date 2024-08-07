package xyz.itwill.mvc;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import xyz.itwill.dto.UserinfoDTO;
import xyz.itwill.service.UserinfoService;

public class BoardListModel implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		ActionForward actionForward=new ActionForward();
		try {
			HttpSession session=request.getSession();
			UserinfoDTO loginUserinfo=(UserinfoDTO)session.getAttribute("loginUserinfo");
			if(loginUserinfo == null) {
				throw new Exception("비정상적인 요청 - 권한 관련 오류");
			}
			
			//UserinfoService 클래스의 getUserinfoList() 메소드를 호출하여 회원목록(List 객체)을
			//반환받아 request 객체의 속성값으로 저장
			// => 포워드 이동된 JSP 문서에서는 request 객체의 속성값을 제공받아 응답 처리
			request.setAttribute("boardList", UserinfoService.getService().getUserinfoList());
			
			actionForward.setForward(true);
			actionForward.setPath("/model_two/board_list.jsp");
		} catch (Exception e) {
			e.printStackTrace();
			actionForward.setForward(false);
			actionForward.setPath("/error.do");
		}
		return actionForward;
		
	}
	
	

}

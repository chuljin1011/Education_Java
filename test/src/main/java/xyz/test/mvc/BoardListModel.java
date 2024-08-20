package xyz.test.mvc;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import xyz.test.service.BoardService;

public class BoardListModel implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		ActionForward actionForward=new ActionForward();
		try {
			
			request.setAttribute("boardList", BoardService.getService().getUserinfoList());
			
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

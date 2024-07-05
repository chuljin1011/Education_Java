package xyz.itwill.guest;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import xyz.itwill.dao.GuestDAO;
import xyz.itwill.dto.GuestDTO;


@WebServlet("/guest.modify.itwill")
public class GuestModifyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//서블릿을 GET 방식으로 요청한 경우에 대한 응답 처리 - 비정상적인 요청에 대한 응답
				if(request.getMethod().equals("GET")) {
					//클라이언트에게 [405] 에러코드를 전달하여 응답
					response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED);
					return;
				}
				
				int num=Integer.parseInt(request.getParameter("num"));
				
				//POST 방식으로 서블릿을 요청하여 전달된 값을 읽기 위해 캐릭터셋 변경
				request.setCharacterEncoding("utf-8");
				
				//전달값(게시글)을 반환받아 저장
				String writer=request.getParameter("writer");
				String subject=request.getParameter("subject");
				String content=request.getParameter("content");
				
				//GuestDTO 객체를 생성하여 전달값으로 필드값 변경
				GuestDTO guest=new GuestDTO();
				guest.setWriter(writer);
				guest.setSubject(subject);
				guest.setContent(content);
				guest.setNum(num);
				
				//게시글(GuestDTO 객체)를 전달받아 Guest 테이블의 행으로 삽입하고 삽입행의 갯수를
				//반환하는 GuestDAO 클래스의 메소드 호출
				GuestDAO.getDAO().updateGuest(guest);
				
				//클라이언트에게 URL 주소를 전달하여 응답 처리
				response.sendRedirect("list.itwill");//리다이렉트 이동
	}

}

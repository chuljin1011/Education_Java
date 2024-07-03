package xyz.itwill.servlet;

import java.io.FileInputStream;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//클라이언트 요청에 의해 이미지 파일로 응답하기 위한 서블릿
// => /WEB-INF/Koala.jpg 파일(웹자원)을 클라이언트에게 응답

@WebServlet("/image.itwill")
public class SendImageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 클라이언트에게 이미지 파일(JPG 파일)이 응답되도록 응답파일의 형태 변경
		
		response.setContentType("image/jpeg");
		
		ServletOutputStream out = response.getOutputStream();
		
		String imageFilePath = request.getServletContext().getRealPath("/WEB-INF/Koala.jpg");
//		System.out.println("imageFilePath = " +imageFilePath);
		
		//이미지 파일을 읽기 위한 입력스트림(FileInputStream)을 생성하여 저장
		// => FileInputStream 클래스의 생성자 매개변수에 이미지 파일의 파일시스템 경로를 전달
		FileInputStream in = new FileInputStream(imageFilePath);
		
		while(true) {
			int readByte=in.read();
			if(readByte==-1) break;
			out.write(readByte);
		}
		
		in.close();
		
		
	}

}

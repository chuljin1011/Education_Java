<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%

	String loginId=(String)session.getAttribute("loginId");

	if(loginId == null) {
		session.setAttribute("msg", "로그인 사용자만 요청 가능한 페이지 입니다.");
		response.sendRedirect("login_form.jsp");
		return;
		
	}

%>   
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP</title>
</head>
<body>
	<h1>내정보</h1>
	<a href="logout_action.jsp">[로그아웃]</a>
	<a href="login_form.jsp">[메인으로]</a>
	<hr>
	<p>아이디 = <%=loginId %>&nbsp;&nbsp;</p>
	<p>로그인 사용자만 확인할 수 있는 정보</p>
	<p>로그인 사용자만 확인할 수 있는 정보</p>
	<p>로그인 사용자만 확인할 수 있는 정보</p>
	<p>로그인 사용자만 확인할 수 있는 정보</p>
	<p>로그인 사용자만 확인할 수 있는 정보</p>
	<p>로그인 사용자만 확인할 수 있는 정보</p>
	<hr>
	<img alt="코알라" src="../images/Koala.jpg" width="200">
	
	<img alt="코알라" src="../images/Koala.jpg" width="200">

</body>
</html>
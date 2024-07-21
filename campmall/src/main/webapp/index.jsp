<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	request.setCharacterEncoding("utf-8");

	//페이지 몸체부에 포함될 JSP 문서의 작업 폴더명을 반환받아 저장
	String workgroup=request.getParameter("workgroup");
	if(workgroup == null) {
		workgroup="client";
	}

	//페이지 몸체부에 포함될 JSP 문서의 파일명을 반환받아 저장
	String work=request.getParameter("work");
	if(work == null) {
		work="client_login";
	}
	
	String contentPath=workgroup+"/"+work+".jsp";
	

%> 
    
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="css/common.css">
<link rel="stylesheet" type="text/css" href="css/font.css">
<link rel="stylesheet" type="text/css" href="css/main.css">
<link rel="stylesheet" type="text/css" href="//cdn.jsdelivr.net/npm/slick-carousel@1.8.1/slick/slick.css">
<link rel="stylesheet" type="text/css" href="css/slick-theme.css">

<link rel="icon" href="images/logo_favicon.png"/>
<link rel="apple-touch-icon" href="images/logo_favicon.png"/>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
<script type="text/javascript" src="//cdn.jsdelivr.net/npm/slick-carousel@1.8.1/slick/slick.min.js"></script>


<title>Nature Gear</title>
</head>
<body>
	<div id="mainWrap" class="wrap_main">
		<%@include file="header.jspf" %>
		
		
		
		
		
		
		
		
		<!-- 개인 CODE 시작  -->
		
		<!-- 로그인 페이지 테스트 -->
		<%-- <%@include file="/client/login.jspf" %> --%>
		
		<!-- 회원가입 페이지 테스트 -->
		<jsp:include page="<%=contentPath %>"/>		
		<%
			String returnUrl=(String)request.getAttribute("returnUrl");
			if(returnUrl != null) {
				response.sendRedirect(returnUrl);
				return;
			}
		%>
		
		<!-- 개인 CODE 종료  -->
		
		
		
		
		
		
		<%@include file="footer.jspf" %>
	</div>
	<script type="text/javascript" src="js/main.js"></script>
</body>
</html>


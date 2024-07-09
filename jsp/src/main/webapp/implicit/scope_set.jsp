<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        
<%
		pageContext.setAttribute("pageName", "홍길동");
		request.setAttribute("requestName", "임꺽정");
		session.setAttribute("sessionName", "전우치");
		application.setAttribute("applicationName", "일지매");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP</title>
</head>
<body>
	<h1>객체의 사용범위</h1>
	<hr>
	<%
		String pageName=(String)pageContext.getAttribute("pageName");
		String requestName=(String)request.getAttribute("requestName");
		String sessionName=(String)session.getAttribute("sessionName");
		String applicationName=(String)application.getAttribute("applicationName");
	%>
	<p>pageName = <%=pageName %></p>
	<p>requestName = <%=requestName %></p>
	<p>sessionName = <%=sessionName %></p>
	<p>applicationName = <%=applicationName %></p>


</body>
</html>
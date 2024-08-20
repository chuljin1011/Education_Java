<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
 

<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table width="590">
		<tr>	
			<th>글번호</th>
			<th>글내용</th>
			<th>작성일자</th>
		</tr>
		
		<c:forEach var="boardinfo" items="${boardList }">
		
		<tr>
			<td>${boardinfo.num }</td>
			<td><a href="<c:url value="/boardView.do"/>" >${boardinfo.writer }</a></td>
			<td>${boardinfo.regdate }</td>
		</tr>
		
		</c:forEach>
	</table>

</body>
</html>
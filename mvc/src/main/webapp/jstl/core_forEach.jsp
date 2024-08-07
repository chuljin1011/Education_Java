<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MVC</title>
</head>
<body>
	<h1>EL - 프로그램 흐름 제어 태그</h1>
	<hr>
	
	<c:forEach var="i" begin="1" end="5" step="1">
		<p>${i }번째 출력되는 내용입니다.</p>
	</c:forEach>
	
	<table>
		<c:forEach var="i" begin="1" end="9" step="1">
		<tr>
			<c:forEach var="j" begin="2" end="9" step="1">
				<td width="100">${j } * ${i } = ${i*j }</td>
		
			</c:forEach>
		</tr>
		</c:forEach>
	</table>

</body>
</html>
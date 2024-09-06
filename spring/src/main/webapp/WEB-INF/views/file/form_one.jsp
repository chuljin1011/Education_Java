<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"
 %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SPRING</title>
</head>
<body>
	<h1>파일 업로드</h1>
	<hr>
	<%-- 사용자로부터 입력받은 파일을 form 태그를 사용해 요청 페이지에 전달하기 위해 enctype
	속성값을 반드시 [multipart/form-data]로 설정 --%>
	<form action="<c:url value="/file/upload1"/>" method="post" enctype="multipart/form-data">
	<table>
		<tr>
			<td>업로더 이름</td>
			<td><input type="text" name="uploaderName"></td>
		</tr>
		<tr>
			<td>업로더 파일</td>
			<td><input type="file" name="uploaderFile"></td>
		</tr>
		<tr>
			<td colspan="2"><button type="submit">제출</button></td>
		</tr>
	</table>
	</form>

</body>
</html>
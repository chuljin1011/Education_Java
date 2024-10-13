<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>채팅방 리스트</h1>
	
		<button type="button" onclick="openRoom()">입장</button>

</body>


<script type="text/javascript">

function openRoom() {
	var url = "${pageContext.request.contextPath}"+"/test/room"; // 채팅방 URL
       var windowName = 'ChatRoom'; // 새 창의 이름
       popupWindow = window.open(url, windowName, "resizeable");
       
       popupWindow.resizeTo(400, 800);
	   	popupWindow.onresize = (_=>{
	   	    popupWindow.resizeTo(400, 800);
	   	})
}
       
       

</script>


</html>
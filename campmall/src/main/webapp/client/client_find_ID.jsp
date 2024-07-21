<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!-- 개별 CSS -->
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/find_ID.css">


<div id="findIDArea" class="findIDArea">

	<div id="findIDText" class="findIDText">
		<p>아이디 찾기</p>
	</div>
	<div id="findIDArea_sub" class="findIDArea_sub">
		<div id="findIDbox" class="findIDbox">
			<form action="findID.html" method="post" id="findIDform">
				<div id="findIDbox_top">
					<p>회원아이디 찾기</p>
				</div>
				<div id="findIDbox_mid">
					<div id="findIDbox_mid_1">
						<ul>
							<li></li>
							<li><input type="text" name="id" id="id" placeholder="이름" style="margin-bottom: 5px"></li>
							<li><input type="text" name="email" id="email" placeholder="가입메일주소" style="width: 55%"> 
								<select id="domainSel" name="domainSel">
									<option id="domainSelf" selected>직접입력</option>
									<option>naver.com</option>
									<option>hanmail.net</option>
									<option>daum.net</option>
									<option>naver.com</option>
									<option>nate.com</option>
									<option>hotmail.com</option>
									<option>gmail.com</option>
								</select>
							</li>
						</ul>
					</div>
					<div id="findIDbox_mid_2">
						<button type="submit" id="findBtn">아이디 찾기</button>
					</div>
					<br>
				</div>
				<hr>
				<div id="btnDiv">
					<button type="button" id="findPWBtn">비밀번호 찾기</button>
					<button type="button" id="loginBtn">로그인하기</button>
				</div>


			</form>
		</div>

	</div>



</div>


<script type="text/javascript">

$("#loginBtn").click(function() {
	window.location.href = "<%=request.getContextPath()%>/index.jsp?workgroup=client&work=client_login";
});

$("#findPWBtn").click(function() {
	window.location.href = "<%=request.getContextPath()%>/index.jsp?workgroup=client&work=client_find_PW";
});










/* email로 ID 찾기 */
function findByEmail() {
	
	var name=$("#name").val();
	
	var email="";
	var emailid=$("#email").val();
	var domain=$("#domainSel").val();
	
	if(domain=="직접입력") {
		email = emailid;
	} else {
		email = emailid+"@"+domain;
	}
	
	$.ajax({
		type: "get",
		url: "<%=request.getContextPath()%>/client/client_dup_check.jsp",
		data: "email="+email+"&name="+name,
		dataType: "xml",
		success: function(xmlDoc) {
			var code=$(xmlDoc).find("code").text();
			if(code == "possible") {
				$("#emailCheckResult").val("true");
				$("#emailOkMsg").css("display","block");
			} else {
				$("#emailCheckResult").val("false");
				$("#emailDupMsg").css("display","block");
			}
		},
		error: function(xhr) {
			alert("에러코드 = "+xhr.status);
		}
	});
}


</script>

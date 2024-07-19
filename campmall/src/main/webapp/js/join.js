/* ID_input focus */
$("#id").focus();

/* 우편번호 기능 */
$("#zip_btn").click(function() {
	new daum.Postcode({
		oncomplete: function(data) {
			$("#zipCode").val(data.zonecode);
			$("#address1").val(data.address);
		}
	}).open();
});


/* 입력 시 에러 검출 */
var idReg=/^[a-zA-Z]\w{5,19}$/g;
$("#id").blur(function() {
	
	$("#idMsg").css("display", "none");
	$("#idRegMsg").css("display", "none");
	$("#idCheckMsg").css("display", "none");
	
	if($("#id").val()=="") {
		$("#idMsg").css("display","block");

	} else if(!idReg.test($("#id").val())) {
		$("#idRegMsg").css("display","block");

	} else if($("#idCheckResult").val()=="0") {
		$("#idCheckMsg").css("display","block");
	}
});


var passwdReg=/^(?=.*[a-zA-Z])(?=.*[0-9])(?=.*[~!@#$%^&*_-]).{6,20}$/g;
$("#passwd").blur(function() {
	
	$("#passwdMsg").css("display", "none");
	$("#passwdRegMsg").css("display", "none");
	
	if($("#passwd").val()=="") {
		$("#passwdMsg").css("display","block");

	} else if(!passwdReg.test($("#passwd").val())) {
		$("#passwdRegMsg").css("display","block");
	} 
});


$("#repasswd").blur(function() {
	
	$("#repasswdMatchMsg").css("display", "none");
	
	if($("#repasswd").val()=="") {
		$("#repasswdMsg").css("display","block");

	} else if($("#passwd").val()!=$("#repasswd").val()) {
		$("#repasswdMatchMsg").css("display","block");
	}
});


$("#name").blur(function() {

	$("#nameMsg").css("display", "none");

	if($("#name").val()=="") {
		$("#nameMsg").css("display","block");
	}
});


$("#email").blur(function() {
	
	$("#emailMsg").css("display", "none");

	if($("#email").val()=="") {
		$("#emailMsg").css("display","block");
	}
});








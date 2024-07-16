$("#id").focus();

$("#zip_btn").click(function() {
	new daum.Postcode({
		oncomplete: function(data) {
			$("#zip_input1").val(data.zonecode);
			$("#zip_input2").val(data.address);
		}
	}).open();
});
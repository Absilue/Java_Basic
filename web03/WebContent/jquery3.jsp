<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-3.7.1.js"></script>
<script type="text/javascript">
	$(function() {
		$.ajax({
			url : "jquery0.jsp",
			success : function() {
				alert("ajax성공!!----1")
			} //success
		}) //ajax

		$.ajax({
			url : "jquery1.jsp",
			success : function() {
				alert("ajax성공!!----2")
			} //success
		}) //ajax
		
		$.ajax({
			url : "jquery4.jsp",
			success : function(result) {
				alert("ajax성공!!----3")
				alert(result)
			} //success
		}) //ajax
	})//$
</script>
</head>
<body>

</body>
</html>
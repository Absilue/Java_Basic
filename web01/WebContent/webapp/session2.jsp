<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    	int t = (int)session.getAttribute("tennis");
    	int s = (int)session.getAttribute("swin");
    	// Object --> (int) --> int
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>수강료 계산</h3>
	<hr color = "red">
	테니스와 수영 수강료 합계는 <%= t + s %>원입니다
</body>
</html>
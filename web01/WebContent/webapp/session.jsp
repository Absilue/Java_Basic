<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    		session.setAttribute("tennis", 10000);
    		session.setAttribute("swin", 20000);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>세션 만들기</h3>
	<hr color = "red">
	<a href="session2.jsp">세션 보기</a>
</body>
</html>
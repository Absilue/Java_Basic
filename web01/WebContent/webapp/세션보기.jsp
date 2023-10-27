<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
   		out.print(session.getAttribute("name")+"<br>");
   		out.print(session.getAttribute("age")+"<br>");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<hr color = "blue">
	세션에 저장된 name값은 ${name}<br>
	세션에 저장된 age값은 ${age}<br>	
	내년 age값은 ${age+1}<br>
</body>
</html>
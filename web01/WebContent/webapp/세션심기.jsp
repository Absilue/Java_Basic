<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    	session.setAttribute("name", "hong");
    	session.setAttribute("age", "100");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	세션값을 서버에 저장했습니다
	<hr color = "blue">
	<a href=세션보기.jsp>세션 보기</a>
</body>
</html>
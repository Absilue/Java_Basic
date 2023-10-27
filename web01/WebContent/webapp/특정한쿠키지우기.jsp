<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    		Cookie c1 = new Cookie("name","Choi");
    		c1.setMaxAge(0);
    		// MaxAge() --> ()안의 시간만큼 해당 변수가 살아있음
    		response.addCookie(c1);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>쿠키가 삭제되었습니다</h3>
	<a href="쿠키보기.jsp">쿠키보기</a>
</body>
</html>
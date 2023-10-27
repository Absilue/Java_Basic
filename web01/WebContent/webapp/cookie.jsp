<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <% 	//쿠키 만들기
    		Cookie c1 = new Cookie("apple", "1000");
    		Cookie c2 = new Cookie("melon", "2000");
    		Cookie c3 = new Cookie("ice", "3000");
    		
    		//쿠키 심기
    		response.addCookie(c1);
    		response.addCookie(c2);
    		response.addCookie(c3);
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>쿠키 만들기</h3>
	<hr color = "green">
	<a href="cookie2.jsp">쿠키 보기</a>
</body>
</html>
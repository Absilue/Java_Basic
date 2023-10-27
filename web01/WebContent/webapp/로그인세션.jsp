<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%	// 로그인 성공한 경우 id를 세션으로 설정
    		// id가 세션으로 설정되어있으면 로그인 성공으로 판단
    		session.setAttribute("id", "apple");
    		
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="news.jsp">뉴스로 링크</a>
	<a href="mail.jsp">메일로 링크</a>
	<a href="shopping.jsp">쇼핑으로 링크</a>
</body>
</html>
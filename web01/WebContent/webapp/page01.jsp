<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
     <% 	//쿠기 만들기
    		Cookie c1 = new Cookie("like", "운동<br>");
    		Cookie c2 = new Cookie("field", "축구");
    		// Cookie는 이름 + 값이 필요함
    		// Cookie의 이름과 값에는 공백을 넣으면 X
    		// Cookie의 타입은 반드시 String만 가능
    		
    		// HttpServletResponse response = new HttpServletResponse();
    		// 서버 ------> 브라우저
    		response.addCookie(c1);
    		response.addCookie(c2);
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>브라우저에 쿠키 넣기</h3>
	<a href="page02.jsp">쿠키보기</a>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%	//HttpSession session = new HttpSession();
    		session.setAttribute("view", 0);
    		// value 위치의 타입이 Object이라고 설정되어 있음
    		// integer(int) --> Object로 바뀌어서 들어감
    		// Int(작은 개념) -----> Object(큰 개념)
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	세션 설정 시작 <br>
	<a href="세션설정보기.jsp">세션 설정 보기</a>
</body>
</html>
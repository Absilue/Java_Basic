<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <% 	int view = (int)session.getAttribute("view");
    		// 세션설정에서 Object 자리에 들어간 int 0은 
    		// Object(큰 개념) -----> Int(작은 개념)이므로 강제로 변수타입을 할당해서 크기를 잘라줘야 함
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	저장된 세션값은 <%=view %> <br>
	<a href=조회수증가.jsp>조회 수 증가</a>
	</body>
</html>
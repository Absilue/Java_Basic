<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <% 	//쿠기 만들기
    	Cookie[] cookies = request.getCookies();
		String name = "";
		String value = "";
		int sum = 0;
		for(Cookie c : cookies){
			if(c.getName().equals("apple") || c.getName().equals("ice")){
				out.print(c.getName() + " " +c.getValue() + "<br>");
				sum = sum + Integer.parseInt(c.getValue());
				// 쿠키 값의 데이터 타입은 String타입
				// 쿠키 값으로 계산을 할 목적이면 int로 데이터 타입을 변환시켜야 함
					}
				}
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>가격 계산하기</h3>
	<hr color = "green">
	사과와 아이스크림의 가격의 합은 <%=sum %>원입니다<br>
</body>
</html>
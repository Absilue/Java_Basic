<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
   <%		// 브라우저에 심어(저장)놓은 쿠키들을 한번에 가져옴
   			// 브라우저 ----> 서버 (Request)
   			Cookie[] cookies = request.getCookies();
   			// {cookie1, cookie2, cookie3} + length(3)
   			// cookie = name + value
   			
   			// String name; 으로 사용하면 안되는 이유
   			// ==> 서블릿으로 변환될 때 service()안으로 코드가 다 들어가서 생성됨
   			// 	   name이 service()안에 들어가 있으므로 초기값 지정이 안된 상태 
   			//		   쓰레기값이 존재할 수 있으므로 연산이나 변수 사용에서 오류 발생
   			
   			String name = "";
   			String value = "";
   			// 공백을 넣어 초기값을 설정
   			
   			// 누적시킬 변수는 반복문 외부에서 설정하기
   			//  반복문 내부에서 만들면 변수가 계속 초기화됨
   			for(Cookie c : cookies){
					String name2 = c.getName();
					if(!name2.equals("JSESSIONID")){
   					name = name + " " + c.getName();
   					// name 데이터를 누적
   					value = value + " " + c.getValue();
   					// value 데이터를 누적
   					out.print(c.getName() + " " +c.getValue());
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
	쿠키의 개수는 <%=cookies.length%>개 <br>
	쿠키의 이름은 <%=name %> <br>
	쿠키의 값은 <%=value %> <br>
	<a href="특정한쿠키지우기.jsp">특정한 쿠키 지우기</a>
</body>
</html>
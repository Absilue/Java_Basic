<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
     		String id = request.getParameter("id");
     		String pw = request.getParameter("pw");
     		
     		String id2 = "apple";
     		String pw2 = "1234";
     		// id와 id2가 동일하고 pw와 pw2가 동일한지 비교
     		// 모두 동일하면 id만 세션으로 잡음
     		// 둘중 하나라도 틀리면 다시 로그인하도록 유도
     		if(id.equals(id2) && pw.equals(pw2)){
     			session.setAttribute("id", "apple");
     			// String id = "apple";
     			// 위의 코드로 넣을경우 해당 jsp이외에서 값을 불러오는게 불가
     			
     			out.print("<h3>로그인 성공</h3>");
     		}else{
     			out.print("<h3>로그인 실패</h3>");
     			out.print("다시 로그인해주세요<br>");
     			out.print("<a href=네이버로그인.jsp>로그인 페이지로 되돌아가기</a>");
     			
     		}
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>
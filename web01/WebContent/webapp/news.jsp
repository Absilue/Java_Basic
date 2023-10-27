<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%	// 뉴스 댓글을 쓸 때, 로그인 했을 때와 로그인 하지 않았을 때의 화면이 다름
    		// 로그인 했을 때, 안했을 때 판단을 세션에 id가 저장되어 있는지, 아닌지로 확인해서 판단
    		if(session.getAttribute("id") == null){
    			// id란 이름으로 저장된 세션이 없는 경우
    			out.print("로그인이 되어있지 않습니다 <br>");
    			out.print("먼저 로그인을 해주세요 <br>");
    			out.print("로그인 아이디 : <input name = id>");
    		}else{
    			// id란 이름으로 저장된 세션이 있는 경우
    			out.print(session.getAttribute("id") + "님이 로그인 했습니다");
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
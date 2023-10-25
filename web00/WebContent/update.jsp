<%@page import="bean.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
       <% // 1) form안에 입력한 데이터 받아서 저장
    	  String id = request.getParameter("id");
    	  String tel = request.getParameter("tel");

    	  // 2) 받은 데이터를 DAO로 전달
		  MemberDAO dao = new MemberDAO();
    	  // 객체 생성시 오타방지를 위해 자동완성 기능 사용
    	  
    	  int result = dao.update(tel, id);
    	  String resultText = "회원정보 수정 실패";
    	  if(result == 1){
    		  resultText ="회원정보 수정 성공";
    	  }
    	  
		  // 3) 결과를 html로 만들기 ==> html
    %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor = "orange">
	<h5>회원정보 수정 결과를 확인해주세요</h5>
	<hr color = "blue">
	
	<%= resultText %> <br>
	<br>
</body>
</html>
<%@page import="bean.MemberVO"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.If"%>
<%@page import="bean.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
        <!-- jsp에서 해야하는 작업 3가지
    		1) form안에 입력한 데이터 받아서 저장 ==> java
    		2) 받은 데이터를 DAO로 전달 ==> java
    		3) 결과를 html로 만들기 ==> html
    -->
    
    <% // 1) form안에 입력한 데이터 받아서 저장
    	  String id = request.getParameter("id");

    	  // 2) 받은 데이터를 DAO로 전달
		  MemberDAO dao = new MemberDAO();
    	  // 객체 생성시 오타방지를 위해 자동완성 기능 사용
    	  
    	 MemberVO bag = dao.one(id);
    	  // 자동 import : 클릭한 후 ctrl + shift + m
    	  
		  // 3) 결과를 html로 만들기 ==> html
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor = "orange">
	<h5>회원검색 결과를 확인해주세요</h5>
	<hr color = "blue">
	
	검색한 계정의 아이디는 <%= bag.getId() %> <br>
	검색한 계정의 비밀번호는 <%= bag.getPw() %> <br>
	검색한 계정의 이름은 <%= bag.getName() %> <br>
	검색한 계정의 전화번호는 <%= bag.getTel() %> <br>
	<hr>
</body>
</html>
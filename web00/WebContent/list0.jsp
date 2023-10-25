<%@page import="bean.MemberVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="bean.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    MemberDAO dao = new MemberDAO();
    ArrayList<MemberVO> list = dao.list();
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor = "orange">
 <!-- 반복문(for문) 필요  -->
 <h5>회원검색 결과를 확인해주세요</h5>
 <hr color = "blue">
 <% // 스크립트 릿 
 	for(MemberVO bag : list){  %>
	검색한 계정의 아이디는 <%= bag.getId() %> <br>
	검색한 계정의 비밀번호는 <%= bag.getPw() %> <br>
	검색한 계정의 이름은 <%= bag.getName() %> <br>
	검색한 계정의 전화번호는 <%= bag.getTel() %> <br>
 <hr>
 <% } %>
</body>
</html>
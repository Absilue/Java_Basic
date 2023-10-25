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
<style>
td{
	width: 150px;
	background: aqua;
	text-align: center;
}
</style>
</head>
<body bgcolor = "orange">
 <!-- 반복문(for문) 필요  -->
 <h5>회원검색 결과를 확인해주세요</h5>
 <hr color = "blue">
 
<table border = "1" align = "center">
	<tr>
		<td>아이디</td>
		<td>비밀번호</td>
		<td>이름</td>
		<td>전화번호</td>
	</tr>

 <% // 스크립트 릿 
 	for(MemberVO bag : list){  %>
	<tr>
		<td><%= bag.getId() %></td>
		<td><%= bag.getPw() %></td>
		<td><%= bag.getName() %></td>
		<td> <%= bag.getTel() %></td>
	</tr>
	
 <% } %>
 </table>
</body>
</html>
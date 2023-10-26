<%@page import="bean.BbsDAO"%>
<%@page import="bean.BbsVO"%>
<%@page import="bean.MemberVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="bean.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    BbsDAO dao = new BbsDAO();
    ArrayList<BbsVO> list = dao.list();
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
td{
	width: 150px;
	color: white;
	background: maroon;
	text-align: center;
}
</style>
</head>
<body bgcolor = "aqua">
 <!-- 반복문(for문) 필요  -->
 <h5>게시글 검색 결과를 확인해주세요</h5>
 <hr color = "red">
 
<table border = "1" align = "center">
	<tr>
		<td>번호</td>
		<td>제목</td>
		<td>내용</td>
		<td>작성자</td>
	</tr>

 <% // 스크립트 릿 
 	for(BbsVO bag : list){  %>
	<tr>
		<td><%= bag.getNo() %></td>
		<td><a href="one2.jsp?no=<%= bag.getTitle() %>"><%= bag.getTitle() %></a>
		</td>
		<td><%= bag.getContent() %></td>
		<td><%= bag.getWriter() %></td>
	</tr>
	
 <% } %>
 </table>
</body>
</html>
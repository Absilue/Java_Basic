<%@page import="bean.ProductVO"%>
<%@page import="bean.ProductDAO"%>
<%@page import="com.sun.org.apache.bcel.internal.generic.NEW"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    ProductDAO dao = new ProductDAO();
    ArrayList<ProductVO> list = dao.list();
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
body {
	background-color: yellow; 
}

button {
	width: 100px;
	height: 50px;
	color: white;
	background: olive;
}

td{
	width: 150px;
	background: silver;
	text-align: center;
}
</style>
</head>
<body bgcolor = "yellow">
 <!-- 반복문(for문) 필요  -->
 <h5>제품 검색 결과를 확인해주세요</h5>
 <hr color = "green">
 
<table border = "1" align = "center">
	<tr>
		<td>제품 코드</td>
		<td>제품명</td>
		<td>제품 내용</td>
		<td>제품 가격</td>
		<td>제조회사</td>
		<td>제품 이미지</td>
	</tr>

 <% // 스크립트 릿 
 	for(ProductVO bag : list){  %>
	<tr>
		<td><%= bag.getId() %></td>
		<td><%= bag.getName() %></td>
		<td><%= bag.getContent() %></td>
		<td><%= bag.getPrice()%></td>
		<td><%= bag.getCompany()%></td>
		<td><img src="img/<%= bag.getImg() %>"  width = "100" height = "100"></td>
	</tr>
	
 <% } %>
 </table>

</body>
</html>
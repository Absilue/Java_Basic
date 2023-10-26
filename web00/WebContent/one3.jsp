<%@page import="org.apache.jasper.tagplugins.jstl.core.If"%>
<%@page import="bean.ProductVO"%>
<%@page import="bean.ProductDAO"%>
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
		  ProductDAO dao = new ProductDAO();
    	  // 객체 생성시 오타방지를 위해 자동완성 기능 사용
    	  
    	 ProductVO bag = dao.one(id);
    	  // 자동 import : 클릭한 후 ctrl + shift + m
    	  
		  // 3) 결과를 html로 만들기 ==> html
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
td{
	text-align: center;
}
</style>
</head>
<body bgcolor = "yellow">
	<h5>제품검색 결과를 확인해주세요</h5>
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
	
	<tr>
		<td><%= bag.getId() %></td>
		<td><%= bag.getName() %></td>
		<td><%= bag.getContent() %></td>
		<td><%= bag.getPrice()%></td>
		<td><%= bag.getCompany()%></td>
		<td><img src="img/<%= bag.getImg() %>"  width = "100" height = "100"></td>
	</tr>
	
 </table>

</body>
</html>
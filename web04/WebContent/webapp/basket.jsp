<%@page import="bean.ProductDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <jsp:useBean id="bag" class="bean.ProductDTO"></jsp:useBean>
    <jsp:setProperty property="*" name="bag"/>
    <%
    //bag에 데이터가 들어가 있지 않으면 장바구니에 추가하지 말아라!
    	ArrayList<ProductDTO> list = null;
    	if(bag.getId() != null) { //a, location.href할 때 가방에 비어있는 데이터가 들어가서!
	    	if(session.getAttribute("basket") == null){
		    	list = new ArrayList<>(); //{}
	    	}else{
	    		list = (ArrayList<ProductDTO>)session.getAttribute("basket");//list(작) -- Object(큰)
	    	}
	    	list.add(bag);//[bag]
	    	session.setAttribute("basket", list);//Object(큰) -- list(작)
    	}else{ //a, location.href로 호출했을때 기존의장바구니 리스트가 있으면 리스트를 가지고 와라!
    		if(session.getAttribute("basket") != null){
    			list = (ArrayList<ProductDTO>)session.getAttribute("basket");
    		}
    	}
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/project.css">
<!-- Latest compiled and minified CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

<!-- Latest compiled JavaScript -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<div id="total">
	<div id="top">
		<jsp:include page="top.jsp"></jsp:include> <!-- 액션태그 -->
	</div>
	<div id="top2">
		<jsp:include page="top2.jsp"></jsp:include>
	</div>
	<div id="center">
	<% if(session.getAttribute("basket") != null ) { %>
	<br>장바구니 개수: <%= list.size() %>개 <br>
			<%= session.getAttribute("id") %>님 환영합니다.
			<a href="logout.jsp">
				<button class="btn btn-outline-danger">로그아웃</button>
			</a>
		<% } 
			if(session.getAttribute("basket") != null){
		%>
			<hr>
			<table class="table tablehover">
			<tr>
				<td>아이디</td>
				<td>물건이름</td>
				<td>가격</td>
				<td>주문하기</td>
			</tr>
			<% for(ProductDTO bag2: list) {%>
			<tr>
				<td><%= bag2.getId() %></td>
				<td><%= bag2.getTitle() %></td>
				<td><%= bag2.getPrice()%></td>
				<td><button>주문하기</button></td>
			</tr>
			<%}//for %>
			</table>
		<%}//if %>
	</div>
</div>
</body>
</html>
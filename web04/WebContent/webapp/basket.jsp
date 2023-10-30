<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
	<div id="total"></div>
		<div id="top"><jsp:include page="top.jsp"></jsp:include></div>
		<div id="top2"><jsp:include page="top2.jsp"></jsp:include></div>
		<div id="center">
		<br>
			<%
			if (session.getAttribute("id") != null) {
			%>
			<span class="alert alert-success"> 
			<%=session.getAttribute("id")%>님 환영합니다. </span>&nbsp;&nbsp;&nbsp; 
			<a href="insert.jsp">
				<button  class="btn btn-danger">장바구니</button>
			</a> 
			<a href="logout.jsp">
				<button class="btn btn-outline-danger">로그아웃</button>
			</a>			
		<% } %>
		</div>
</body>
</html>
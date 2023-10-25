<%@page import="bean.BbsVO"%>
<%@page import="bean.BbsDAO"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.If"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
        <!-- jsp에서 해야하는 작업 3가지
    		1) form안에 입력한 데이터 받아서 저장 ==> java
    		2) 받은 데이터를 DAO로 전달 ==> java
    		3) 결과를 html로 만들기 ==> html
    -->
    
    <% // 1) form안에 입력한 데이터 받아서 저장
    	  String no = request.getParameter("no");

    	  // 2) 받은 데이터를 DAO로 전달
		  BbsDAO dao = new BbsDAO();
    	  // 객체 생성시 오타방지를 위해 자동완성 기능 사용
    	  
    	  BbsVO bag = dao.one(Integer.parseInt(no));

		  // 3) 결과를 html로 만들기 ==> html
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
	<h5>게시글 검색 결과를 확인해주세요</h5>
	<hr color = "red">
	<br>
	
		<table border="1">
		<tr>
			<!-- 가로 한줄 -->
			<td class = "left">번호 : </td>
			<td>
				<%= bag.getNo() %>
			</td>
			<!-- 세로 한줄 -->
		</tr>
		
		<tr>
			<!-- 가로 한줄 -->
			<td class = "left">제목 : </td>
			<td>
				<%= bag.getTitle() %>
			</td>
			<!-- 세로 한줄 -->
		</tr>
		
		<tr>
			<!-- 가로 한줄 -->
			<td class = "left">내용 : </td>
			<td>
				<textarea cols="100" rows= "15" name = "content" ><%= bag.getContent() %></textarea>
			</td>
			<!-- 세로 한줄 -->
		</tr>
		
	
		<tr>
			<!-- 가로 한줄 -->
			<td class = "left">작성자 : </td>
			<td>
				<%= bag.getWriter() %>
			</td>
			<!-- 세로 한줄 -->
		</tr>
	</table>
</body>
</html>
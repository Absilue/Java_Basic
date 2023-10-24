<%@page import="bean.BbsVO"%>
<%@page import="bean.BbsDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- jsp에서 해야하는 작업 3가지
    		1) form안에 입력한 데이터 받아서 저장 ==> java
    		2) 받은 데이터를 DAO로 전달 ==> java
    		3) 결과를 html로 만들기 ==> html
    -->
    
    <% // 1) form안에 입력한 데이터 받아서 저장
    	  String title = request.getParameter("title");
    	  // input안에 있는 데이터를 title로 저장
    	  String content = request.getParameter("content");
    	  String name = request.getParameter("name");
    	  
    	  // 2) 받은 데이터를 DAO로 전달
		  BbsDAO dao = new BbsDAO();
    	  
    	  BbsVO bag = new BbsVO();
    	  bag.setTitle(title);
    	  bag.setContent(content);
    	  bag.setWriter(name);
    	  
    	  dao.insert(bag);

		  // 3) 결과를 html로 만들기 ==> html
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor = "aqua">
	<h5>입력한 게시글 정보를 확인해주세요</h5>
	<hr color = "blue">

	게시물이 등록되었습니다 <br>
	<br>
	작성한 게시글 제목은 <%= title %> <br> <!-- id 변수에 있는 것을 프린트 -->
	작성한 게시글 내용은 <%= content %> <br>
	게시글 작성자 이름은 <%= name %> <br>
</body>
</html>
<%@page import="org.apache.jasper.tagplugins.jstl.core.If"%>
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
    	  
    	  int result = dao.delete(id);
    	  String resultText = "제품 등록 취소 실패";
    	  if(result == 1){
    		  resultText ="제품 등록 취소 성공";
    	  }
    	  
		  // 3) 결과를 html로 만들기 ==> html
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor = "yellow">
	<h5>제품 등록 취소 결과를 확인해주세요</h5>
	<hr color = "green">
	
	<%= resultText %> <br>
	<br>
</body>
</html>
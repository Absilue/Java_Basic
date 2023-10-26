<%@page import="bean.ProductVO"%>
<%@page import="bean.ProductDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
       <% // 1) form안에 입력한 데이터 받아서 저장
    	  String id = request.getParameter("id");
    	  String name = request.getParameter("name");
    	  String content = request.getParameter("content");
    	  String price = request.getParameter("price");
    	  String company = request.getParameter("company");
    	  String img = request.getParameter("img");

    	  // 2) 받은 데이터를 DAO로 전달
		  ProductDAO dao = new ProductDAO();
    	  // 객체 생성시 오타방지를 위해 자동완성 기능 사용
    	  ProductVO bag = new ProductVO();
    	  
    	  bag.setId(id);
    	  bag.setName(name);
    	  bag.setContent(content);
    	  bag.setPrice(Integer.parseInt(price));
    	  bag.setCompany(company);
    	  bag.setImg(img);
    	  
    	  int result = dao.update(bag);
    	  String resultText = "제품정보 수정 실패";
    	  if(result == 1){
    		  resultText ="제품정보 수정 성공";
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
	<h5>제품정보 수정 결과를 확인해주세요</h5>
	<hr color = "green">
	
	<%= resultText %> <br>
	<br>
</body>
</html>
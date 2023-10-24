<%@page import="bean.ProductVO"%>
<%@page import="bean.ProductDAO"%>
<%@page import="bean.MemberVO"%>
<%@page import="bean.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- jsp에서 해야하는 작업 3가지
    		1) form안에 입력한 데이터 받아서 저장 ==> java
    		2) 받은 데이터를 DAO로 전달 ==> java
    		3) 결과를 html로 만들기 ==> html
    -->
    
    <% // 1) form안에 입력한 데이터 받아서 저장
    	  // 자바코드를 쭉 적으면 됨 ==> 스크립트 릿(let, 릿)
    	  // 미리 톰캣에서 자주 사용하는 부품은 new를 이용해서 객체를 만들어놨음
    	  // 미리 만들어져서 제공되는 객체(부품) ==> 내장된 객체
    	  // 클라이언트로 부터 데이터를 받아오는 객체 ==> request
    	  
    	  String id = request.getParameter("id");
    	  // input안에 있는 데이터를 id로 저장
    	  String name = request.getParameter("name");
    	  String content = request.getParameter("content");
    	  String price = request.getParameter("price");
    	  String company = request.getParameter("company");
    	  String img = request.getParameter("img");
    	  
    	  // 2) 받은 데이터를 DAO로 전달
		  // jsp = java + html이므로 new를 제대로 인식 X
		  ProductDAO dao = new ProductDAO();
    	  // 객체 생성시 오타방지를 위해 자동완성 기능 사용
    	  
    	  // bag 기능을 하는 DTO(VO)생성  --> 데이터 입력 
    	  ProductVO bag = new ProductVO();
    	  bag.setId(id);
    	  bag.setName(name);
    	  bag.setContent(content);
    	  int price2 = Integer.parseInt(price);
    	  bag.setPrice(price2);
    	  bag.setCompany(company);
    	  bag.setImg(img);
    	  // 전달받은 데이터가 20개라면 데이터를 받아주는 코드도 20줄이 필요
    	  // bag에 넣는 코드도 20줄이 필요하기때문에 코드가 너무 길어지는 단점이 존재
    	  // MemberVO bag;을 사용하면 한번에 처리 가능
    	  
    	  dao.insert(bag);
    	  
		  // 3) 결과를 html로 만들기 ==> html
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor = "yellow">
	<h5>입력한 제품정보를 확인해주세요</h5>
	<hr color = "green">
	
	제품 정보 입력이 완료되었습니다 <br>
	<br>
	입력한 제품 코드는 <%= id %> <br> <!-- id 변수에 있는 것을 프린트 -->
	입력한 제품명은 <%= name %> <br>
	입력한 제품 내용은 <%= content %> <br>
	입력한 제품 가격은 <%= price %> <br>
	입력한 제조회사는 <%= company %> <br>
	입력한 제품 이미지는 <%= img %> <br>
</body>
</html>
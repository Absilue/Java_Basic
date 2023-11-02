<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<!-- 입력한 값 받기 -->
	<%
	String id = request.getParameter("id");  //"root"
	
	String[] list = {"root", "admin", "hong"};
	
	String result = "사용가능!";
	
	for(String s : list){
		if(s.equals(id)){
			result = "중복된 id이므로 사용불가.";
			break;
		}
	}
	
	%>
	<%= result %>
	
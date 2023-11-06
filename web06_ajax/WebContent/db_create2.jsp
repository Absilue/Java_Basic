<%@page import="bean.CompanyDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>   
    <%
    	// 1. 브라우저로부터 넘어온 데이터를 받아서 dto를 만들어 dto에 넣음
    	// 액션태그 사용
    	// 2. dao 객체 생성해서 dto를 주면서 insert(dto) 요청
    %> 
    <jsp:useBean id="bag" class="bean.CompanyDTO"></jsp:useBean>
    <jsp:setProperty property="*" name="bag"/>  
    <%
    CompanyDAO dao = new CompanyDAO();
    int result  = dao.insert(bag);
    %>
    <%=result%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String money = request.getParameter("money");
	String choice = request.getParameter("choice");
	int money2 = Integer.parseInt(money);
	switch(choice){
		case "1" : money2 = money2 - 1000; break;
		case "2" : money2 = money2 + 1000; 
	}
%><%= money2 %>
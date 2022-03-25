<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome</title>
</head>
<body>
	<h1>Hello: 61.CNTT-CLC</h1>
	<%= new Date().toString()%>
	<%
		int a=3;
		int b=4;
		int c=a+b;
		//xuất ra trang web
		out.print(a);
		out.print("+" + b);
		out.print("= "+ c);
	%>
	<h1>
		Hết
	</h1>
</body>
</html>
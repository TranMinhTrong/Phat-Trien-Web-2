<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Hello JSP</h1>
	<h2>Scriplet</h2>
	<%
		int a=3;
		int b=4;
		int c= a+b;
		out.print(a);
		out.print("+"+b);
		out.print("="+c);
	%>
	<h2>
		<hr/>
		Hết
	</h2>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%!
	int tong(int a, int b){
	return a+b;
}

%>
<body>
	<h1>Hello JSP</h1>
	<h2>Scriplet</h2>
	<%
		int a=3;
		int b=4;
		int c= tong(a, b);
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
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="/resources/style.css" media="screen" />
</head>
<body>
	<h1>Tinh chu vi va dien tich tam giac</h1>
	<hr />
	<form action="TamGiacServerlet" method="post">
		a: <input type="text" name="a" placeholder="Canh a?" /> <br> <br>
		b: <input type="text" name="b" placeholder="Canh b?" /> <br> <br>
		c: <input type="text" name="c" placeholder="Canh c?" /> <br> <br>
		<input type="submit" formaction="TamGiacServerlet/chuvi" value="Tinh Chu Vi" /> 
		<input type="submit" formaction="dientich" value="Tinh Dien Tich" />
		<hr />
		<h2>${ message }</h2>
	</form>
</body>
</html>
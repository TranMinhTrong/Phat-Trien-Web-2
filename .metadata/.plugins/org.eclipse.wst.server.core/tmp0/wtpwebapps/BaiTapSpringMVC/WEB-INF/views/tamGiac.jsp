<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Tinh chu vi va dien tich tam giac</h1>
	<hr />
	<form action="TamGiacServLet" method="post">
		a: <input type="text" name="a" placeholder="Canh a?" /> <br> <br>
		b: <input type="text" name="b" placeholder="Canh b?" /> <br> <br>
		c: <input type="text" name="c" placeholder="Canh c?" /> <br> <br>
		<input type="submit" formaction="TamGiacServLet/chuvi"
			value="Tinh Chu Vi" /> <input type="submit" formaction="TamGiacServLet/dientich"
			value="Tinh Dien Tich" />
		<hr />
		<h2>${ message }</h2>
	</form>
</body>
</html>
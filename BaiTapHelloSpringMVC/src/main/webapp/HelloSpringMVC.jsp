<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Register New User</h1>
	<hr/>
	<form action="HelloSpringMVC" method="post">
		Ho va Ten: <input type="text" name="username"/><br/><br/>
		Lop: <input type="text" name="lop"/><br/><br/>
		Nam Sinh: <input type="text" name="birthday"/><br/><br/>
		Email: <input type="text" name="email"/><br/><br/>
		So Thich: <input type="radio" name="hobbies" value="Am Nhac"/> Music
		<input type="checkbox" name="hobbies" value="Xem Phim"/> Movie
		<input type="checkbox" name="hobbies" value="The Thao"/> Sports
		<input type="checkbox" name="hobbies" value="Shopping"/> Shopping <br/><br/>		
		Quoc Gia:
		<select name="country">
			<option value="VietNam">VietNam </option>
			<option value="lao">Lao </option>
			<option value="Cam">Cam </option>
			<option value="USA">USA </option>
		</select>
		<input type="submit" value="Register"/>
	</form>
</body>
</html>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Regiser New User name</h1>
	</hr>
	<form action="RegisterServelet" method="post">
		Username: <input type="text" name="username" /> </br> </br> 
		hobbies: 
		<input type="checkbox" name="hobbies" value="Music" /> Music <input
			type="checkbox" name="hobbies" value="shopping" /> Shopping <input
			type="checkbox" name="hobbies" value="sports" /> Sports <input
			type="checkbox" name="hobbies" value="swming" /> Swiming </br> </br> 
			
		Country:
		<select name="country">
			<option value="vn"> VietNam</option>
			<option value="us"> USA</option>
			<option value="jp"> Japan</option>
			<option value="lao"> Lao</option>
		</select></br>
		<input type="submit" value=" Register"/>
	</form>
</body>
</html>
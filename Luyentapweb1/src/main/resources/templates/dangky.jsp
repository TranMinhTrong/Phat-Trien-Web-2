<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
	integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2"
	crossorigin="anonymous">

<title>Register!</title>
</head>
<body>

	<main class="container">
		<header class="row">
			<div class="col">
				<div class="aler aler-succes">
					<h1>Dang Ki</h1>
				</div>

			</div>
		</header>
		<section class="row">
			<div class="col-7">
				<div class="col">
					<form action="RegisterServerlet" method="post">
						<div class="form-group">
							<label for="username">Ten Dang Nhap</label> <input type="text"
								id="username" name="username" class="form-control" />
						</div>
						<div class="form-group">
							<label for="password">Mat khau</label> <input type="password"
								id="password" name="password" class="form-control" />
						</div>
						<div class="form-group">
							<label for="gender">Gioi Tinh</label>
							<div class="form-check form-check-inline">
								<input type="radio" class="form-check-input" id="genderM"
									name="gender" /> <label for="genderM">Nam</label>
							</div>
							<div class="form-check form-check-inline">
								<input type="radio" class="form-check-input" id="genderf"
									name="gender" /> <label for="genderf">Nu</label>
							</div>
						</div>
						<div class="form-group">
							<div class="form-check">
								<input class="form-check-input" type="checkbox" id="married" />
								<label for="married"> Tinh trang hon nhan</label>
							</div>
						</div>
						<div class="form-group">
							<label for="nationality"> Quoc tich</label> <select
								name="nationlity" id="nationality" class="form-control">
								<option value="vn">Viet Nam</option>
								<option value="usa">My</option>
								<option value="jp">Nhat ban</option>
							</select>
						</div>
						<div class="form-group">
							<label for="favorites"> So thich:</label>
							<div class="form-check form-check-inline">
								<input name="favorites" id="favorites" type="checkbox"
									class="form-check-input" value="Read" /> <label
									for="favorites">Doc sach</label>
							</div></br>
							<div class="form-check form-check-inline">
								<input name="favorites" id="favorites" type="checkbox"
									class="form-check-input" value="shopping" /> 
									<label for="shopping">Shopping</label>
							</div>
							<div class="form-check form-check-inline">
								<input name="favorites" id="favorites" type="checkbox"
									class="form-check-input" value="music" /> 
									<label for="favorites">Music</label>
							</div>
							<div class="form-check form-check-inline">
								<input name="favorites" id="favorites" type="checkbox"
									class="form-check-input" value="swimming" /> 
									<label for="favorites">Swimming</label>
							</div>
						</div>
						<div class="form-group">
							<label for="note">Ghi chu:</label>
							<textarea rows="3" cols="" name="note" id="note"
								class="form-control"></textarea>
						</div>
						</hr>
						<button type="submit" class="btn btn-primary">Dang Ky</button>
					</form>
				</div>
			</div>
			
			<div class="col-5">
			<h3>Thong tin da duoc dang ky</h3>
				<ul>
					<li>User name: ${username }</li>
					<li> Mat khau: ${password}</li>
				</ul>
			</div>
		</section>

	</main>


	<!-- Option 1: jQuery and Bootstrap Bundle (includes Popper) -->
	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
		integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx"
		crossorigin="anonymous"></script>


</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>

	<a href="#">ENTRAR EN SESIÓN</a>
	<form method="post" >
		<p>
			<label for="usuario" class="form-label">USUARIO</label>
			<input type="text" name="usuario" class="form-label" required>

		</p>
		<p>
			<label for="password" class="form-label">CONTRASEÑA</label>
			<input type="text" name="password" class="form-label" required>
		
		</p>
			<input type="submit" value="LOGIN" class="btn btn-primary">
		
	</form>
</body>
</html>
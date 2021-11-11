<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post">
	<p>
		<label for="nombre" class="form-label">Nombre:</label>
		<input type=text name="nombre" class="form-label" required>
	</p>
	
	<p>
		<label for="apellidos" class="form-label">Apellidos:</label>
		<input type=text name="apellidos" class="form-label" required>
	</p>
	
	<p>
		<label for="correo" class="form-label">Correo:</label>
		<input type=text name="correo" class="form-label" required>
	</p>

	<p>
		<input type="radio" name="curso" value="1º" required>
		<label for="1º" class="form-label">1º</label>
		
		<input type="radio" name="curso" value="2º" required>
		<label for="2º" class="form-label">2º</label>
	</p>
	
	<p>
		DAW:<input type="checkbox" name="modulo" value="DAW">
		Interfaz:<input type="checkbox" name="modulo" value="Interfaz">
		Servidor:<input type="checkbox" name="modulo" value="Servidor">
		Cliente:<input type="checkbox" name="modulo" value="Cliente">

	</p>
		<input type="submit" name="matricular" value="MATRICULAR">
	</form>

</body>
</html>
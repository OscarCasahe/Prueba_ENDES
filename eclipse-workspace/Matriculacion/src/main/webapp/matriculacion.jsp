<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%if(!session.isNew() && session.getAttribute("usuario")!=null && (session.getAttribute("usuario")).equals("usuario")){ %>
	
	<a href="Logout"><input type="submit" value="SALIR"</a>
	
	<%}else{ %>
		<form method="post">
		Usuario: <input type="text" name="usuario" required>
		Contraseña: <input type="password" name="password" required>
		<input type="submit" name="entrar" value="ENTRAR">
		</form>
	<%}%>
</body>
</html>
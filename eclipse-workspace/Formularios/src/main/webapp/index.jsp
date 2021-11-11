<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="<%=request.getContextPath()%>/Formularios">
		<p>
			<label for="simple">Campo de formulario simple</label>
			<input type="text" name="simple" id="A"></br>
			<input type="submit" value="enviar">
		</p>
	</form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insertar Product Line</title>
</head>
<body>

	<div class="container mt-5">
		<div class="row justify-content-center">
			<div class="col-6 mt-5">
				<form method="post">
					<label for="pl" class="form-label">ProductLine</label>
    				<input name="pl" value="productline" type="text" class="form-control" id="pl">
    				<label for="td" class="form-label">Text Description</label>
    				<input name="td" value="textDescription" type="text" class="form-control" id="td" >
    				<label for="hd" class="form-label">Html Description</label>
    				<input name="hd" value="textHtml" type="date" class="form-control" id="hd">

    				<input type="submit" value="Insertar" class="btn btn-primary w-100 mt-5">
				</form>
			
			</div>
		</div>
		
	</div>

</body>
</html>
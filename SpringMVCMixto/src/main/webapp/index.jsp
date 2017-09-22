<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">
<title>Insert title here</title>
</head>
<body>
	<form:form action="enviar" method="post">
		<div class="form-group">
			<fieldset>
				<div>
					<label for="nombres">Nombres</label> <input id="nombres"
						name="nombres" type="text" class="form-control" />
				</div>
				<div>
					<label for="apellidos">Apellidos</label> <input id="apellidos"
						name="apellidos" type="text" class="form-control" />
				</div>
				<div>
					<input type="submit" class="btn btn-primary" value="Aceptar" />
				</div>
			</fieldset>
		</div>
	</form:form>
</body>
</html>
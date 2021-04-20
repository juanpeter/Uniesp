<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Página de login</title>
</head>
<body>
	<div align="center">
		<h2>Login Usuário</h2>
		<br>
		<form action="loginServlet" method="post">
		
			<label for="email">Email</label>
			<input id="email" name="email" type="email" placeholder="Informe seu e-mail"/>
			<br>
			<br>
			<label for="password">Senha</label>
			<input id="password" name="password" type="password" placeholder="Informe sua senha"/>
			<br>
			<input type="submit" value="Login" id="btn-login"/>
		</form>
	</div>
</body>
</html>
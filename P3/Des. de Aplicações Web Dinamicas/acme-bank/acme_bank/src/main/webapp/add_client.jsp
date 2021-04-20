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
		<h2>Cadastrar Usuário</h2>
		<br>
		<form action="clientServlet" method="post">
		
			<label for="name">Name</label>
			<input id="name" name="name" type="text" placeholder="Informe o seu nome"/>
			<br>
			<br>
			<label for="email">E-mail</label>
			<input id="email" name="email" type="email" placeholder="Informe o seu E-mail"/>
			<br>
			<br>
			<label for=phone">Telefone</label>
			<input id="phone" name="phone" type="text" placeholder="Informe seu telefone"/>
			<br>
			<br>
			<input type="submit" value="Cadastrar" id="btn-adicionar-cliente"/>
		</form>
	</div>
</body>
</html>
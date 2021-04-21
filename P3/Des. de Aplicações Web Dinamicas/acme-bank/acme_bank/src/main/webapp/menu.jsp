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
		<% String user = (String) request.getAttribute("user");%>
		<h2>Seja bem vindo <%=user %></h2>
		<p>Selecione uma opção</p>
		<br>
		<a href="add_client.jsp"><button>Adicionar Cliente</button></a>
		<form action="clientListServlet" method="get">
			<button type="submit" >Listar Clientes</button>
		</form>
	</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Página de login</title>
</head>

<style>
table {
  border-collapse: collapse;
  width: 100%;
}

td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}

tr:nth-child(even) {
  background-color: #dddddd;
}
</style>

<body>
	<div align="center">
		<h2>Lista de clientes</h2>
		<br>
		<table>
		  <tr>
		    <th>Id</th>
		    <th>Nome</th>
		    <th>Email</th>
		    <th>Phone</th>
		    <th>Ações</th>
		  </tr>
 			<c:forEach var="client" items="${listaClientes}">
			  <tr>
				<td>${client.id}</td>
				<td>${client.name}</td>
				<td>${client.email}</td>
				<td>${client.phone}</td>
				<td>
				<form action="clientDeleteServlet" method="post">
					<button type="submit" name="idCliente" value="${client.id}">Deletar</button></td>
				</form>
			  </tr>
			</c:forEach>
		 </table>
	</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sucesso</title>
</head>
<body>
<%-- <% String user = (String) request.getAttribute("user"); %>
	<div align="center">
		<p align="center">Seja bem vindo, Sr. <%=userl %></p>
	</div> --%>
	<div align="center">
		<c:if test="${user != null}">
			<p>Seja bem vindo Sr. <Strong>${user}</Strong>
		</c:if>
	</div>
		<div align="center">
		<c:if test="${user != null}">
			<p>Nome <Strong>${client.name}</Strong>
			<p>Email <Strong>${client.email}</Strong>
			<p>Fone <Strong>${client.phone}</Strong>
		</c:if>
	</div>
</body>
</html>
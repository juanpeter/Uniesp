package br.com.bank.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String user = request.getParameter("user");
		String password = request.getParameter("password");
		
		if (user.equals("joaoPedro") && password.equals("123456")) {
			response.sendRedirect("index.html");
		} else {
			response.sendRedirect("login.html");
		}
	}

}

package br.com.bank.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.bank.model.Client;
import br.com.bank.service.ClientServiceImpl;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String user = request.getParameter("email");
		String password = request.getParameter("password");
		
		if (user.equals("cbgomes@gmail.com") && password.equals("123")) {
						
			RequestDispatcher rd = request.getRequestDispatcher("success.jsp");
			request.setAttribute("user", user);

			rd.forward(request, response);
			
		} else {
			RequestDispatcher rd = request.getRequestDispatcher("error.jsp");
			request.setAttribute("error", "Erro, Login ou senha inválido!");
			rd.forward(request, response);
		}
	}

}

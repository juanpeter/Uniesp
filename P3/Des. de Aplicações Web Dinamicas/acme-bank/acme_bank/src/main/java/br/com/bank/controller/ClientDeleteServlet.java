package br.com.bank.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.bank.service.ClientServiceImpl;

@WebServlet("/clientDeleteServlet")
public class ClientDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private ClientServiceImpl service;

    public ClientDeleteServlet() {
		this.service = new ClientServiceImpl();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher rd = request.getRequestDispatcher("list_clients.jsp");
		rd.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println(request.getParameter("idCliente"));
		
		Long clientId = Long.parseLong(request.getParameter("idCliente"));
		
		this.service.deleteById(clientId);
		
		
	}

}

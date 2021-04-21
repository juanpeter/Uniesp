package br.com.bank.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.bank.model.Client;
import br.com.bank.service.ClientServiceImpl;


@WebServlet("/clientListServlet")
public class ClientListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private ClientServiceImpl service;

	public ClientListServlet() {
		this.service = new ClientServiceImpl();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Client> listaClientes = this.service.getAll();
		
		request.setAttribute("listaClientes", listaClientes);
		
		RequestDispatcher rd = request.getRequestDispatcher("list_clients.jsp");
		rd.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

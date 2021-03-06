package br.com.bank.service;

import java.util.List;

import br.com.bank.model.Client;

public interface ClientService {

	public Client getClient(String nome);
	
	public List<Client> getAll();
	
	public boolean save(Client client);
	
	public void deleteById(Long idClient);
}

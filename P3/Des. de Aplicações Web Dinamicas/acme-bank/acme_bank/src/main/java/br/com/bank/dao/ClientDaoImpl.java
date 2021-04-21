package br.com.bank.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.servlet.RequestDispatcher;

import br.com.bank.model.Client;
import br.com.bank.util.JPAUtil;

public class ClientDaoImpl implements ClientDao {

	@Override
	public Client getClient(String name) {
		// Entidade que administra o banco de dados
		EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
		// transação: Processo no qual a aplicação irá abrir conexão com o bd e o fecha
		entityManager.getTransaction().begin();
		
		try {
			Client client = entityManager.createNamedQuery("Client.getByName", Client.class)
					.setParameter("name", name)
					.getSingleResult();
			
			return client;
			
		} catch (NoResultException e){
			e.getMessage();
			entityManager.close();
			
			return null;
		}
		
	}

	@Override
	public List<Client> getAll() {
		EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
		entityManager.getTransaction().begin();
		
		try {
			List<Client> listaClientes = entityManager.createNamedQuery("Client.getAll", Client.class)
					.getResultList();
			
			return listaClientes;
			
		} catch (NoResultException e){
			e.getMessage();
			entityManager.close();
			
			return null;
		}
		
	}

	@Override
	public boolean save(Client client) {
		EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
		entityManager.getTransaction().begin();
		
		if (!checkExistingByEmail(client) && !checkExistingByPhone(client)) {
			try {					
					
				entityManager.persist(client);
				entityManager.getTransaction().commit();

				entityManager.close();
				return true;
				
			} catch (NoResultException e){
				e.getMessage();
				entityManager.close();
				return false;
			}

		}
		return false;
	}

	@Override
	public void deleteById(Long idClient) {
		EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
		entityManager.getTransaction().begin();
		
		try {
			Client deletedClient = entityManager.find(Client.class, idClient);
			entityManager.remove(deletedClient);
			entityManager.getTransaction().commit();
			entityManager.close();
						
		} catch (NoResultException e){
			e.getMessage();
			entityManager.close();			
		}
		
	}
	
	public boolean checkExistingByEmail(Client client) {
		EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
		entityManager.getTransaction().begin();
		
		try {
			entityManager.createNamedQuery("Client.getByEmail", Client.class)
			.setParameter("email", client.getEmail())
			.getSingleResult();
			return true;
		} catch (NoResultException e){
			return false;
		}
	}
	
	public boolean checkExistingByPhone(Client client) {
		EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
		entityManager.getTransaction().begin();
		try {
			entityManager.createNamedQuery("Client.getByPhone", Client.class)
			.setParameter("phone", client.getPhone())
			.getSingleResult();	
			return true;
		} catch (NoResultException e){
			return false;
		} 
	}

}

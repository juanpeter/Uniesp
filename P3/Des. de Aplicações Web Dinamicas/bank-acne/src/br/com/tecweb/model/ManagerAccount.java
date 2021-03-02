package br.com.tecweb.model;

public class ManagerAccount {
	// escrever "main" + crtl + SPACE cria esse método automaticamente
	public static void main(String[] args) {
		
		// Instanciando a classe Client
		Client client = new Client();
		client.setId(1L);
		client.setEmail("jpedro@gmail.com");
		client.setName("João Pedro");
		client.setPhone("988073482");
		
		Account account = new Account();
		
		account.setId(1L);
		account.setAgency(001);
		account.setNumber(100);
		account.setClient(client);
		account.setBalance(9000.00);
		
		System.out.println(client);
		System.out.println(account);
	}
}

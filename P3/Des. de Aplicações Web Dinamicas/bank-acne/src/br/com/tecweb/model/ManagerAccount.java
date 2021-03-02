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
		account.setBalance(1000.00);
		
		Client client2 = new Client();
		client2.setId(2L);
		client2.setEmail("sarah@gmail.com");
		client2.setName("Sarah Gabriela");
		client2.setPhone("988073483");
		
		Account account2 = new Account();
		account2.setId(2L);
		account2.setAgency(001);
		account2.setNumber(102);
		account2.setClient(client);
		account2.setBalance(1000.00);
		
		account.transfer(account2, 2000.00);
		
		System.out.println(account.getBalance());
		System.out.println(account2.getBalance());
	}
}

/**
 * 
 */
package br.com.tecweb.model;

/**
 * @author cbgomes
 *
 */
public class Main {

	public static void main(String[] args) {
		
		Client client = new Client();
		client.setId(1L);
		client.setName("João da Silva");
		client.setEmail("joaosilva@gmail.com");
		client.setPhone("83 9 9126-7778");
		System.out.println(client.toString());
				
		AccountSavings accountSavings = new AccountSavings();
		accountSavings.setClient(client);
		accountSavings.setId(1L);
		accountSavings.setNumber("0001-x");
		accountSavings.setAgency("Banco tecweb");
		accountSavings.setBalance(4000.00);
		accountSavings.setSavingsInterest(0.008);
		accountSavings.setWithdrawLimit(600.00);
		accountSavings.setSavingsBalance(0.0);
		
		accountSavings.depositSavings(800.00);
		System.out.println(accountSavings.nextMonthInterest());
			
		accountSavings.withdrawSavings(400.00);
		System.out.println(accountSavings.nextMonthInterest());
		
		System.out.println(accountSavings.toString());
		
		accountSavings.depositar(2000.00);
		System.out.println(accountSavings.getBalance());
		
		AccountChecking accountChecking = new AccountChecking();
		accountChecking.setClient(client);
		accountChecking.setId(1L);
		accountChecking.setNumber("0001-x");
		accountChecking.setAgency("Banco tecweb");
		accountChecking.setBalance(4000.00);
		accountChecking.setMonthlyTax(4.00);
		
		System.out.println(accountChecking.toString());
		
		accountChecking.sacar(2000.00);
		System.out.println(accountChecking.getBalance());
		
		accountChecking.transferir(accountSavings, 300.00);
		System.out.println(accountChecking.getBalance());
		System.out.println(accountSavings.getBalance());
		
	}

}

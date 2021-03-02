package br.com.tecweb.model;

import lombok.Data;

@Data
public class Account {
	
	private Long id;
	private Integer number;
	private Integer agency;
	private Client client;
	private Double balance;
	
	//Depositar valores (x)
	//Sacar valores (x)
	//Pix???
	//Transferência entre contas
	//Pagamentos
	
	public void deposit(Double value) {
		this.balance += value;
		
		System.out.println("Depósito de R$" + value + " realizado\nSeu saldo atual é de R$" + this.balance);
	}
	
	public void withdraw(Double value) {
		if (this.balance <= value) {
			System.out.println("Você não possui saldo o suficiente para efetuar o saque de R$" + value + "\nSeu saldo atual é de R$" + this.balance);
		} else {
			this.balance -= value;
			System.out.println("Saque de R$" + value + " realizado\nSeu saldo atual é de R$" + this.balance);
		}
	}
	
	public void transfer(Account receiver, Double value) {
		if (this.balance <= value) {
			System.out.println("Você não possui saldo o suficiente para efetuar a transferência de R$" + value + "\nSeu saldo atual é de R$" + this.balance);
		} else {
			this.setBalance(this.balance - value);
			receiver.setBalance(this.balance + value);
			System.out.println("Trasferencia realizada com sucesso!");
		}
	}
}

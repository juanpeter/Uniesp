/**
 * 
 */
package br.com.tecweb.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import lombok.Data;

import br.com.tecweb.utils.Util;

/**
 * @author cbgomes
 *
 */
@Data
public abstract class Account {

	private Long id;
	private String number;
	private String agency;
	private Double balance;
	private Client client;
	private List<Transaction> transactions = new ArrayList<Transaction>();

	public Double sacar(Double value) {
		if (this.balance >= value) {
			this.balance -= value;
		}
		this.transactions.add(Transaction.createTransaction(this, value, "Saque", LocalDateTime.now()));
		return this.balance;
	}

	public Double depositar(Double value) {
		this.transactions.add(Transaction.createTransaction(this, value, "Deposito", LocalDateTime.now()));
		return this.balance += value;
	}

	public Double transferir(Account account, Double value) {
		if (this.balance >= value) {
			this.sacar(value);
			account.depositar(value);
		}
		this.transactions.add(Transaction.createTransaction(this, value, "Transferência", LocalDateTime.now()));
		return this.balance;
	}
	
	public List<Transaction> transacoes(){
		return this.transactions;
	}


}









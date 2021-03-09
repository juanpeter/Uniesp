package br.com.tecweb.model;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class AccountSavings extends Account {

	private Double savingsBalance;
	private Double savingsInterest;
	private Double withdrawLimit;
	
	public Double withdrawSavings(Double withdrawValue) {
		if (this.savingsBalance > withdrawValue && this.withdrawLimit > withdrawValue) {
			this.savingsBalance -= withdrawValue;
			this.transacoes().add(Transaction.createTransaction(this, withdrawValue, "Saque na poupança", LocalDateTime.now()));
		}
		
		return this.getSavingsBalance();
	}

	public Double depositSavings(Double depositValue) {
		if (this.getBalance() > depositValue) {
			this.setBalance(this.getBalance() - depositValue);
			this.savingsBalance += depositValue;
			this.transacoes().add(Transaction.createTransaction(this, depositValue, "Depósito na poupança", LocalDateTime.now()));
		}

		return this.getSavingsBalance();
	}
	
	public Double nextMonthInterest() {
		return this.getSavingsBalance() * this.getSavingsInterest();
		
	}
	
}

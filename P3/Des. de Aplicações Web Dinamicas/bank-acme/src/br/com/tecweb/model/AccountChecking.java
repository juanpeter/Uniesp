package br.com.tecweb.model;

import lombok.Data;

@Data
public class AccountChecking extends Account {

	private Double monthlyTax;
	
	public Double nextMonthTax() {
		return this.getBalance() - (this.getBalance() - this.getMonthlyTax());
	}
}

/**
 * 
 */
package br.com.tecweb.model;

import java.time.LocalDateTime;

import br.com.tecweb.utils.Util;
import lombok.Data;

/**
 * @author cbgomes
 *
 */
@Data
public class Transaction {

	private Account account;
	private Double value;
	private String typeTransaction;
	private String dataTimeTransaction;
	
	public static Transaction createTransaction(Account account, Double value, String typeTransaction,
			LocalDateTime localDateTime) {
		
		Transaction transaction = new Transaction();
		transaction.setAccount(account);
		transaction.setValue(value);
		transaction.setTypeTransaction(typeTransaction);
		transaction.setDataTimeTransaction(Util.formatDate(localDateTime.now()));
		
		return transaction;
	}
}

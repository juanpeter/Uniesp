package br.com.tecweb.model;

import lombok.Data;

@Data
public class Account {
	
	private Long id;
	private Integer number;
	private Integer agency;
	private Client client;
	private Double balance;
}

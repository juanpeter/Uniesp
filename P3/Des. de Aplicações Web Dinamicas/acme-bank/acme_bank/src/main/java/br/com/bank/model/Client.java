package br.com.bank.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.NamedQuery;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// Classe de domínio da Aplicação, modelo de persistência
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder


@Entity
@Table(name = "clients")
@NamedQuery(name = "Client.getByName", query = "select c from Client c where c.name = :name")
@NamedQuery(name = "Client.getByEmail", query = "select c from Client c where c.email = :email")
@NamedQuery(name = "Client.getByPhone", query = "select c from Client c where c.phone = :phone")
@NamedQuery(name = "Client.getAll", query = "select c from Client c")
public class Client {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String name;
	private String email;
	private String phone;
	private String password;
	
}

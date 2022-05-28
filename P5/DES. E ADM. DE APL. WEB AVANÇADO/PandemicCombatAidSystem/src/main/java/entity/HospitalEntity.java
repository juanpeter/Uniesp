package entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "HOSPITAL_ENTITY")
public class HospitalEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//Um hospital deve ter um nome, endereço, cnpj,
	//localização (latitude, longitude, etc.)
	private Long id;
	private String nome;
	private String endereco;
	private String cnpj;
	private String localizacao;
	
	//Ao adicionar o hospital, junto deve ser adicionado seus recursos atuais bem como seu percentual de ocupação.
	private String[] recursos;
	private Double percentualOcupacao;
}

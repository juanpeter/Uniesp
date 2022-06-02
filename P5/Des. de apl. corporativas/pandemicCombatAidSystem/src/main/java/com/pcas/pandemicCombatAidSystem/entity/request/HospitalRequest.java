package com.pcas.pandemicCombatAidSystem.entity.request;

import lombok.Data;

@Data
public class HospitalRequest {

	private Long id;
	private String nome;
	private String endereco;
	private String cnpj;
	private String localizacao;	
	private Double percentualOcupacao;
}

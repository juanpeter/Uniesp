package com.pcas.pandemicCombatAidSystem.entity.response;

import lombok.Data;

@Data
public class HospitalResponse {

	private Long id;
	private String nome;
	private String endereco;
	private String cnpj;
	private String localizacao;
	private String[] recursos;
	private Double percentualOcupacao;
}

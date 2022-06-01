package com.pcas.pandemicCombatAidSystem.entity.request;

import java.util.List;

import com.pcas.pandemicCombatAidSystem.entity.RecursoEntity;

import lombok.Data;

@Data
public class IntercambioRequest {

	private Long hospital1Id;
	private List<RecursoEntity> oferta1;
	private Long hospital2Id;
	private List<RecursoEntity> oferta2;
}

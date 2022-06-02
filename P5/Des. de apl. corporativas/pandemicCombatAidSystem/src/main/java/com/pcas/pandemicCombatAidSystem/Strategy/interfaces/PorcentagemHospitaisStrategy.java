package com.pcas.pandemicCombatAidSystem.Strategy.interfaces;

import java.util.List;

import com.pcas.pandemicCombatAidSystem.entity.HospitalEntity;

public interface PorcentagemHospitaisStrategy {
	
	public Double calcularPorcentagem(List<HospitalEntity> listaHospitais);

}
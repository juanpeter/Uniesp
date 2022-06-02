package com.pcas.pandemicCombatAidSystem.Strategy.interfaces;

import java.util.List;

import com.pcas.pandemicCombatAidSystem.entity.HospitalEntity;

public interface HospitalLotadoTempoStrategy {

	public HospitalEntity tempoLotado(List<HospitalEntity> listaHospitais);
}

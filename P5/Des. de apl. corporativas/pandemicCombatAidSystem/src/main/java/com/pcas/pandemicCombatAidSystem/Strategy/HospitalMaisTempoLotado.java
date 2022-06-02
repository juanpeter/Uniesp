package com.pcas.pandemicCombatAidSystem.Strategy;

import java.sql.Date;
import java.util.List;

import com.pcas.pandemicCombatAidSystem.Strategy.interfaces.HospitalLotadoTempoStrategy;
import com.pcas.pandemicCombatAidSystem.entity.HospitalEntity;

public class HospitalMaisTempoLotado implements HospitalLotadoTempoStrategy {

	@Override
	public HospitalEntity tempoLotado(List<HospitalEntity> listaHospitais) {
		
		HospitalEntity entity = new HospitalEntity();
		entity.setUltimaAtualizacao(new Date(0));
		
		for (HospitalEntity i : listaHospitais) {
			if (i.getPercentualOcupacao() >= 90.00 
					&& entity.getUltimaAtualizacao().compareTo(i.getUltimaAtualizacao()) < 0 ) {
					entity = i;
			}
		}
		
		return entity;
	}

}

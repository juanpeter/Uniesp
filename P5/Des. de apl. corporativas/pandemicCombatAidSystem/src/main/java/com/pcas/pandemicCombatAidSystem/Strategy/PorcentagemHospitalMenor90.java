package com.pcas.pandemicCombatAidSystem.Strategy;

import java.util.List;

import com.pcas.pandemicCombatAidSystem.Strategy.interfaces.PorcentagemHospitaisStrategy;
import com.pcas.pandemicCombatAidSystem.entity.HospitalEntity;

public class PorcentagemHospitalMenor90 implements PorcentagemHospitaisStrategy {

	@Override
	public Double calcularPorcentagem(List<HospitalEntity> listaHospitais) {
		
		Double count = 0.0;
				
		for (HospitalEntity i : listaHospitais) {
			if (i.getPercentualOcupacao() <= 90.00) {
				count = count + 1;
			}
		}
		
		return (Double) ((count/listaHospitais.size())*100);
	}
}
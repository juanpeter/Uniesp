package com.pcas.pandemicCombatAidSystem.service;

import java.sql.Date;
import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.pcas.pandemicCombatAidSystem.Strategy.HospitalMaisTempoLotado;
import com.pcas.pandemicCombatAidSystem.Strategy.HospitalMenosLotadoTempo;
import com.pcas.pandemicCombatAidSystem.Strategy.PorcentagemHospitalMaior90;
import com.pcas.pandemicCombatAidSystem.Strategy.PorcentagemHospitalMenor90;
import com.pcas.pandemicCombatAidSystem.Strategy.interfaces.HospitalLotadoTempoStrategy;
import com.pcas.pandemicCombatAidSystem.Strategy.interfaces.PorcentagemHospitaisStrategy;
import com.pcas.pandemicCombatAidSystem.entity.HospitalEntity;
import com.pcas.pandemicCombatAidSystem.repository.HospitalRepository;
import com.pcas.pandemicCombatAidSystem.utils.ConvertUtils;

@Service
public class RelatorioService {

	private final HospitalRepository hr;
	private final ConvertUtils convertUtils;
	
	public RelatorioService(HospitalRepository hr, ConvertUtils convertUtils) {
		this.convertUtils = convertUtils;
		this.hr = hr;
	}
	//Aplicando Strategy
	public Double porcentagemHospitaisMaior90() {
		
		PorcentagemHospitaisStrategy phs = new PorcentagemHospitalMaior90();
		
		List<HospitalEntity> hospitalList = this.hr.findAll();

		Double percentual = phs.calcularPorcentagem(hospitalList);

		return percentual;
	}
	
	public Double porcentagemHospitaisMenor90() {
		
		PorcentagemHospitaisStrategy phs = new PorcentagemHospitalMenor90();
		
		List<HospitalEntity> hospitalList = this.hr.findAll();

		Double percentual = phs.calcularPorcentagem(hospitalList);

		return percentual;
	}
	
	public HospitalEntity hospitalMaisTempoLotado() {
		
		HospitalLotadoTempoStrategy hlt = new HospitalMaisTempoLotado();
		
		List<HospitalEntity> hospitalList = this.hr.findAll();

		HospitalEntity hospital = hlt.tempoLotado(hospitalList);
		
		return hospital;
	}
	
	public HospitalEntity hospitalMenosLotadoTempo() {
		
		HospitalLotadoTempoStrategy hlt = new HospitalMenosLotadoTempo();
		
		List<HospitalEntity> hospitalList = this.hr.findAll();

		HospitalEntity hospital = hlt.tempoLotado(hospitalList);
		
		return hospital;
	
	}
}

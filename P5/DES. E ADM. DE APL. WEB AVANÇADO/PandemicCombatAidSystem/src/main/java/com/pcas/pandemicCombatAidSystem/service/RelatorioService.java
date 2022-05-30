package com.pcas.pandemicCombatAidSystem.service;

import java.sql.Date;
import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

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
	
	public Double porcentagemHospitaisMaior90() {
		
		Double count = 0.0;
		
		List<HospitalEntity> hospitalList = this.hr.findAll();
		
		for (HospitalEntity i : hospitalList) {
			if (i.getPercentualOcupacao() >= 90.00) {
				count = count + 1;
			}
		}
		
		return (Double) ((count/hospitalList.size())*100);

	}
	
	public Double porcentagemHospitaisMenor90() {
		
		Double count = 0.0;
		
		List<HospitalEntity> hospitalList = this.hr.findAll();
		
		for (HospitalEntity i : hospitalList) {
			if (i.getPercentualOcupacao() < 90.00) {
				count = count + 1;
			}
		}
		
		return (Double) ((count/hospitalList.size())*100);

	}
	
	public HospitalEntity hospitalMaisTempoLotado() {
		
		HospitalEntity entity = new HospitalEntity();
		entity.setUltimaAtualizacao(new Date(0));
				
		List<HospitalEntity> hospitalList = this.hr.findAll();
		
		for (HospitalEntity i : hospitalList) {
			if (i.getPercentualOcupacao() >= 90.00 
					&& entity.getUltimaAtualizacao().compareTo(i.getUltimaAtualizacao()) < 0 ) {
					entity = i;
			}
		}
		
		return entity;
	}
	
	public HospitalEntity hospitalMenosLotadoTempo() {
		
		HospitalEntity entity = new HospitalEntity();
		entity.setUltimaAtualizacao(new Date(0));
				
		List<HospitalEntity> hospitalList = this.hr.findAll();
		
		for (HospitalEntity i : hospitalList) {
			if (i.getPercentualOcupacao() <= 90.00 && entity.getUltimaAtualizacao().compareTo(i.getUltimaAtualizacao()) < 0) {
					entity = i;
			}

		}
		
		return entity;
	
	}
}

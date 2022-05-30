package com.pcas.pandemicCombatAidSystem.service;

import javax.persistence.EntityNotFoundException;

import org.springframework.stereotype.Service;

import com.pcas.pandemicCombatAidSystem.entity.HospitalEntity;
import com.pcas.pandemicCombatAidSystem.entity.request.HospitalRequest;
import com.pcas.pandemicCombatAidSystem.repository.HospitalRepository;
import com.pcas.pandemicCombatAidSystem.utils.ConvertUtils;

@Service
public class HospitalService {

	private final HospitalRepository hr;
	private final ConvertUtils convertUtils;
	
	public HospitalService(HospitalRepository hr, ConvertUtils convertUtils) {
		this.hr = hr;
		this.convertUtils = convertUtils;
	}
	
	public void salvar(HospitalRequest hospitalRequest) {
		this.hr.save(
				(HospitalEntity) convertUtils.convertRequestToEntity(hospitalRequest, HospitalEntity.class)
				);
	}
	
	public void atualizarPercentualOcupacao(HospitalRequest hospitalRequest, Long id) {
		
		HospitalEntity entity = this.hr.findById(id)
				.orElseThrow(() -> new EntityNotFoundException("Entity not found!"));
		
		entity.setPercentualOcupacao(hospitalRequest.getPercentualOcupacao());
		
		var entityUpdated = (HospitalEntity) convertUtils.convertRequestToEntity(entity, entity.getClass());
		
		entityUpdated.setId(id);
		this.hr.save(entityUpdated);
	}
	
}

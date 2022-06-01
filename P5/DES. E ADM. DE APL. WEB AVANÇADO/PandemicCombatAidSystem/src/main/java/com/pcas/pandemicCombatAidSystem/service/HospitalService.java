package com.pcas.pandemicCombatAidSystem.service;

import java.sql.Date;
import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.apache.tomcat.jni.Time;
import org.springframework.stereotype.Service;

import com.pcas.pandemicCombatAidSystem.entity.HospitalEntity;
import com.pcas.pandemicCombatAidSystem.entity.IntercambioEntity;
import com.pcas.pandemicCombatAidSystem.entity.RecursoEntity;
import com.pcas.pandemicCombatAidSystem.entity.request.HospitalRequest;
import com.pcas.pandemicCombatAidSystem.entity.request.IntercambioRequest;
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
	
	public void intercambioRecursos(IntercambioRequest ir) {
		HospitalEntity entity1 = this.hr.findById(ir.getHospital1Id())
				.orElseThrow(() -> new EntityNotFoundException("Entity not found!"));

		HospitalEntity entity2 = this.hr.findById(ir.getHospital2Id())
				.orElseThrow(() -> new EntityNotFoundException("Entity not found!"));
		
		if (entity1.getRecursos().containsAll(ir.getOferta1()) 
		&& entity2.getRecursos().containsAll(ir.getOferta2())) {
			
			int somatorio1 = 0;
			int somatorio2 = 0;
			
			for (RecursoEntity i : entity1.getRecursos()) {
				somatorio1 = somatorio1 + i.getPontos();
			}

			for (RecursoEntity i: entity2.getRecursos()) {
				somatorio2 = somatorio2 + i.getPontos();
			}
			
			if (somatorio1 == somatorio2) {
				List<RecursoEntity> entity1Resources = entity1.getRecursos();
				
				entity1Resources.removeAll(ir.getOferta1());
				entity1Resources.addAll(ir.getOferta2());
				
				List<RecursoEntity> entity2Resources = entity2.getRecursos();
				
				entity2Resources.removeAll(ir.getOferta2());
				entity2Resources.addAll(ir.getOferta1());
				
				IntercambioEntity intercambio1 = new IntercambioEntity();
				intercambio1.setIntercambioTimestamp(new Date(Time.now()));
				intercambio1.setRecursosTrocados(ir.getOferta1());
				IntercambioEntity intercambio2 = new IntercambioEntity();
				intercambio2.setIntercambioTimestamp(new Date(Time.now()));
				intercambio2.setRecursosTrocados(ir.getOferta2());
				
				entity1.setRecursos(entity1Resources);
				entity1.getHistoricoIntercambio().add(intercambio1);
				entity1.setId(entity1.getId());
				this.hr.save(entity1);
				
				entity2.setRecursos(entity2Resources);
				entity2.getHistoricoIntercambio().add(intercambio2);
				entity2.setId(entity2.getId());
				this.hr.save(entity2);
			}
		}

	}
	
}

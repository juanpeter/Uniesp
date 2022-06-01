package com.pcas.pandemicCombatAidSystem.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.stereotype.Service;

import com.pcas.pandemicCombatAidSystem.entity.HospitalEntity;
import com.pcas.pandemicCombatAidSystem.entity.IntercambioEntity;
import com.pcas.pandemicCombatAidSystem.entity.RecursoEntity;
import com.pcas.pandemicCombatAidSystem.entity.request.HospitalRequest;
import com.pcas.pandemicCombatAidSystem.entity.request.IntercambioRequest;
import com.pcas.pandemicCombatAidSystem.repository.HospitalRepository;
import com.pcas.pandemicCombatAidSystem.repository.IntercambioRepository;
import com.pcas.pandemicCombatAidSystem.utils.ConvertUtils;

@Service
public class HospitalService {

	private final HospitalRepository hr;
	private final ConvertUtils convertUtils;
	private final IntercambioRepository ir;
	
	public HospitalService(HospitalRepository hr, IntercambioRepository ir, ConvertUtils convertUtils) {
		this.hr = hr;
		this.convertUtils = convertUtils;
		this.ir = ir;
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
		//Checar existência das entidades, retornar elas
		HospitalEntity entity1 = this.hr.findById(ir.getHospital1Id())
				.orElseThrow(() -> new EntityNotFoundException("Entity not found!"));

		HospitalEntity entity2 = this.hr.findById(ir.getHospital2Id())
				.orElseThrow(() -> new EntityNotFoundException("Entity not found!"));
		
		List<RecursoEntity> checklist1 = new ArrayList<RecursoEntity>();
		
		for (int i = 0; i <= ir.getOferta1().size() -1; i ++) {
			for (int j = 0; j <= entity1.getRecursos().size() -1; j++) {
				if (entity1.getRecursos().get(j).getId().equals(ir.getOferta1().get(i).getId())) {
					checklist1.add(ir.getOferta1().get(i));
				}
			}
		}
		
		List<RecursoEntity> checklist2 = new ArrayList<RecursoEntity>();

		for (int i = 0; i <= ir.getOferta2().size() -1; i ++) {
			for (int j = 0; j <= entity2.getRecursos().size() -1; j++) {
				if (entity2.getRecursos().get(j).getId().equals(ir.getOferta2().get(i).getId())) {
					checklist2.add(ir.getOferta2().get(i));
				}
			}
		}
		
		//Checar se itens da oferta existem dentro das entidades
		if (
				checklist1.size() == ir.getOferta1().size() 
				&& checklist2.size() == ir.getOferta2().size()
		) {
			
			int somatorio1 = 0;
			int somatorio2 = 0;
			
			for (RecursoEntity i : ir.getOferta1()) {
				somatorio1 = somatorio1 + i.getPontos();
			}

			for (RecursoEntity i: ir.getOferta2()) {
				somatorio2 = somatorio2 + i.getPontos();
			}
			
			if (somatorio1 == somatorio2) {
				List<RecursoEntity> entity1Resources = entity1.getRecursos();
				
				entity1Resources.removeAll(ir.getOferta1());
				entity1Resources.addAll(ir.getOferta2());
				
				List<RecursoEntity> entity2Resources = entity2.getRecursos();
				
				entity2Resources.removeAll(ir.getOferta2());
				entity2Resources.addAll(ir.getOferta1());
				
				Date timestamp = new Date();
				
				IntercambioEntity intercambio1 = new IntercambioEntity();
				intercambio1.setIntercambioTimestamp(timestamp);
				intercambio1.setRecursosTrocados(ir.getOferta1());
				IntercambioEntity intercambio2 = new IntercambioEntity();
				intercambio2.setIntercambioTimestamp(timestamp);
				intercambio2.setRecursosTrocados(ir.getOferta2());
				
				this.ir.save(intercambio1);
				this.ir.save(intercambio2);
				
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

package com.projeto.dawa.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.projeto.dawa.entity.DawaEntity;
import com.projeto.dawa.entity.request.DawaRequest;
import com.projeto.dawa.entity.response.DawaResponse;
import com.projeto.dawa.exception.EntityNotFoundException;
import com.projeto.dawa.repository.DawaRepository;
import com.projeto.dawa.utils.ConvertUtils;

@Service
public class ServiceDawa {

	private final DawaRepository dawaRepository;
	private final ConvertUtils convertUtils;
	
	public ServiceDawa(DawaRepository dawaRepository, ConvertUtils convertUtils) {
		this.dawaRepository = dawaRepository;
		this.convertUtils = convertUtils;
	}
	
	public void salvaDawa(DawaRequest request) {
		this.dawaRepository.save(
				(DawaEntity) convertUtils.convertRequestToEntity(request, DawaEntity.class)
				);
	}
	
	
	public List<DawaResponse> listar() {
		return (List<DawaResponse>) convertUtils
				.convertToListResponse(this.dawaRepository.findAll(),
						DawaResponse.class);

	}
	
	public DawaResponse buscarPorId(Long id) {
		return (DawaResponse) convertUtils
				.convertEntityToResponse(this.dawaRepository.findById(id).get(),
						DawaResponse.class);
		
	}
	
	public void deletarPorId(Long id) {
		this.dawaRepository.deleteById(id);
	}
	
	public void atualizar(DawaRequest request, Long id) {
		
		var entity = this.dawaRepository.findById(id)
				.orElseThrow(() -> new EntityNotFoundException("Entity not found!"));
		
		var entityUpdated = (DawaEntity) convertUtils.convertRequestToEntity(request, entity.getClass());
		
		entityUpdated.setId(id);
		this.dawaRepository.save(entityUpdated);
	}
	
}

package com.projeto.dawa.service;

import org.springframework.stereotype.Service;

import com.projeto.dawa.entity.DawaEntity;
import com.projeto.dawa.repository.DawaRepository;

@Service
public class ServiceDawa {

	private final DawaRepository dawaRepository;
	
	public ServiceDawa(DawaRepository dawaRepository) {
		this.dawaRepository = dawaRepository;
	}
	
	public void salvaDawa(DawaEntity dawa) {
		this.dawaRepository.save(dawa);
	}
	
	
	
}

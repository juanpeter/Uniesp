package com.projeto.dawa.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.dawa.entity.DawaEntity;
import com.projeto.dawa.service.ServiceDawa;

@RestController
@RequestMapping("/api/dawa")
public class DawaController {
	
	public DawaController(ServiceDawa serviceDawa) {
		this.serviceDawa = serviceDawa;
	}
	
	public final ServiceDawa serviceDawa;


	@PostMapping
	public void salvar(DawaEntity dawa) {
		this.serviceDawa.salvaDawa(dawa);
	}
	
}

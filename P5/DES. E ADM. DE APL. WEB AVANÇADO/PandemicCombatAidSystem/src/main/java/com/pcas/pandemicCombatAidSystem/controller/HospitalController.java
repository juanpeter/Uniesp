package com.pcas.pandemicCombatAidSystem.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pcas.pandemicCombatAidSystem.entity.request.HospitalRequest;
import com.pcas.pandemicCombatAidSystem.service.HospitalService;

@RestController
@RequestMapping("/api/hospital")
public class HospitalController {

	public final HospitalService hs;
	
	public HospitalController(HospitalService hospitalService) {
		this.hs = hospitalService;
	}
	
//	MVP - REQUISITOS

//	Adicionar hospitais
//	Um hospital deve ter um nome, endereço, cnpj, localização (latitude, longitude, etc.).Ao adicionar o hospital, junto deve ser adicionado seus recursos atuais bem como seu percentual de ocupação.

	@PostMapping
	public ResponseEntity<?> salvar(@RequestBody HospitalRequest hospital) {
		this.hs.salvar(hospital);
		
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
	
//	Atualizar percentual de ocupação de um hospital.
//
//	Um hospital deve poder reportar seu percentual de ocupação a todo instante, de  forma que isso possa ser usado no processo de intercâmbio de recursos

	@PutMapping("atualizarPercentual/{id}")
	public ResponseEntity<?> atualizarPercentual(@RequestBody HospitalRequest hospitalRequest, @PathVariable Long id) {
		this.hs.atualizarPercentualOcupacao(hospitalRequest, id);
		
		return ResponseEntity.status(HttpStatus.ACCEPTED).build();
	}
	
//	Hospitais não podem Adicionar/Remover recursos
//
//	Os recursos dos hospitais só podem ser alterados via intercâmbio. Aquisição de recursos avulso será feita em outra API, pois requer um processo específico.
//	Intercâmbio de recursos
//
//	Os hospitais poderão trocar recursos entre eles. Para isso, eles devem respeitar a tabela de valores abaixo, onde o valor do recurso é descrito em termos de pontos. Ambos os hospitais deverão oferecer a mesma quantidade de pontos. 

}

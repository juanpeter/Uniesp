package com.pcas.pandemicCombatAidSystem.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pcas.pandemicCombatAidSystem.entity.HospitalEntity;
import com.pcas.pandemicCombatAidSystem.service.HospitalService;
import com.pcas.pandemicCombatAidSystem.service.RelatorioService;

@RestController
@RequestMapping("/api/relatorio")
public class RelatorioController {

	public final RelatorioService rs;
	
	public RelatorioController(RelatorioService rs) {
		this.rs = rs;
	}

	@GetMapping("porcentagemHospitais/maior90")
	public ResponseEntity<?> porcentagemHospitaisMaior90() {
		Double porcentagem = this.rs.porcentagemHospitaisMaior90();
		
		return new ResponseEntity<>(
				"Percentual de hospitais registrados com mais de 90% de ocupação " + porcentagem + "%", HttpStatus.OK);
	}

	@GetMapping("porcentagemHospitais/menor90")
	public ResponseEntity<?> porcentagemHospitaisMenor90() {
		Double porcentagem = this.rs.porcentagemHospitaisMenor90();
		
		return new ResponseEntity<>(
				"Percentual de hospitais registrados com menos de 90% de ocupação " + porcentagem + "%", HttpStatus.OK);
	}

	@GetMapping("hospitalLotadoMaisTempo")
	public ResponseEntity<?> hospitalMaisTempoLotado() {
		HospitalEntity hospital = this.rs.hospitalMaisTempoLotado();
		
		return new ResponseEntity<>(
				"O hospital com mais tempo em super-lotação é o " + hospital.getNome() + ", com super-lotação desde: " + hospital.getUltimaAtualizacao(), HttpStatus.OK);
	}
	@GetMapping("hospitalMenosLotadoMaisTempo")
	public ResponseEntity<?> hospitalMenosLotadoTempo() {
		HospitalEntity hospital = this.rs.hospitalMenosLotadoTempo();
		
		return new ResponseEntity<>(
				"O hospital com mais tempo sem super-lotação é o " + hospital.getNome() + ", sem estar super lotado desde: " + hospital.getUltimaAtualizacao(), HttpStatus.OK);
	}
}

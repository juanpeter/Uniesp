package com.projeto.dawa.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.dawa.entity.request.DawaRequest;
import com.projeto.dawa.service.ServiceDawa;

@RestController
@RequestMapping("/api/dawa")
public class DawaController {
	
	public DawaController(ServiceDawa serviceDawa) {
		this.serviceDawa = serviceDawa;
	}
	
	public final ServiceDawa serviceDawa;

	@PostMapping
	public ResponseEntity<?> salvar(@RequestBody DawaRequest dawa) {
		this.serviceDawa.salvaDawa(dawa);
		
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
	
	@GetMapping
	public ResponseEntity<?> listar() {
		return ResponseEntity.ok(this.serviceDawa.listar());
	}
	
	@GetMapping("/buscar_por_id/{id}")
	public ResponseEntity<?> buscarPorId(@PathVariable Long id) {
		try {
			return ResponseEntity.ok(this.serviceDawa.buscarPorId(id));
		} catch(Exception e){
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("/deletar/{id}")
	public ResponseEntity<?> deletarPorId(@PathVariable Long id) {
		try {
			this.serviceDawa.deletarPorId(id);
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		} catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PutMapping("/atualizar/{id}")
	public ResponseEntity<?> atualizar(@RequestBody DawaRequest dawa, @PathVariable Long id) {
		this.serviceDawa.atualizar(dawa, id);
		
		return ResponseEntity.status(HttpStatus.OK).build();
	}
}

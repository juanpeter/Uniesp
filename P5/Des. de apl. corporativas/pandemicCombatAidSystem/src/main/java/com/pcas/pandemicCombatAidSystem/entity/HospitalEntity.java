package com.pcas.pandemicCombatAidSystem.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;


@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "HOSPITAL_ENTITY")
public class HospitalEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String endereco;
	private String cnpj;
	private String localizacao;
    @OneToMany
    @JoinColumn(name = "recurso_id")
	private List<RecursoEntity> recursos;
	private Double percentualOcupacao;
	@UpdateTimestamp
	private Date ultimaAtualizacao;
	@OneToMany
    @JoinColumn(name = "hospitalId")
	private List<IntercambioEntity> historicoIntercambio;
}

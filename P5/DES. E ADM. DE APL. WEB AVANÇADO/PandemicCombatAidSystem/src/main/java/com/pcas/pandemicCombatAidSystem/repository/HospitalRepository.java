package com.pcas.pandemicCombatAidSystem.repository;

import org.springframework.stereotype.Repository;

import com.pcas.pandemicCombatAidSystem.entity.HospitalEntity;

import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface HospitalRepository extends JpaRepository<HospitalEntity, Long>{

	
}

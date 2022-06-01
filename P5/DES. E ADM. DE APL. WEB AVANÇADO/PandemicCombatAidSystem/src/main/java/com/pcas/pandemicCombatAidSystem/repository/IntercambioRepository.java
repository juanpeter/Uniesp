package com.pcas.pandemicCombatAidSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pcas.pandemicCombatAidSystem.entity.IntercambioEntity;


@Repository
public interface IntercambioRepository extends JpaRepository<IntercambioEntity, Long>{

}

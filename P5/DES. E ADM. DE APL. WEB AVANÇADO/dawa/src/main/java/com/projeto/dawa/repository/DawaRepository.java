package com.projeto.dawa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projeto.dawa.entity.DawaEntity;

@Repository
public interface DawaRepository extends JpaRepository<DawaEntity, Long> {

	
}

package com.spa.persona.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spa.persona.model.Ciudad;

public interface CiudadRepository extends JpaRepository<Ciudad, Long>{

}
package com.spa.persona.rest;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spa.persona.model.Ciudad;
import com.spa.persona.service.CiudadService;

@RestController
@RequestMapping ("/ciudades/")

public class CiudadRest {
	
	@Autowired
	private CiudadService ciudadService;
	
	@GetMapping ("{id}")
	private ResponseEntity<List<Ciudad>> getAllCiudadesByDepartamento (@PathVariable("id") Long idDepartamento){
		return ResponseEntity.ok(ciudadService.findAllByDepartamento(idDepartamento));
	}

}

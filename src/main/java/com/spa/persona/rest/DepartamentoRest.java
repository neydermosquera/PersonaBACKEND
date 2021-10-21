package com.spa.persona.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spa.persona.model.Departamento;
import com.spa.persona.service.DepartamentoService;

@RestController
@RequestMapping ("/departamentos/")
public class DepartamentoRest {
	
	@Autowired
	private DepartamentoService departamentoService;
	
	@GetMapping
	private ResponseEntity<List<Departamento>> getAllDepartamento(){
		return ResponseEntity.ok(departamentoService.findAll());
		
	}

}

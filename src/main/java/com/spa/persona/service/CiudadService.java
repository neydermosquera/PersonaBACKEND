package com.spa.persona.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.spa.persona.model.Ciudad;
import com.spa.persona.repository.CiudadRepository;


@Service
public class CiudadService implements CiudadRepository {
	
	@Autowired
	private CiudadRepository ciudadRepository;

	@Override
	public List<Ciudad> findAll() {
		return ciudadRepository.findAll();
	}

	@Override
	public List<Ciudad> findAll(Sort sort) {
		return ciudadRepository.findAll(sort);
	}
	
	public List<Ciudad> findAllByDepartamento(Long idDepartamento){
		List<Ciudad> ciudadesRespuesta = new ArrayList<>();
		List<Ciudad> ciudades = ciudadRepository.findAll();
		for (int i=0; i<ciudades.size(); i++) {
			if(ciudades.get(i).getDepartamento().getId()==idDepartamento) {
				ciudadesRespuesta.add(ciudades.get(i));
			}
		}
		
		return ciudadesRespuesta;
	}

	@Override
	public List<Ciudad> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Ciudad> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends Ciudad> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Ciudad> List<S> saveAllAndFlush(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllInBatch(Iterable<Ciudad> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllByIdInBatch(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Ciudad getOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ciudad getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Ciudad> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Ciudad> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Ciudad> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Ciudad> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Ciudad> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Ciudad entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllById(Iterable<? extends Long> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Ciudad> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends Ciudad> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Ciudad> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Ciudad> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends Ciudad> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}
}

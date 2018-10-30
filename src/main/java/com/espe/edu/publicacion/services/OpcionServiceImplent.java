package com.espe.edu.publicacion.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.espe.edu.publicacion.dao.OpcionDao;
import com.espe.edu.publicacion.model.Opcion;

@Service
public  class OpcionServiceImplent implements OpcionService {
	
	
	
	@Autowired
	protected  OpcionDao opcionDao;
	
	@Override
	public Opcion save (Opcion opcion) {
		return this.opcionDao.save(opcion);
		
	}
	
	@Override
	public List<Opcion> findAll() {
		return this.opcionDao.findAll();
	}
	
	@Override
	public Optional<Opcion> findbyId(long opcId) {
		return this.opcionDao.findById(opcId);
	}
	@Override
	public void deleteOpcion (long opcId) {
		this.opcionDao.deleteById(opcId);	
	}
	}
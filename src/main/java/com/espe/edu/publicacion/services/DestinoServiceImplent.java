package com.espe.edu.publicacion.services;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.espe.edu.publicacion.dao.DestinoDao;
import com.espe.edu.publicacion.model.Destino;


@Service
public  class DestinoServiceImplent implements DestinoService {
	
	
	
	@Autowired
	protected  DestinoDao destinoDao;
	
	@Override
	public Destino save(Destino destino) {
		return this.destinoDao.save(destino);
		
	}
	
	@Override
	public List<Destino> findAll() {
		return this.destinoDao.findAll();
	}
	
	@Override
	public Optional<Destino> findbyId(long desId) {
		return this.destinoDao.findById(desId);
	}
	@Override
	public void deleteDestino(long desId) {
		this.destinoDao.deleteById(desId);	
	}
}
package com.espe.edu.publicacion.services;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.espe.edu.publicacion.dao.MultimediaDao;
import com.espe.edu.publicacion.model.Multimedia;


@Service
public  class MultimediaServiceImplement implements MultimediaService {
	
	
	
	@Autowired
	protected  MultimediaDao multimediaDao;
	
	@Override
	public Multimedia save(Multimedia multimedia) {
		return this.multimediaDao.save(multimedia);
		
	}
	
	@Override
	public List<Multimedia> findAll() {
		return this.multimediaDao.findAll();
	}
	
	@Override
	public Optional<Multimedia> findbyId(long mulId) {
		return this.multimediaDao.findById(mulId);
	}
	@Override
	public void deleteMultimedia(long mulId) {
		this.multimediaDao.deleteById(mulId);	
	}
}
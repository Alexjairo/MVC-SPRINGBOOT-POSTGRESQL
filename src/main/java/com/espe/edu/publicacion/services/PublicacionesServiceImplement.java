package com.espe.edu.publicacion.services;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.espe.edu.publicacion.dao.PublicacionesDao;
import com.espe.edu.publicacion.model.Publicaciones;


@Service
public  class PublicacionesServiceImplement implements PublicacionesService {
	
	
	
	@Autowired
	protected  PublicacionesDao publicacionesDao;
	
	@Override
	public Publicaciones save(Publicaciones publicaciones) {
		return this.publicacionesDao.save(publicaciones);
		
	}
	
	@Override
	public List<Publicaciones> findAll() {
		return this.publicacionesDao.findAll();
	}
	
	@Override
	public Optional<Publicaciones> findbyId(long pubId) {
		return this.publicacionesDao.findById(pubId);
	}
	@Override
	public void deletePublicaciones(long pubId) {
		this.publicacionesDao.deleteById(pubId);	
	}
}
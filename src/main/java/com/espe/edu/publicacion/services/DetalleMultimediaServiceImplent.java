package com.espe.edu.publicacion.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.espe.edu.publicacion.dao.DetalleDao;
import com.espe.edu.publicacion.model.DetalleMultimedia;

@Service
public class DetalleMultimediaServiceImplent implements DetalleMultimediaService {


	@Autowired
	protected  DetalleDao detalleDao;
	
	@Override
	public DetalleMultimedia save(DetalleMultimedia detalleMultimedia) {
		return this.detalleDao.save(detalleMultimedia);
		
	}
	
	@Override
	public List<DetalleMultimedia> findAll() {
		return this.detalleDao.findAll();
	}
	
	@Override
	public Optional<DetalleMultimedia> findbyId(long detId) {
		return this.detalleDao.findById(detId);
	}
	@Override
	public void deleteDetalleMultimedia(long detId) {
		this.detalleDao.deleteById(detId);	
	}
}
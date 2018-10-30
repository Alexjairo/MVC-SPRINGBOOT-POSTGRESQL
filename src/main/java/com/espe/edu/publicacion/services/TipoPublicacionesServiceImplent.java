package com.espe.edu.publicacion.services;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.espe.edu.publicacion.dao.TipoPublicacionesDao;
import com.espe.edu.publicacion.model.TipoPublicaciones;

@Service
public class TipoPublicacionesServiceImplent implements TipoPublicacionesService {

	@Autowired
	protected TipoPublicacionesDao tipoPublicacionesDao;

	@Override
	public TipoPublicaciones save(TipoPublicaciones tipoPublicaciones) {
		return this.tipoPublicacionesDao.save(tipoPublicaciones);
	
	}

	@Override
	public List<TipoPublicaciones> findAll() {
		return this.tipoPublicacionesDao.findAll();
	}

	@Override
	public Optional<TipoPublicaciones> findbyId(long desId) {
		return this.tipoPublicacionesDao.findById(desId);
	}

	@Override
	public void deleteTipoPublicaciones(long desId) {
		this.tipoPublicacionesDao.deleteById(desId);
	}

}

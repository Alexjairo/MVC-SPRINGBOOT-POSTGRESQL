/**
 * 
 */
/**
 * @author Admini
 *
 */
package com.espe.edu.publicacion.services;

import java.util.List;

import java.util.Optional;
import com.espe.edu.publicacion.model.TipoPublicaciones;

public interface TipoPublicacionesService{
	
	TipoPublicaciones save (TipoPublicaciones tipoPublicaciones);
	
	List<TipoPublicaciones> findAll();
	Optional<TipoPublicaciones> findbyId(long desId);
	
	void deleteTipoPublicaciones(long desId);
}
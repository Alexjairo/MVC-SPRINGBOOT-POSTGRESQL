
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

import com.espe.edu.publicacion.model.Opcion;


public interface OpcionService {
Opcion save (Opcion opcion);
	
	List<Opcion> findAll();
	Optional<Opcion> findbyId(long opcId);
	
	void deleteOpcion(long opcId);
}
